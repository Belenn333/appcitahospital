package pe.edu.cibertec.appcitahospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcitahospital.model.bd.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}

