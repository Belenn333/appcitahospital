package pe.edu.cibertec.appcitahospital.model.bd;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citaid;

    @Column(name = "fechacita")
    private Date fechacita;

    @Column(name = "horacita")
    private String horacita;

    @Column(name = "estadocita")
    private String estadocita;

    @ManyToOne
    @JoinColumn(name = "medicoid")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "pacienteid")
    private Paciente paciente;
}