package ec.edu.epn.laboratorios.service;
import java.util.List;
import ec.edu.epn.laboratorios.model.DetalleMetodo;

public interface DetalleMetodoService {

	List<DetalleMetodo> getDatosDm();
	DetalleMetodo obtenerDatosProductoPorIdExistencia(String id);
	DetalleMetodo ingresarDtMetodo(DetalleMetodo dm);
	DetalleMetodo actualizarDetalleMetodoBDD(DetalleMetodo dm);
	void eliminarDetalleMetodo(String id);
}
