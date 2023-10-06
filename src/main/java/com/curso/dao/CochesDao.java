package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Coches;

/**
 * Interfaz de repositorio que proporciona operaciones de acceso a datos para la entidad Coches.
 * @author Luis Miguel Albarracín Castillo
 */
public interface CochesDao extends JpaRepository<Coches, Integer> {
    
    @Query("SELECT coche FROM Coches coche WHERE coche.marca = :marca")
   List<Coches> encuentraCochePorMarca(String marca);

    @Query("SELECT coche FROM Coches coche WHERE coche.modelo = :modelo")
    List<Coches> encuentraCochePorModelo(String modelo);
}
