package pe.edu.cibertec.appcitahospital.model.bd;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcita;

    @Column(name = "fechacita")
    private Date fechacita;

    @Column(name = "horacita")
    private String horacita;

    @Column(name = "estadocita")
    private String estadocita;

    @ManyToOne
    @JoinColumn(name = "idmedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idpaciente")
    private Paciente paciente;
}