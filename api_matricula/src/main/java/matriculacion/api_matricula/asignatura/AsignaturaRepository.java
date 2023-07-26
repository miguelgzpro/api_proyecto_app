package matriculacion.api_matricula.asignatura;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {

    public List<Asignatura> findAll();
}

