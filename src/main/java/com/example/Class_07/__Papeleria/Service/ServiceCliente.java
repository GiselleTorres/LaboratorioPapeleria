package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Cliente;
import com.example.Class_07.__Papeleria.Model.Venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryCliente;
import com.example.Class_07.__Papeleria.Repository.RepositoryVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceCliente {

    private final RepositoryCliente repositoryCliente;

    @Autowired
    public ServiceCliente(RepositoryCliente repositoryCliente){
        this.repositoryCliente=repositoryCliente;
    }

    //Obtener todas los clientes
    public List<Cliente> obtenerTodosLosClientes(){
        return repositoryCliente.findAll();
    }

    //Obtener un cliente por su ID
    public Optional<Cliente> obtenerClientePorId(Long id){
        return repositoryCliente.findById(id);
    }

    //Guardar un nuevo cliente
    public Cliente guardarCliente(Cliente cliente){
        return repositoryCliente.save(cliente);
    }

    //Eliminar un cliente por Id
    public void eliminarCliente(long id){
        repositoryCliente.deleteById(id);
    }
}
