package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Servicio;

public interface ServicioService {
	List<Servicio> getServicios();
	Servicio ingresarServicio(Servicio servicio);
	Servicio actualizarServicio(Servicio servicio);
	void eliminarServicio(String id);
}
