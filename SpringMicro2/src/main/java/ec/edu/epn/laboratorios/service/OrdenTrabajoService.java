package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.OrdenTrabajo;

public interface OrdenTrabajoService {
	List<OrdenTrabajo> getOrdenTrabajo();
	OrdenTrabajo ingresarOrdenT(OrdenTrabajo ordenTrabajo);
	OrdenTrabajo getOrdenPorId(String id);
	OrdenTrabajo actualizarOrdenBase(OrdenTrabajo ordenTrabajo);
}
