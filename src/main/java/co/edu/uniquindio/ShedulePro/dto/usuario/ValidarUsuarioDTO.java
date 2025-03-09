package co.edu.uniquindio.ShedulePro.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

public record ValidarUsuarioDTO (

        @Id String id,
        @NotBlank String codigo
){
}
