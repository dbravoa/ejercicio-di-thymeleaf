package pe.edu.continental.InyecciondeDependenciasConSpring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;
import pe.edu.continental.InyecciondeDependenciasConSpring.service.IAppService;

@Controller
@RequestMapping("/equipo")
public class AppController {

    @Autowired
    public IAppService appService;

    @GetMapping("/lista")
    public String listarEquipos(Model model) {
        List<Equipo> listaEquipos = appService.listarEquipos();
        model.addAttribute("listaEquipos", listaEquipos);
        return "equipo/lista";
    }

    @PostMapping("/guardar")
    public void guardarEquipo(
            @RequestParam("nombre") String nombre,
            @RequestParam("presupuesto") String presupuesto,
            @RequestParam("fechaFundacion") String fechaFundacion) {
        try {
            Float presupuestFloat = Float.parseFloat(presupuesto);
            Date fechaFundacionDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaFundacion);
            Equipo equipo = new Equipo(null, nombre, presupuestFloat, fechaFundacionDate);
            appService.registrarEquipo(equipo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @GetMapping("/formulario-equipo")
    public String formularioEquipo() {
        return "equipo/guardar";
    }

    @GetMapping("")
    public String index() {
        return "index";
    }
}
