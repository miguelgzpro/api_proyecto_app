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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
@Tag(name = "Controlador de la asignatura")
@RestController
@RequestMapping("api/asignatura")
@CrossOrigin({"*"})
public class AsignaturaController {
    @Autowired AsignaturaService asignaturaService;
    @Operation(summary = "Consulta asignaturas")

    @GetMapping("/")
    public List<Asignatura> findAll(){
        return asignaturaService.findAll();
    }
    @Operation(summary = "Consulta una sola asignatura por id")

    @GetMapping("/{id}/")
    public Asignatura findById(@PathVariable Long id){
        return asignaturaService.findById(id);
    }
    @Operation(summary = "Crea una asignatura")

    @PostMapping("/")
    public Asignatura save(@RequestBody Asignatura entity){
        return asignaturaService.save(entity);
    }
    @Operation(summary = "Cambios a una asignatura")

    @PutMapping("/{id}/")
    public Asignatura update(@RequestBody Asignatura entity){
        return asignaturaService.save(entity);
    }
    @Operation(summary = "Elimina una asignatura")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        asignaturaService.deleteById(id);
    }
}
