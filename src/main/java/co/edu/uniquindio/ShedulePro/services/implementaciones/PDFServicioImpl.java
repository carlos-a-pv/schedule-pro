package co.edu.uniquindio.ShedulePro.services.implementaciones;

import co.edu.uniquindio.ShedulePro.model.documents.ReporteNomina;
import co.edu.uniquindio.ShedulePro.services.interfaces.PDFServicio;
import com.itextpdf.io.source.ByteArrayOutputStream;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PDFServicioImpl implements PDFServicio {

    @Override
    public byte[] generarReporteGeneral(List<ReporteNomina> reportes) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(baos);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        document.add(new Paragraph("Reporte de Nómina General").setBold().setFontSize(18));
        document.add(new Paragraph("Fecha de generación: " + LocalDate.now().toString()));
        document.add(new Paragraph("\n"));

        Table table = new Table(new float[]{3, 4, 4, 2, 2, 2});
        table.setWidth(UnitValue.createPercentValue(100));
        table.addHeaderCell("Cédula");
        table.addHeaderCell("Nombre");
        table.addHeaderCell("Días trabajados");
        table.addHeaderCell("Horas");
        table.addHeaderCell("Valor hora");
        table.addHeaderCell("Salario total");

        for (ReporteNomina r : reportes) {
            table.addCell(r.getCedulaEmpleado());
            table.addCell(r.getNombreEmpleado());
            table.addCell(String.valueOf(r.getDiasTrabajados()));
            table.addCell(String.valueOf(r.getHorasTrabajadas()));
            table.addCell(String.valueOf(r.getValorHora()));
            table.addCell(String.valueOf(r.getSalarioTotal()));
        }

        document.add(table);
        document.close();

        return baos.toByteArray();
    }
    @Override
    public byte[] generarReporteIndividual(ReporteNomina reporte) {
        return null;
    }
}

