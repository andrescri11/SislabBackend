package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.CargosPersonalDAO;
import ec.edu.epn.laboratorios.model.CargosPersonal;

@Service
public class CargosPersonalServiceImpl implements CargosPersonalService{

	@Autowired
	private CargosPersonalDAO dao;

	@Override
	public List<CargosPersonal> getListaCargosPersonal() {
		return dao.findAll();
	}

	@Override
	public CargosPersonal ingresarCargoP(CargosPersonal cargosPersonal) {
		return dao.save(cargosPersonal);
	}

	@Override
	public void eliminarCargoPersonal(String id) {
		dao.delete(id);
	}

	@Override
	public CargosPersonal actualizarCargosP(CargosPersonal cargosPersonal) {
		return dao.save(cargosPersonal);
	}
}
