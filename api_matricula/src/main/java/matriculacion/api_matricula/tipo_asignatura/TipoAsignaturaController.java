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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Controlador del tipo de asignatura")
@RestController
@RequestMapping("api/tipoasignatura")
@CrossOrigin({"*"})
public class TipoAsignaturaController {
    @Autowired TipoAsignaturaService tipoAsignaturaService;

    @Operation(summary = "Consulta el tipo de asignatura")
    @GetMapping("/")
    public List<TipoAsignatura> findAll(){
        return tipoAsignaturaService.findAll();
    }

    @Operation(summary = "Consulta el tipo de asignatura por id")
    @GetMapping("/{id}/")
    public TipoAsignatura findById(@PathVariable Long id){
        return tipoAsignaturaService.findById(id);
    }

    @Operation(summary = "Crea un tipo de asignatura")
    @PostMapping("/")
    public TipoAsignatura save(@RequestBody TipoAsignatura entity){
        return tipoAsignaturaService.save(entity);
    }

    @Operation(summary = "Modifica un tipo de asignatura")
    @PutMapping("/{id}/")
    public TipoAsignatura update(@RequestBody TipoAsignatura entity){
        return tipoAsignaturaService.save(entity);
    }

    @Operation(summary = "Elimina un tipo de asignatura")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        tipoAsignaturaService.deleteById(id);
    }
}
