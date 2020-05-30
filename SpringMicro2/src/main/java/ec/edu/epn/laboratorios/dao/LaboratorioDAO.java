package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.Laboratorio;

public interface LaboratorioDAO extends JpaRepository<Laboratorio, String>{

}
