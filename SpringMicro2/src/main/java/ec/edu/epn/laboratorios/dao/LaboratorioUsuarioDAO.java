package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.LaboratorioUsuario;

public interface LaboratorioUsuarioDAO extends JpaRepository<LaboratorioUsuario, String>{
}
