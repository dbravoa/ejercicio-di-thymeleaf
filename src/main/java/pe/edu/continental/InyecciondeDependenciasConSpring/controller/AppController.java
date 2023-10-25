package pe.edu.continental.InyecciondeDependenciasConSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;
import pe.edu.continental.InyecciondeDependenciasConSpring.service.IAppService;

@Controller
public class AppController {

    @Autowired
    public IAppService appService;

    @GetMapping("/lista")
    public String listarEquipos(Model model) {
        List<Equipo> listaEquipos = appService.listarEquipos();
        model.addAttribute("listaEquipos", listaEquipos);
        return "listaEquipos";
    }

    @GetMapping("")
    public String index() {
        return "index";
    }
}
