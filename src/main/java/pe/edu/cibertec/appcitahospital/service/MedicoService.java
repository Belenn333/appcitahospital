package pe.edu.cibertec.appcitahospital.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appcitahospital.model.bd.Medico;
import pe.edu.cibertec.appcitahospital.repository.MedicoRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class MedicoService  implements IMedicoService{

    private MedicoRepository medicoRepository;
    @Override
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }
}
