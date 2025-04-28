package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Producto;
import com.example.Class_07.__Papeleria.Model.Venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryProducto;
import com.example.Class_07.__Papeleria.Repository.RepositoryVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceProducto {

    private final RepositoryProducto repositoryProducto;

    @Autowired
    public ServiceProducto(RepositoryProducto repositoryProducto){
        this.repositoryProducto=repositoryProducto;
    }

    //Obtener todas los productos
    public List<Producto> obtenerTodosLosProductos(){
        return repositoryProducto.findAll();
    }

    //Obtener un producto por su ID
    public Optional<Producto> obtenerProductoPorId(Long id){
        return repositoryProducto.findById(id);
    }

    //Guardar un nuevo producto
    public Producto guardarProducto(Producto producto){
        return repositoryProducto.save(producto);
    }

    //Eliminar Producto por Id
    public void eliminarProducto(long id){
        repositoryProducto.deleteById(id);
    }
}
