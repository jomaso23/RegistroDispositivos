package ar.org.centro8.dispositivos.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ar.org.centro8.dispositivos.entities.Dispositivo;
import ar.org.centro8.dispositivos.repositories.DispositivoRepository;


@Controller
public class ControllerWeb {

    @Autowired
    private DispositivoRepository dr;

    private String mensaje = "Ingrese un nuevo dispositivo!";

    @GetMapping("/")
    public String getIndex(Model model) {
        // dr.findAll().forEach(System.out::println);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("dispositivo", new Dispositivo());
        return "index";
    }

    @GetMapping("/dispositivos")
    public String dispositivos(Model model){
        model.addAttribute("lista", dr.findAll());
        return "dispositivos";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Dispositivo dispositivo) {
        System.out.println("******************************************");
        System.out.println(dispositivo);
        System.out.println("******************************************");
        // dispositivo.setId(0);
        dr.save(dispositivo);
        if (dispositivo.getId() > 0) {
            mensaje = "Se guardo el dispositivo con id: " + dispositivo.getId() + "!";
        } else {
            mensaje = "No se pudo guardar el dispositivo";
        }
        return "redirect:";
    }

}
