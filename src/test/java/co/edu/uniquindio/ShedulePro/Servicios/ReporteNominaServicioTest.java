package co.edu.uniquindio.ShedulePro.Servicios;

import co.edu.uniquindio.ShedulePro.services.interfaces.ReporteNominaServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ReporteNominaServicioTest {
    @Autowired
    private ReporteNominaServicio reporteNominaServicio;

    @Test
    void generarReporteNominaGeneralTest() {
        assertDoesNotThrow(() -> {
            String resultado = reporteNominaServicio.generarReporteNominaGeneral();
            assertNotNull(resultado, "El resultado del reporte no debería ser nulo.");
        });
    }
}
