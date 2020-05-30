package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.LaboratorioUsuarioDAO;
import ec.edu.epn.laboratorios.model.LaboratorioUsuario;

@Service
public class LaboratorioUsuarioServiceImpl implements LaboratorioUsuarioService{
	
	@Autowired
	private LaboratorioUsuarioDAO dao;

	@Override
	public List<LaboratorioUsuario> getListaLabUsuario() {
		return dao.findAll();
	}

	@Override
	public LaboratorioUsuario ingresarLabUsuario(LaboratorioUsuario listaLaboratorioUsuario) {
		return dao.save(listaLaboratorioUsuario);
	}

	@Override
	public LaboratorioUsuario actualizarLabUsuario(LaboratorioUsuario listLaboratorioUsuario) {
		return dao.save(listLaboratorioUsuario);
	}

	@Override
	public void eliminarLabUsuario(String id) {
		dao.delete(id);
	}
}
