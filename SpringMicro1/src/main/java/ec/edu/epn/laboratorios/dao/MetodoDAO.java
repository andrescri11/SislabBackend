package ec.edu.epn.laboratorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.epn.laboratorios.model.Metodo;

public interface MetodoDAO extends JpaRepository<Metodo, String>{

}
