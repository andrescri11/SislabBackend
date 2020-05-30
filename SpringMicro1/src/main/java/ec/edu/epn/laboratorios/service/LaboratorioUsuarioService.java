package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.LaboratorioUsuario;

public interface LaboratorioUsuarioService {
	
	List<LaboratorioUsuario> getListaLabUsuario();
	LaboratorioUsuario ingresarLabUsuario(LaboratorioUsuario listaLaboratorioUsuario);
	LaboratorioUsuario actualizarLabUsuario(LaboratorioUsuario listaLaboratorioUsuario);
	void eliminarLabUsuario(String id);
}
