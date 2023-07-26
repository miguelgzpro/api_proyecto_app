package matriculacion.api_matricula.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import matriculacion.api_matricula.asignatura.Asignatura;

@Data
@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer cedula;
    private Integer telefono;
    private String semestre;

    @ManyToOne
    private Asignatura asignatura;
}
