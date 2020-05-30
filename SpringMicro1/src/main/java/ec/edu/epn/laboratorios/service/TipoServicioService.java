package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.TipoServicio;

public interface TipoServicioService {

	List<TipoServicio> getTipoServicio();
	TipoServicio ingresarTipoServicio(TipoServicio tiposervicio);
	TipoServicio actualizarTipoServicio(TipoServicio tiposervicio);
	TipoServicio consultarTipoServicio(String id);
	void eliminarTipoServicio(String id);
}
