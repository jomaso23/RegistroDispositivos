package ar.org.centro8.dispositivos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.org.centro8.dispositivos.entities.Dispositivo;
import ar.org.centro8.dispositivos.repositories.DispositivoRepository;

@RestController
@RequestMapping("/api")
public class DispositivosRest {

    @Autowired
    private DispositivoRepository dr;

    @GetMapping("/lista")
	public List<Dispositivo> lista(){
		return (List<Dispositivo>)dr.findAll();
	}
}
