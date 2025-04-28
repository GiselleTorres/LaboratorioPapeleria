package com.example.Class_07.__Papeleria.Repository;

import com.example.Class_07.__Papeleria.Model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVenta extends JpaRepository<Venta,Long> {
}
