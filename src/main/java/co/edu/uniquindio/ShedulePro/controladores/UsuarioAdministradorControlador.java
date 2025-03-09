package co.edu.uniquindio.ShedulePro.controladores;


import co.edu.uniquindio.ShedulePro.dto.jws.MensajeDTO;
import co.edu.uniquindio.ShedulePro.dto.usuario.*;
import co.edu.uniquindio.ShedulePro.services.interfaces.UsuarioServicio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario/administrador")
@RequiredArgsConstructor
public class UsuarioAdministradorControlador {

    private final UsuarioServicio usuarioServicio;

    @PostMapping("crear-empleado")
    public ResponseEntity<MensajeDTO> crearEmpleado(@Valid @RequestBody CrearUsuarioDTO usuarioDTO) throws Exception {
        usuarioServicio.crearUsuario(usuarioDTO);
        return ResponseEntity.ok( new MensajeDTO<>(false, "Empleado creado correctamente"));
    }

    @PutMapping("editar-empleado")
    public ResponseEntity<MensajeDTO> editarEmpleado(@Valid @RequestBody EditarUsuarioDTO usuarioDTO) throws Exception {
        usuarioServicio.editarUsuario(usuarioDTO);
        return ResponseEntity.ok(new MensajeDTO<>(true, "Empleado editado correctamente"));
    }

    @DeleteMapping("eliminar-empleado")
    public ResponseEntity<MensajeDTO> eliminarEmpleado(@Valid @RequestBody EliminarUsuarioDTO usuarioDTO) throws Exception {
        usuarioServicio.eliminarUsuario(usuarioDTO.id());
        return ResponseEntity.ok(new MensajeDTO<>(true, "Empleado eliminado correctamente"));
    }

    @GetMapping ("obtener-empleado/{id}")
    public ResponseEntity<MensajeDTO<InformacionUsuarioDTO>> obtenerEmpleado(@PathVariable String id) throws Exception {
        InformacionUsuarioDTO info = usuarioServicio.obtenerUsuario(id);
        return ResponseEntity.ok(new MensajeDTO<>( false, info));
    }

    @GetMapping("listar-todo")
    public ResponseEntity<List<ItemUsuarioDTO>> listarUsuarios() throws Exception {
        List<ItemUsuarioDTO> usuarios = usuarioServicio.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }


}
