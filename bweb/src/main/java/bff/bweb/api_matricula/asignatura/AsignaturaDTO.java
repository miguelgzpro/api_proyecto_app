package bff.bweb.api_matricula.asignatura;





import bff.bweb.api_matricula.tipoAsignatura.TipoAsignaturaDTO;
import lombok.Data;

@Data

public class AsignaturaDTO {
    private Long id;
    private String codigo;
        private String nombre;
    private Integer nro_credito;
   private TipoAsignaturaDTO tipoasignatura;
}
