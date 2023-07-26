package matriculacion.api_matricula.tipo_asignatura;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TipoAsignaturaRepository extends CrudRepository<TipoAsignatura, Long> {

    public List<TipoAsignatura> findAll();
}

