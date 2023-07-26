package matriculacion.api_matricula.asignatura;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import matriculacion.api_matricula.tipo_asignatura.TipoAsignatura;

@Data
@Entity
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
        private String nombre;
    private Integer nro_credito;

 @ManyToOne
    private TipoAsignatura tipoAsignatura;

}
