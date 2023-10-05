package com.curso.concesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Clase principal que inicia la aplicación del concesionario.
 */
@EntityScan(basePackages = {"com.curso.model"})
@EnableJpaRepositories(basePackages = {"com.curso.dao"})
@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"} )
public class ConcesionarioApplication {

	/**
	 * Punto de entrada para la aplicación del concesionario.
	 *
	 * @param args Argumentos de línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConcesionarioApplication.class, args);
	}

}