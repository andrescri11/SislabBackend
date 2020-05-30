package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.epn.laboratorios.model.DetalleMetodo;

public interface DetalleMetodoDAO extends JpaRepository<DetalleMetodo, String>{
}
