package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.TipoServicioDAO;
import ec.edu.epn.laboratorios.model.TipoServicio;

@Service
public class TipoServicioServiceImpl implements TipoServicioService{

	@Autowired
	private TipoServicioDAO dao;

	@Override
	public List<TipoServicio> getTipoServicio() {
		return dao.findAll();
	}

	@Override
	public TipoServicio ingresarTipoServicio(TipoServicio tiposervicio) {		
		return dao.save(tiposervicio);
	}

	@Override
	public TipoServicio actualizarTipoServicio(TipoServicio tiposervicio) {
		return dao.save(tiposervicio);
	}

	@Override
	public TipoServicio consultarTipoServicio(String id) {
		return dao.findOne(id);
	}
	
	@Override
	public void eliminarTipoServicio(String id) {
		dao.delete(id);
	}
}
