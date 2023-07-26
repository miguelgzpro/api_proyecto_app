package matriculacion.api_matricula.matricula;

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
@RequestMapping("api/matricula")
@CrossOrigin({"*"})
public class MatriculaController {
    @Autowired MatriculaService matriculaService;

    @GetMapping("/")
    public List<Matricula> findAll(){
        return matriculaService.findAll();
    }

    @GetMapping("/{id}/")
    public Matricula findById(@PathVariable Long id){
        return matriculaService.findById(id);
    }

    @PostMapping("/")
    public Matricula save(@RequestBody Matricula entity){
        return matriculaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Matricula update(@RequestBody Matricula entity){
        return matriculaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        matriculaService.deleteById(id);
    }
}
