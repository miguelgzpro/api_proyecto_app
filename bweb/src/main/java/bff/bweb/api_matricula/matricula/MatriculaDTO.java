package bff.bweb.api_matricula.matricula;





import bff.bweb.api_matricula.asignatura.AsignaturaDTO;
import lombok.Data;

@Data

public class MatriculaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer cedula;
    private Integer telefono;
    private String semestre;
    private AsignaturaDTO asignatura;
}
