package bff.bweb.api_matricula.asignatura;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff.asignatura", url = "http://localhost:8084/api/asignatura")
public interface AsignaturaClient {

    @GetMapping("/{id}/")
    AsignaturaDTO findRAsignaturaById(@PathVariable("id") Long id);

    @GetMapping("/pdf/{id}/")
    ResponseEntity<byte[]> pdfById( @PathVariable("id") Long id);

    @GetMapping("/")
    List<AsignaturaDTO> findAll();

    @PostMapping("/") 
    AsignaturaDTO save(AsignaturaDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id")  Long id);

    @PutMapping("/{id}/")
    AsignaturaDTO update(@PathVariable("id")  Long id, AsignaturaDTO entity);

}