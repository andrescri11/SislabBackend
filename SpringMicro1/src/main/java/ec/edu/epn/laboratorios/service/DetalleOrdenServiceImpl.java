package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.DetalleOrdenDAO;
import ec.edu.epn.laboratorios.model.DetalleOrden;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService{
	
	@Autowired
	private DetalleOrdenDAO dao;

	@Override
	public List<DetalleOrden> getListaDetalle() {
		return dao.findAll();
	}

	@Override
	public DetalleOrden ingresarDetalleOrden(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return dao.save(detalleOrden);
	}

	@Override
	public DetalleOrden actualizarDetalleOrden(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return dao.save(detalleOrden);
	}

	@Override
	public void eliminarDetalleOrden(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
}
