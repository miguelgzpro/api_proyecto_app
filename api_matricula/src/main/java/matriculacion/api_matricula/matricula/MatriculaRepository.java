package matriculacion.api_matricula.matricula;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MatriculaRepository extends CrudRepository<Matricula, Long> {

    public List<Matricula> findAll();
}

