package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {
		
	Usuario findOneByUsername(String username);
}