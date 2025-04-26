package pe.edu.upeu.tresenraya.servicios;

import pe.edu.upeu.tresenraya.modelo.tresEnRayaModelo;

import java.util.List;

public interface tresEnRayaServiciosIn {

    //C = CREATE (CREAR)
    public void save(tresEnRayaModelo to);

    //R = READ (LEER)
    public List<tresEnRayaModelo> findAll();
    public tresEnRayaModelo findById(int index);

    //U = UPDATE (ACTUALIZAR)
    public void update(tresEnRayaModelo to, int index);

    //D = DELETE (ELIMINAR)
    public void delete(tresEnRayaModelo to);
    public void deleteById(int index);
}
