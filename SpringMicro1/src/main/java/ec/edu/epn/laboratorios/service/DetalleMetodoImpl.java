package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.DetalleMetodoDAO;
import ec.edu.epn.laboratorios.model.DetalleMetodo;

@Service
public class DetalleMetodoImpl implements DetalleMetodoService {
	
	@Autowired
	private DetalleMetodoDAO dao;

	@Override
	public List<DetalleMetodo> getDatosDm() {
		return dao.findAll();
	}

	@Override
	public DetalleMetodo obtenerDatosProductoPorIdExistencia(String id) {
		return dao.findOne(id);
	}

	@Override
	public DetalleMetodo ingresarDtMetodo(DetalleMetodo dm) {
		return dao.save(dm);
	}

	@Override
	public DetalleMetodo actualizarDetalleMetodoBDD(DetalleMetodo dm) {
		return dao.save(dm);
	}

	@Override
	public void eliminarDetalleMetodo(String id) {
		dao.delete(id);
	}
}
