package matriculacion.api_matricula.matricula;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class MatriculaService {
    @Autowired MatriculaRepository entityRepository;

    public Matricula save(Matricula entity){
        return entityRepository.save(entity);
    }

    public Matricula findById( Long id){
        return entityRepository.findById(id).orElse(new Matricula());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Matricula> findAll(){
        return entityRepository.findAll();
    }
}

