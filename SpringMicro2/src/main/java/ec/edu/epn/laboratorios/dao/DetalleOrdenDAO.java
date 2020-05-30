package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.DetalleOrden;

public interface DetalleOrdenDAO extends JpaRepository<DetalleOrden, String>{

}
