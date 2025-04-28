package com.example.Class_07.__Papeleria.Repository;

import com.example.Class_07.__Papeleria.Model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProveedor extends JpaRepository<Proveedor,Long> {
}
