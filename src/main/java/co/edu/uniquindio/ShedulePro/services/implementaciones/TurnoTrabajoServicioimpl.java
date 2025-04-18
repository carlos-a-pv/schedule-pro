package co.edu.uniquindio.ShedulePro.services.implementaciones;

import co.edu.uniquindio.ShedulePro.dto.turno.AsignarTurnoDTO;
import co.edu.uniquindio.ShedulePro.dto.turno.EditarTurnoDTO;
import co.edu.uniquindio.ShedulePro.dto.turno.EliminarTurnoDTO;
import co.edu.uniquindio.ShedulePro.dto.turno.ItemTurnoTrabajoDTO;
import co.edu.uniquindio.ShedulePro.services.interfaces.TurnoTrabajoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TurnoTrabajoServicioimpl implements TurnoTrabajoServicio {


    @Override
    public String asignarTurno(AsignarTurnoDTO asignarTurnoDTO) throws Exception {
        return "";
    }

    @Override
    public String eliminarTurno(EliminarTurnoDTO eliminarTurnoDTO) throws Exception {
        return "";
    }

    @Override
    public String editarTurno(String idTurno, EditarTurnoDTO editarTurnoDTO) throws Exception {
        return "";
    }

    @Override
    public List<ItemTurnoTrabajoDTO> listarTurnos() throws Exception {
        return List.of();
    }

    @Override
    public List<ItemTurnoTrabajoDTO> listarTurnosPorEmpleado(String idUsuario) throws Exception {
        return List.of();
    }
}

