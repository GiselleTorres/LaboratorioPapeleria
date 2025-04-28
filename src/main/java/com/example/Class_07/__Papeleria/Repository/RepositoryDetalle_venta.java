package com.example.Class_07.__Papeleria.Repository;

import com.example.Class_07.__Papeleria.Model.Detalle_venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDetalle_venta extends JpaRepository<Detalle_venta,Long> {
}
