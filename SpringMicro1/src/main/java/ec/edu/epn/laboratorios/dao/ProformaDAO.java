package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.edu.epn.laboratorios.model.Proforma;

public interface ProformaDAO extends JpaRepository<Proforma, String>{
	@Query(value="select un.codigo_u from unidad un inner join usuario us on un.id_unidad = us.id_unidad where us.nombre = :nombre", nativeQuery = true)
	List<Object[]> getCodigoUnidad(@Param("nombre") String nombre);
	
	@Query(value="select MAX(auxid_proforma) from proforma", nativeQuery = true)
	List<Object[]> auxiliarCodigoMaxProforma();
	
	@Query(value="select nextval('secuencia_proforma');", nativeQuery = true)
	List<Object[]> ultimoValorSecuencia();
	/* @Query(value="", nativeQuery = true)
	List<Object[]> obtenerMetodos(@Param("id_servicio") String id_servicio); */
}
