package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.LaboratorioDAO;
import ec.edu.epn.laboratorios.model.Laboratorio;

@Service
public class LaboratorioServiceImpl implements LaboratorioService{
	
	@Autowired
	private LaboratorioDAO dao;

	@Override
	public List<Laboratorio> getLaboratorios() {
		return dao.findAll();
	}

	@Override
	public Laboratorio ingresarLaboratorio(Laboratorio laboratorio) {
		return dao.save(laboratorio);
	}

	@Override
	public Laboratorio actualizarLaboratorio(Laboratorio laboratorio) {
		return dao.save(laboratorio);
	}

	@Override
	public void eliminarLaboratorio(String id) {
		dao.delete(id);
	}

	@Override
	public Laboratorio getLaboratorioPorId(String id) {
		return dao.findOne(id);
	}
	
}
