package matriculacion.api_matricula.tipo_asignatura;

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
@RequestMapping("api/tipoasignatura")
@CrossOrigin({"*"})
public class TipoAsignaturaController {
    @Autowired TipoAsignaturaService tipoAsignaturaService;

    @GetMapping("/")
    public List<TipoAsignatura> findAll(){
        return tipoAsignaturaService.findAll();
    }

    @GetMapping("/{id}/")
    public TipoAsignatura findById(@PathVariable Long id){
        return tipoAsignaturaService.findById(id);
    }

    @PostMapping("/")
    public TipoAsignatura save(@RequestBody TipoAsignatura entity){
        return tipoAsignaturaService.save(entity);
    }

    @PutMapping("/{id}/")
    public TipoAsignatura update(@RequestBody TipoAsignatura entity){
        return tipoAsignaturaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        tipoAsignaturaService.deleteById(id);
    }
}
