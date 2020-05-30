package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.laboratorios.model.TipoCliente;

public interface TipoClienteDAO extends JpaRepository<TipoCliente, String>{	
}
