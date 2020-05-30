package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.ServicioDAO;
import ec.edu.epn.laboratorios.model.Servicio;

@Service
public class ServicioServiceImpl implements ServicioService{
	
	@Autowired
	private ServicioDAO dao;

	@Override
	public List<Servicio> getServicios() {
		return dao.findAll();
	}

	@Override
	public Servicio ingresarServicio(Servicio servicio) {
		return dao.save(servicio);
	}

	@Override
	public Servicio actualizarServicio(Servicio servicio) {
		return dao.save(servicio);
	}

	@Override
	public void eliminarServicio(String id) {
		dao.delete(id);
	}
}
