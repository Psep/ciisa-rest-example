package cl.ciisa.arquitectura.evaluacion2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase que contiene método principal para iniciación
 * del servicio en Spring Boot.
 * 
 * @author psep
 *
 */
@SpringBootApplication
public class Application {
	
	/**
	 * Método principal que inicia Spring Boot.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
