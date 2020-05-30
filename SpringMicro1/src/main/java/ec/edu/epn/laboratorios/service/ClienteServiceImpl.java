package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.ClienteDAO;
import ec.edu.epn.laboratorios.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDAO dao;
	
	@Override
	public List<Cliente> getClientes() {
		return dao.findAll();
	}

	@Override
	public Cliente ingresarCliente(Cliente cli) {
		return dao.save(cli);
	}

	@Override
	public Cliente actualizarCliente(Cliente cli) {
		return dao.save(cli);
	}

	@Override
	public void eliminarCliente(String id) {
		dao.delete(id);
	}

	@Override
	public Cliente getClientesPorId(String id) {
		return dao.findOne(id);
	}

	/*
	@Override
	public Cliente getClientesPorNombre(String nombre) {
		return dao.f
	}*/
}
