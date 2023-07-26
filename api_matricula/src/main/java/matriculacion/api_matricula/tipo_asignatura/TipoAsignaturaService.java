package matriculacion.api_matricula.tipo_asignatura;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class TipoAsignaturaService {
    @Autowired TipoAsignaturaRepository entityRepository;

    public TipoAsignatura save(TipoAsignatura entity){
        return entityRepository.save(entity);
    }

    public TipoAsignatura findById( Long id){
        return entityRepository.findById(id).orElse(new TipoAsignatura());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<TipoAsignatura> findAll(){
        return entityRepository.findAll();
    }
}
