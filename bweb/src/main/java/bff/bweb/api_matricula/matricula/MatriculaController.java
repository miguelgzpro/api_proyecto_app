package bff.bweb.api_matricula.matricula;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bff.bweb.api_persona.persona.PersonaDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/matricula")
@CrossOrigin({"*"})
public class MatriculaController {

    @Autowired MatriculaClient client;

    @GetMapping("/")
    public List<MatriculaDTO> findAll() {
        return client.findAll();
    }
    
    @GetMapping("/{id}/")
    public MatriculaDTO findById(@PathVariable Long id){
        return client.findRMatriculaById(id);
    }

    @GetMapping("/pdf/{id}/")
    public ResponseEntity<byte[]> pdfById(@PathVariable Long id){
        return client.pdfById(id);
    }

    @PostMapping("/")
    public MatriculaDTO save(@RequestBody MatriculaDTO entity){
        return client.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        client.deleteById( id);
    }

    @PutMapping("/{id}/")
    public MatriculaDTO update(@PathVariable Long id, @RequestBody MatriculaDTO entity){
        return client.update( id, entity);
    }
    
    @PatchMapping("/{id}/")
    public MatriculaDTO partialUpdate(@PathVariable Long id, @RequestBody Map<String, Object> fields){

        MatriculaDTO MatriculaDTO = client.findRMatriculaById( id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = PersonaDTO.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(MatriculaDTO, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepción si ocurre algún error al acceder al campo
            }
        }
        return client.update( id, MatriculaDTO);
    }
}
