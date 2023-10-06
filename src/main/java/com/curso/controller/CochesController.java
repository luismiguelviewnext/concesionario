package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Coches;
import com.curso.service.CochesService;

/**
 * Controlador que maneja las operaciones relacionadas con los coches.
 * @author Luis Miguel Albarracín Castillo
 */
@RestController
public class CochesController {

    @Autowired
    CochesService cochesService;

    /**
     * Obtiene una lista de todos los coches.
     *
     * @return Lista de coches.
     */
    @GetMapping(value = "coche", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Coches> listar() {
        return cochesService.listar();
    }

    /**
     * Obtiene un coche por su ID.
     *
     * @param id ID del coche a obtener.
     * @return El coche con el ID especificado.
     */
    @GetMapping(value = "coche/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Coches obtenerporId(@PathVariable("id") int id) {
        return cochesService.obtenerporId(id);
    }

    /**
     * Guarda los cambios realizados en un coche existente.
     *
     * @param coches Coche a guardar.
     */
    @PutMapping(value = "coche", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Coches coches) {
        cochesService.actualizar(coches);
    }

    /**
     * Crea un nuevo coche.
     *
     * @param coches Coche a crear.
     */
    @PostMapping(value = "coche", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Coches coches) {
        cochesService.crear(coches);
    }

    /**
     * Elimina un coche por su ID.
     *
     * @param id ID del coche a eliminar.
     */
    @DeleteMapping(value = "coche/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") int id) {
        cochesService.eliminar(id);
    }


 /**
 * Obtiene una lista de coches basados en la marca especificada.
 * 
 * @param marca La marca de coche que se desea buscar.
 * @return Una lista de coches que coinciden con la marca dada.
 */
@GetMapping(value = "coche/marca/{marca}", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Coches> encuentraCochePorMarca(@PathVariable("marca") String marca) {
    return cochesService.encuentraCochePorMarca(marca);
}

/**
 * Obtiene una lista de coches basados en el modelo especificado.
 * 
 * @param modelo El modelo de coche que se desea buscar.
 * @return Una lista de coches que coinciden con el modelo dado.
 */
@GetMapping(value = "coche/modelo/{modelo}", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Coches> encuentraCochePorModelo(@PathVariable("modelo") String modelo) {
    return cochesService.encuentraCochePorModelo(modelo);
}

}