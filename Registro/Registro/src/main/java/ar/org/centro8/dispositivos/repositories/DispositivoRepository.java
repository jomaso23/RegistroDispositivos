package ar.org.centro8.dispositivos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.dispositivos.entities.Dispositivo;

@Repository
public interface DispositivoRepository 
            extends CrudRepository<Dispositivo, Integer> {
    
}
