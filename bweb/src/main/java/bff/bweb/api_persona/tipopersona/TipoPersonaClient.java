package bff.bweb.api_persona.tipopersona;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff.tipopersona", url = "http://localhost:8000/api/tipopersona")
public interface TipoPersonaClient {

    @GetMapping("/{id}/")
    TipoPersonaDTO findRTipoPersonaById(@PathVariable("id") Long id);

    @GetMapping("/pdf/{id}/")
    ResponseEntity<byte[]> pdfById( @PathVariable("id") Long id);

    @GetMapping("/")
    List<TipoPersonaDTO> findAll();

    @PostMapping("/") 
    TipoPersonaDTO save(TipoPersonaDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id")  Long id);

    @PutMapping("/{id}/")
    TipoPersonaDTO update(@PathVariable("id")  Long id, TipoPersonaDTO entity);

}