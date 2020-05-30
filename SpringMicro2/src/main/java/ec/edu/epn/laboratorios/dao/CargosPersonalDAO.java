package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.CargosPersonal;

public interface CargosPersonalDAO extends JpaRepository<CargosPersonal, String> {
}
