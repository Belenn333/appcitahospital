package pe.edu.cibertec.appcitahospital.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaciente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;
}
