package ec.edu.epn.laboratorios.service;
import java.util.List;

import ec.edu.epn.laboratorios.model.DetalleProforma;

public interface DetalleProformaService {

	List<DetalleProforma> getDetalleProforma();
	DetalleProforma ingresarDetalleProf(DetalleProforma detalleProforma);
	DetalleProforma actualizarDetalleProfBase(DetalleProforma detalleProforma);
	void eliminarDetalleProforma(String id);
}
