package matriculacion.api_matricula.asignatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/asignatura")
@CrossOrigin({"*"})
public class AsignaturaController {
    @Autowired AsignaturaService asignaturaService;

    @GetMapping("/")
    public List<Asignatura> findAll(){
        return asignaturaService.findAll();
    }

    @GetMapping("/{id}/")
    public Asignatura findById(@PathVariable Long id){
        return asignaturaService.findById(id);
    }

    @PostMapping("/")
    public Asignatura save(@RequestBody Asignatura entity){
        return asignaturaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Asignatura update(@RequestBody Asignatura entity){
        return asignaturaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        asignaturaService.deleteById(id);
    }
}
