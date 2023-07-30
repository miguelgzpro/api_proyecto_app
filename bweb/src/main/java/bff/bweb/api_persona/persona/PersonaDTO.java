package bff.bweb.api_persona.persona;





import bff.bweb.api_persona.tipopersona.TipoPersonaDTO;
import lombok.Data;

@Data

public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer cedula;
    private Integer telefono;
    private String semestre;
    private TipoPersonaDTO tipopersona;
}
