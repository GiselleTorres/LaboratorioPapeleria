package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Proveedor;
import com.example.Class_07.__Papeleria.Repository.RepositoryProducto;
import com.example.Class_07.__Papeleria.Repository.RepositoryProveedor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceProveedor {

    private final RepositoryProveedor repositoryProveedor;

    @Autowired
    public ServiceProveedor(RepositoryProveedor repositoryProveedor){
        this.repositoryProveedor=repositoryProveedor;
    }

    //Obtener todos los proveedores
    public List<Proveedor> obtenerTodosLosProveedores(){
        return repositoryProveedor.findAll();
    }

    //Obtener un proveedor  por su ID
    public Optional<Proveedor> obtenerProveedorPorId(Long id){
        return repositoryProveedor.findById(id);
    }

    //Guardar una nuevo proveedor
    public Proveedor guardarProveedor(Proveedor proveedor){
        return repositoryProveedor.save(proveedor);
    }

    //Eliminar proveedor por Id
    public void eliminarProveedor(long id){
        repositoryProveedor.deleteById(id);
    }
}
