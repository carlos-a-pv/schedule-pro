package co.edu.uniquindio.ShedulePro.model.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("reporteNomina")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ReporteNomina {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String idEmpleado;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private int diasTrabajados;
    private int horasTrabajadas;
    private int valorHora;
    private int salarioTotal;
    private LocalDate fechaGeneracion;

    @Builder
    public ReporteNomina(String idEmpleado, String nombreEmpleado, String cedulaEmpleado, int diasTrabajados, int horasTrabajadas, int valorHora,
                         int salarioTotal, LocalDate fechaGeneracion) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.diasTrabajados = diasTrabajados;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.salarioTotal = salarioTotal;
        this.fechaGeneracion = fechaGeneracion;
    }
}
