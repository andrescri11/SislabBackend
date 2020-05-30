package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.TipoServicio;

public interface TipoServicioDAO extends JpaRepository<TipoServicio, String>{
}
