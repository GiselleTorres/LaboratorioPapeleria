package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Detalle_venta;
import com.example.Class_07.__Papeleria.Model.Venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryDetalle_venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceDetalle_Venta {

    private final RepositoryDetalle_venta repositoryDetalle_venta;

    @Autowired
    public ServiceDetalle_Venta(RepositoryDetalle_venta repositoryDetalle_venta){
        this.repositoryDetalle_venta=repositoryDetalle_venta;
    }

    //Obtener todas los detalles de venta
    public List<Detalle_venta> obtenerTodosLosDetalle_Ventas(){
        return repositoryDetalle_venta.findAll();
    }

    //Obtener un detalle de venta por su ID
    public Optional<Detalle_venta> obtenerDetalle_VentaPorId(Long id){
        return repositoryDetalle_venta.findById(id);
    }

    //Guardar un nuevo detalle de venta
    public Detalle_venta guardarDetalle_Venta(Detalle_venta detalle_venta){
        return repositoryDetalle_venta.save(detalle_venta);
    }

    //Eliminar detalle de Venta por Id
    public void eliminarDetalle_Venta(long id){
        repositoryDetalle_venta.deleteById(id);
    }
}
