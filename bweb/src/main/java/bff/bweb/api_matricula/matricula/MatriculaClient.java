package bff.bweb.api_matricula.matricula;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@FeignClient(name = "bff.matricula", url = "http://localhost:8084/api/matricula")
public interface MatriculaClient {

    @GetMapping("/{id}/")
    MatriculaDTO findRMatriculaById(@PathVariable("id") Long id);

    @GetMapping("/pdf/{id}/")
    ResponseEntity<byte[]> pdfById( @PathVariable("id") Long id);

    @GetMapping("/")
    List<MatriculaDTO> findAll();

    @PostMapping("/") 
    MatriculaDTO save(MatriculaDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id")  Long id);

    @PutMapping("/{id}/")
    MatriculaDTO update(@PathVariable("id")  Long id, MatriculaDTO entity);

}