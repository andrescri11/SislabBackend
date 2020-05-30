package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.TipoPersonal;

public interface TipoPersonalDAO extends JpaRepository<TipoPersonal, String>{
}
