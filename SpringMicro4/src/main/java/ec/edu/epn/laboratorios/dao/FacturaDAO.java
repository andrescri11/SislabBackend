package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ec.edu.epn.laboratorios.model.Factura;

public interface FacturaDAO extends JpaRepository<Factura, String>{
	
	@Query(value="select nextval('facturacion.fac_sec');", nativeQuery = true)
	List<Object[]> ultimoValorSecuencia();

}
