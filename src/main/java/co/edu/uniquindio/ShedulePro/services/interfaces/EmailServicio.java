package co.edu.uniquindio.ShedulePro.services.interfaces;

import co.edu.uniquindio.ShedulePro.dto.email.EmailDTO;

public interface EmailServicio {

    void enviarCorreo(EmailDTO emailDTO) throws Exception;

}
