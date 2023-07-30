package bff.bweb.api_matricula.tipoAsignatura;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff.tipoasignatura", url = "http://localhost:8084/api/tipoasignatura")
public interface TipoAsignaturaClient {

    @GetMapping("/{id}/")
    TipoAsignaturaDTO findRipoAsignaturaById(@PathVariable("id") Long id);

    @GetMapping("/pdf/{id}/")
    ResponseEntity<byte[]> pdfById( @PathVariable("id") Long id);

    @GetMapping("/")
    List<TipoAsignaturaDTO> findAll();

    @PostMapping("/") 
    TipoAsignaturaDTO save(TipoAsignaturaDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id")  Long id);

    @PutMapping("/{id}/")
    TipoAsignaturaDTO update(@PathVariable("id")  Long id, TipoAsignaturaDTO entity);

}