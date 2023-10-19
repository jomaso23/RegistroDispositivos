package ar.org.centro8.dispositivos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DispositivosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispositivosApplication.class, args);

		//Para ejecutar el server en una terminal bash
		//sh mvnw spring-boot:run

	}

}
