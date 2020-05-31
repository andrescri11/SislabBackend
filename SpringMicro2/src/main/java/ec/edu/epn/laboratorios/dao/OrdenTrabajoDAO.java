package ec.edu.epn.laboratorios.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.edu.epn.laboratorios.model.OrdenTrabajo;

public interface OrdenTrabajoDAO extends JpaRepository<OrdenTrabajo, String>{

	@Query(value="select MAX(id_orden) FROM orden_trabajo ot, unidad u, usuario us WHERE ot.id_usuario = us.id_usuario and us.id_unidad = u.id_unidad and codigo_u =:unidad and tipo_ot like :tipoOt", nativeQuery = true)
	List<Object[]> maxCodigoOrdenTrabajo(@Param("unidad") String unidad, @Param("tipoOt") String tipoOt);
	@Query(value="select nextval('secuencia_orden_trabajo');", nativeQuery = true)
	List<Object[]> ultimoValorSecuencia();
}
