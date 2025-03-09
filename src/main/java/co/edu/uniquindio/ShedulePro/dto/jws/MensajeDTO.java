package co.edu.uniquindio.ShedulePro.dto.jws;

public record MensajeDTO<T>(
        boolean error,
        T respuesta
) {
}
