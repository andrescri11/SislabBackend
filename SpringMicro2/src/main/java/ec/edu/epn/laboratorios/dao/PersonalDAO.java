package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ec.edu.epn.laboratorios.model.Personal;

public interface PersonalDAO extends JpaRepository<Personal, String>{

	@Query(value="select MAX(aux_idpersonal) from personal", nativeQuery = true)
	List<Object[]> auxiliarCodigoMaxProforma();
	@Query(value="select nextval('secuencia_personal');", nativeQuery = true)
	List<Object[]> ultimoValorSecuencia();
}
