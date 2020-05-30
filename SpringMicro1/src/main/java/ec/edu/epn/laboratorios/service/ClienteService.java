package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Cliente;

public interface ClienteService {
	
	List<Cliente> getClientes();
	Cliente getClientesPorId(String id);
	Cliente ingresarCliente(Cliente cli);
	Cliente actualizarCliente(Cliente cli);
	void eliminarCliente(String id);

}
