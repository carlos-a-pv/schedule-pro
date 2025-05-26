package co.edu.uniquindio.ShedulePro.repositories;

import co.edu.uniquindio.ShedulePro.model.documents.ReporteNomina;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteNominaRepo extends MongoRepository<ReporteNomina, String> {

}
