package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.DetalleOrden;

public interface DetalleOrdenService {
	
	List<DetalleOrden> getListaDetalle();
	DetalleOrden ingresarDetalleOrden(DetalleOrden detalleOrden);
	DetalleOrden actualizarDetalleOrden(DetalleOrden detalleOrden);
	void eliminarDetalleOrden(String id);
}
