package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.PersonalDAO;
import ec.edu.epn.laboratorios.dao.UnidadDAO;
import ec.edu.epn.laboratorios.model.Personal;

@Service
public class PersonalServiceImpl implements PersonalService {
	@Autowired
	private PersonalDAO dao;

	@Autowired
	private UnidadDAO daoUnidad;
	
	@Override
	public List<Personal> getListaPersonal() {
		return dao.findAll();
	}

	@Override
	public Personal ingresarPersonal(Personal personal) {
		// construir id proforma
		String codigoUnidad, maxCod, ultimoValorSeq, personalID = "";
		List<Object[]> resultsCodUnidad = daoUnidad.getCodigoUnidadIdUnidad(personal.getId_unidad());
		List<Object[]> resultsMaxCod = dao.auxiliarCodigoMaxProforma();
		codigoUnidad = String.valueOf(resultsCodUnidad.get(0));
		if (resultsMaxCod.get(0) != null) {
			maxCod = String.valueOf(resultsMaxCod.get(0));
			Integer sigCod = Integer.parseInt(maxCod) + 1;
			maxCod = sigCod.toString();
		} else {
			List<Object[]> ultimoValorSecuencia = dao.ultimoValorSecuencia();
			maxCod = String.valueOf(ultimoValorSecuencia.get(0));
		}
		personal.setAux_idpersonal(Integer.parseInt(maxCod));
		switch (maxCod.length()) {
		case 1:
			personalID = codigoUnidad + "-PE000" + maxCod;
			break;
		case 2:
			personalID = codigoUnidad + "-PE00" + maxCod;
			break;
		case 3:
			personalID = codigoUnidad + "-PE0" + maxCod;
			break;
		case 4:
			personalID = codigoUnidad + "-PE" + maxCod;
			break;
		}
		personal.setId_personal(personalID);
		return dao.save(personal);
	}

	@Override
	public Personal actualizarPersonal(Personal personal) {
		return dao.save(personal);
	}

	@Override
	public void eliminarPersonal(String id) {
		dao.delete(id);
	}
}
