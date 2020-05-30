package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ec.edu.epn.laboratorios.model.Muestra;

public interface MuestraDAO extends JpaRepository<Muestra, String> {

	@Query(value="select MAX(aux_muestra) from muestra", nativeQuery = true)
	List<Object[]> auxiliarCodigoMaxProforma();
	@Query(value="select nextval('secuencia_muestra');", nativeQuery = true)
	List<Object[]> ultimoValorSecuencia();
}
