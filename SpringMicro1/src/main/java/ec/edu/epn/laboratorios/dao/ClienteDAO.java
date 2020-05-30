package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.epn.laboratorios.model.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, String> {
}
