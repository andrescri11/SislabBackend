package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.Servicio;

public interface ServicioDAO extends JpaRepository<Servicio, String>{
}
