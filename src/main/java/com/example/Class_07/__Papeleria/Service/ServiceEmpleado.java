package com.example.Class_07.__Papeleria.Service;

import com.example.Class_07.__Papeleria.Model.Empleado;
import com.example.Class_07.__Papeleria.Model.Venta;
import com.example.Class_07.__Papeleria.Repository.RepositoryEmpleado;
import com.example.Class_07.__Papeleria.Repository.RepositoryVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceEmpleado {

    private final RepositoryEmpleado repositoryEmpleado;

    @Autowired
    public ServiceEmpleado(RepositoryEmpleado repositoryEmpleado){
        this.repositoryEmpleado=repositoryEmpleado;
    }

    //Obtener todos los empleados
    public List<Empleado> obtenerTodosLosEmpleados(){
        return repositoryEmpleado.findAll();
    }

    //Obtener un empleado por su ID
    public Optional<Empleado> obtenerEmpleadoPorId(Long id){
        return repositoryEmpleado.findById(id);
    }

    //Guardar un nuevo Empleado
    public Empleado guardarEmpleado(Empleado empleado){
        return repositoryEmpleado.save(empleado);
    }

    //Eliminar empleado por Id
    public void eliminarEmpleado(long id){
        repositoryEmpleado.deleteById(id);
    }
}
