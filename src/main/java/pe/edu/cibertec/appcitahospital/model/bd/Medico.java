package pe.edu.cibertec.appcitahospital.model.bd;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicoid;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "horariolaboral")
    private String horariolaboral;
}