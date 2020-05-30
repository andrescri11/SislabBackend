package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.TipoCliente;

public interface TipoClienteService {
	List<TipoCliente> getTcliente();
	TipoCliente consultarTipoCliente(String id);
	TipoCliente ingresarTipoCliente(TipoCliente tipoCliente);
	TipoCliente actualizarTipoCliente(TipoCliente tipoCliente);
	void eliminarTipoCliente(String id);
}
