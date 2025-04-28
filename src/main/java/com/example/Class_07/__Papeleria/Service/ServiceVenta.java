package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceVenta {

    private final RepositoryVenta repositoryVenta;

    @Autowired
    public ServiceVenta(RepositoryVenta repositoryVenta){
        this.repositoryVenta=repositoryVenta;
    }

    //Obtener todas las ventas
    public List<Venta> obtenerTodasLasVentas(){
        return repositoryVenta.findAll();
    }

    //Obtener una venta por su ID
    public Optional<Venta> obtenerVentaPorId(Long id){
        return repositoryVenta.findById(id);
    }

    //Guardar una nueva venta
    public Venta guardarVenta(Venta venta){
        return repositoryVenta.save(venta);
    }

    //Eliminar Venta por Id
    public void eliminarVenta(long id){
        repositoryVenta.deleteById(id);
    }
}
