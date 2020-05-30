package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Unidad;

public interface UnidadService {
	List<Unidad> getUnidad();
	Unidad consultarUnidad(Integer id);
	Unidad ingresarUnidad(Unidad unidad);
	Unidad actualizarUnidad(Unidad unidad);
	void eliminarUnidad(Integer id);
}
