package bff.bweb.api_persona.tipopersona;





import lombok.Data;

@Data

public class TipoPersonaDTO {
    private Long id;
    private String nombre;
    private String codigo;
    private Integer nro_credito;
    private Integer telefono;
    private String semestre;
}
