package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Laboratorio;

public interface LaboratorioService {

	List<Laboratorio> getLaboratorios();
	Laboratorio getLaboratorioPorId(String id);
	Laboratorio ingresarLaboratorio(Laboratorio laboratorio);
	Laboratorio actualizarLaboratorio(Laboratorio laboratorio);
	void eliminarLaboratorio(String id);
}
