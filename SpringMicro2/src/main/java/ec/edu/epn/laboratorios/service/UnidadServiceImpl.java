package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.UnidadDAO;
import ec.edu.epn.laboratorios.model.Unidad;

@Service
public class UnidadServiceImpl implements UnidadService {
	@Autowired
	private UnidadDAO dao;

	@Override
	public List<Unidad> getUnidad() {
		return dao.findAll();
	}


	@Override
	public Unidad ingresarUnidad(Unidad unidad) {
		return dao.save(unidad);
	}

	@Override
	public Unidad actualizarUnidad(Unidad unidad) {
		return dao.save(unidad);
	}


	@Override
	public Unidad consultarUnidad(Integer id) {
		return dao.getOne(id);
	}


	@Override
	public void eliminarUnidad(Integer id) {
		dao.delete(id);
	}


}
