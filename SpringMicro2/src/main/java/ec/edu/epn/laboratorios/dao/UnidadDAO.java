package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.edu.epn.laboratorios.model.Unidad;

public interface UnidadDAO extends JpaRepository<Unidad, Integer> {
	@Query(value="select un.codigo_u from unidad un inner join usuario us on un.id_unidad = us.id_unidad where us.nombre = :nombre", nativeQuery = true)
	List<Object[]> getCodigoUnidad(@Param("nombre") String nombre);
	@Query(value="select codigo_u from unidad where id_unidad = :codigoUnidad", nativeQuery = true)
	List<Object[]> getCodigoUnidadIdUnidad(@Param("codigoUnidad") Integer codigoUnidad);
}
