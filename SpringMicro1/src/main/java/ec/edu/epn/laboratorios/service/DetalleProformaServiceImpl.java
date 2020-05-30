package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.DetalleProformaDAO;
import ec.edu.epn.laboratorios.model.DetalleProforma;

@Service
public class DetalleProformaServiceImpl implements DetalleProformaService {
	@Autowired 
	private DetalleProformaDAO dao;

	@Override
	public DetalleProforma ingresarDetalleProf(DetalleProforma detalleProforma) {
		return dao.save(detalleProforma);
	}

	@Override
	public DetalleProforma actualizarDetalleProfBase(DetalleProforma detalleProforma) {
		return dao.save(detalleProforma);
	}

	@Override
	public void eliminarDetalleProforma(String id) {
		dao.delete(id);
	}

	@Override
	public List<DetalleProforma> getDetalleProforma() {
		return dao.findAll();
	}	
}
