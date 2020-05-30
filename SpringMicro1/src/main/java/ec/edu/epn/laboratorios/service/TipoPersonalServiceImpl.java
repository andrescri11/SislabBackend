package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.TipoPersonalDAO;
import ec.edu.epn.laboratorios.model.TipoPersonal;

@Service
public class TipoPersonalServiceImpl implements TipoPersonalService {
	@Autowired
	private TipoPersonalDAO dao;

	@Override
	public List<TipoPersonal> getTipoPersonal() {
		return dao.findAll();
	}

	@Override
	public TipoPersonal ingresarTipoPersonal(TipoPersonal tipoPersonal) {
		return dao.save(tipoPersonal);
	}

	@Override
	public TipoPersonal actualizarTipoPersonal(TipoPersonal tipoPersonal) {
		return dao.save(tipoPersonal);
	}

	@Override
	public void eliminarTipoPersonal(String id) {
		dao.delete(id);
	}
	
}
