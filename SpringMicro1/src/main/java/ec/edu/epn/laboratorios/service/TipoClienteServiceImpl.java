package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.TipoClienteDAO;
import ec.edu.epn.laboratorios.model.TipoCliente;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
	
	@Autowired
	private TipoClienteDAO dao;

	@Override
	public List<TipoCliente> getTcliente() {
		return dao.findAll();
	}

	@Override
	public TipoCliente consultarTipoCliente(String id) {
		return dao.getOne(id);
	}

	@Override
	public TipoCliente ingresarTipoCliente(TipoCliente tipoCliente) {
		return dao.save(tipoCliente);
	}

	@Override
	public TipoCliente actualizarTipoCliente(TipoCliente tipoCliente) {
		return dao.save(tipoCliente);
	}

	@Override
	public void eliminarTipoCliente(String id) {
		dao.delete(id);
	}
}
