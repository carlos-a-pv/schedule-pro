package co.edu.uniquindio.ShedulePro.services.interfaces;

import co.edu.uniquindio.ShedulePro.model.documents.ReporteNomina;

import java.util.List;

public interface PDFServicio {
    byte[] generarReporteGeneral(List<ReporteNomina> reportes);
    byte[] generarReporteIndividual(ReporteNomina reporte);
}

