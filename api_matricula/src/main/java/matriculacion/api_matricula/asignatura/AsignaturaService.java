package matriculacion.api_matricula.asignatura;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class AsignaturaService {
    @Autowired AsignaturaRepository entityRepository;

    public Asignatura save(Asignatura entity){
        return entityRepository.save(entity);
    }

    public Asignatura findById( Long id){
        return entityRepository.findById(id).orElse(new Asignatura());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Asignatura> findAll(){
        return entityRepository.findAll();
    }
}
