package co.edu.uniquindio.ShedulePro.controladores;

import co.edu.uniquindio.ShedulePro.dto.usuario.CrearUsuarioDTO;
import co.edu.uniquindio.ShedulePro.dto.usuario.LoginDTO;
import co.edu.uniquindio.ShedulePro.dto.usuario.ValidarUsuarioDTO;
import co.edu.uniquindio.ShedulePro.dto.jws.MensajeDTO;
import co.edu.uniquindio.ShedulePro.dto.jws.TokenDTO;
import co.edu.uniquindio.ShedulePro.services.interfaces.UsuarioServicio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AutenticacionController {
    private final UsuarioServicio usuarioServicio;

    @PostMapping("/iniciar-sesion")
    public ResponseEntity<MensajeDTO<TokenDTO>> iniciarSesion(@Valid @RequestBody LoginDTO loginDTO) throws Exception{
        TokenDTO token = usuarioServicio.iniciarSesion(loginDTO);
        return ResponseEntity.ok(new MensajeDTO<>(false, token));
    }
}
