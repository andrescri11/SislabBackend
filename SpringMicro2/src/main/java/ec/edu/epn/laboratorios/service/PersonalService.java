package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Personal;

public interface PersonalService {
	
	List<Personal> getListaPersonal();
	Personal ingresarPersonal(Personal personal);
	Personal actualizarPersonal(Personal personal);
	void eliminarPersonal(String id);
}
