package pe.edu.cibertec.appcitahospital.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.appcitahospital.model.bd.Medico;
import pe.edu.cibertec.appcitahospital.service.IMedicoService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/medico")//Anadir recursos a nuestro URL
public class MedicoController {
    private IMedicoService iMedicoService;
    @GetMapping("/list")
    public String listarMedicos(Model model){
        model.addAttribute("medicos",
                iMedicoService.listarMedicos());
        return "backoffice/medico/frmmedico";
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Medico> listMedico(){
        return iMedicoService.listarMedicos();
    }
}
