package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.epn.laboratorios.dao.DetalleMetodoDAO;
import ec.edu.epn.laboratorios.dao.MetodoDAO;
import ec.edu.epn.laboratorios.model.Metodo;

@Service
public class MetodoServiceImpl implements MetodoService{
	@Autowired 
	private MetodoDAO dao;
	
	@Autowired 
	private DetalleMetodoDAO ceDao;

	@Override
	public List<Metodo> getMetodos() {
		return dao.findAll();
	}

	@Transactional
	@Override
	public Metodo ingresarMetodo(Metodo mt) {

		mt.getDetalleMetodo().forEach(d -> {
			d.setMetodo(mt);
		});
		return dao.save(mt);		
	}

	@Override
	public Metodo actualizarMetodo(Metodo mt) {
		return dao.save(mt);
	}

	@Override
	public void eliminarMetodo(String id) {
		dao.delete(id);
	}

	@Override
	public Metodo obtenerMetodoPorId(String id) {
		return dao.findOne(id);
	}

	
}
