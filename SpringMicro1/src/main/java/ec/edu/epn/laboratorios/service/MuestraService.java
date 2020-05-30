package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Muestra;

public interface MuestraService {
	List<Muestra> getMuestra();
	Muestra ingresarMuestra(Muestra muestra);
	Muestra actualizarMuestra(Muestra muestra);
	void eliminarMuestra(String id);
}
