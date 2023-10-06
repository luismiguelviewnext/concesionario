package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CochesDao;
import com.curso.model.Coches;

/**
 * Implementación de la interfaz CochesService que proporciona operaciones CRUD
 * para la entidad Coches.
 * @author Luis Miguel Albarracín Castillo
 */
@Service
public class CochesServiceImpl implements CochesService {

    @Autowired
    private CochesDao cochesDao;

    /**
     * Devuelve una lista de todos los coches.
     *
     * @return Lista de coches.
     */
    @Override
    public List<Coches> listar() {
        return cochesDao.findAll();
    }

    /**
     * Obtiene un coche por su ID.
     *
     * @param id ID del coche a obtener.
     * @return El coche con el ID especificado, o null si no se encuentra.
     */
    @Override
    public Coches obtenerporId(int id) {
        return cochesDao.findById(id).orElse(null);
    }

    /**
     * Guarda un coche en la base de datos.
     *
     * @param coche Coche a guardar.
     */
    @Override
    public void actualizar(Coches coche) {
        cochesDao.save(coche);
    }

    /**
     * Crea un nuevo coche.
     *
     * @param coches Coche a crear.
     */
    @Override
    public void crear(Coches coche) {
        cochesDao.save(coche);
    }

    /**
     * Elimina un coche de la base de datos por su ID.
     *
     * @param id ID del coche a eliminar.
     */
    @Override
    public void eliminar(int id) {
        cochesDao.deleteById(id);
    }

    @Override
    public List<Coches> encuentraCochePorMarca(String marca) {
        return cochesDao.encuentraCochePorMarca(marca);
    }

    @Override
    public List<Coches> encuentraCochePorModelo(String modelo) {
        return cochesDao.encuentraCochePorModelo(modelo);
    }
}