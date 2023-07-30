package bff.bweb.api_persona.persona;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff.persona", url = "http://localhost:8000/api/persona")
public interface PersonaClient {

    @GetMapping("/{id}/")
    PersonaDTO findRPersonaById(@PathVariable("id") Long id);

    @GetMapping("/pdf/{id}/")
    ResponseEntity<byte[]> pdfById( @PathVariable("id") Long id);

    @GetMapping("/")
    List<PersonaDTO> findAll();

    @PostMapping("/") 
    PersonaDTO save(PersonaDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id")  Long id);

    @PutMapping("/{id}/")
    PersonaDTO update(@PathVariable("id")  Long id, PersonaDTO entity);

}