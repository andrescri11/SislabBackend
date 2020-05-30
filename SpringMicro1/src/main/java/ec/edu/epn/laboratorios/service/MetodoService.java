package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Metodo;

public interface MetodoService {

	List<Metodo> getMetodos();
	Metodo ingresarMetodo(Metodo mt);
	Metodo actualizarMetodo(Metodo mt);
	void eliminarMetodo(String id);
	Metodo obtenerMetodoPorId(String id);
}
