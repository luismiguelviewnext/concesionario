package com.curso.service;

import java.util.List;

import com.curso.model.Coches;

/**
 * Interfaz que define las operaciones CRUD para la entidad Coches.
 * @author Luis Miguel Albarracín Castillo
 */
public interface CochesService {

    /**
     * Devuelve una lista de todos los coches.
     *
     * @return Lista de coches.
     */
    List<Coches> listar();

    /**
     * Obtiene un coche por su ID.
     *
     * @param id ID del coche a obtener.
     * @return El coche con el ID especificado.
     */
    Coches obtenerporId(int id);

    /**
     * Guarda los cambios realizados en un coche existente.
     *
     * @param coches Coche a guardar.
     */
    void actualizar(Coches coches);

    /**
     * Crea un nuevo coche.
     *
     * @param coches Coche a crear.
     */
    void crear(Coches coches);

    /**
     * Elimina un coche por su ID.
     *
     * @param id ID del coche a eliminar.
     */
    void eliminar(int id);


    List<Coches> encuentraCochePorMarca(String marca);

    List<Coches> encuentraCochePorModelo(String modelo);
}