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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
@Tag(name = "Controlador de la matricula")
@RestController
@RequestMapping("api/matricula")
@CrossOrigin({"*"})
public class MatriculaController {
    @Autowired MatriculaService matriculaService;

    @Operation(summary = "Consulta matriculas")
    @GetMapping("/")
    public List<Matricula> findAll(){
        return matriculaService.findAll();
    }
    @Operation(summary = "Consulta asignaturas por id")
    @GetMapping("/{id}/")
    public Matricula findById(@PathVariable Long id){
        return matriculaService.findById(id);
    }
    @Operation(summary = "Crea una matricula")
    @PostMapping("/")
    public Matricula save(@RequestBody Matricula entity){
        return matriculaService.save(entity);
    }
    @Operation(summary = "Cambia una matricula")
    @PutMapping("/{id}/")
    public Matricula update(@RequestBody Matricula entity){
        return matriculaService.save(entity);
    }
    @Operation(summary = "Elimina una matricula")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        matriculaService.deleteById(id);
    }
}
