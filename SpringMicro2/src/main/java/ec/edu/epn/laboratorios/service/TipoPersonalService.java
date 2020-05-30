package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.TipoPersonal;

public interface TipoPersonalService {
	List<TipoPersonal> getTipoPersonal();
	TipoPersonal ingresarTipoPersonal(TipoPersonal tipoPersonal);
	TipoPersonal actualizarTipoPersonal(TipoPersonal tipoPersonal);
	void eliminarTipoPersonal(String id);
}
