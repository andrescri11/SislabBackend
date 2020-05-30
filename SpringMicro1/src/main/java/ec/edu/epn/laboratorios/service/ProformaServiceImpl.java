package ec.edu.epn.laboratorios.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.ProformaDAO;
import ec.edu.epn.laboratorios.model.Metodo;
import ec.edu.epn.laboratorios.model.Proforma;

@Service
public class ProformaServiceImpl implements ProformaService{
	@Autowired
	private ProformaDAO dao;

	@Override
	public List<Proforma> getListarProf() {
		return dao.findAll();
	}

	// public Proforma ingresarProforma(Proforma proforma, String fechaActual, String representante) {
	@Override
	public Proforma ingresarProforma(Proforma proforma) {	
		//construir id proforma
		String codigoUnidad, maxCodProforma, ultimoValorSeq, proformaId = "";
		List<Object[]> resultsCodUnidad = dao.getCodigoUnidad(proforma.getId_emisor());
		List<Object[]> resultsMaxCodProforma = dao.auxiliarCodigoMaxProforma();
		List<Object[]> ultimoValorSecuencia = dao.ultimoValorSecuencia();
		
		codigoUnidad = String.valueOf(resultsCodUnidad.get(0));
		
		if(resultsMaxCodProforma.get(0) != null) {
			maxCodProforma = String.valueOf(resultsMaxCodProforma.get(0));
			Integer sigCod = Integer.parseInt(maxCodProforma) + 1;
			maxCodProforma = sigCod.toString();
		}else {
			maxCodProforma = String.valueOf(ultimoValorSecuencia.get(0));
		}
		
		proforma.setAuxid_proforma(Integer.parseInt(maxCodProforma));
		
		Calendar cal= Calendar.getInstance();
		int anio= cal.get(Calendar.YEAR);
		
		switch(maxCodProforma.length()) {
			case 1:
				proformaId = codigoUnidad + "-P000" + maxCodProforma + "-" + anio;
			break;
			case 2:
				proformaId = codigoUnidad + "-P00" + maxCodProforma + "-" + anio;
			break;
			case 3:
				proformaId = codigoUnidad + "-P0" + maxCodProforma + "-" + anio;
			break;
			case 4:
				proformaId = codigoUnidad + "-P" + maxCodProforma + "-" + anio;
			break;
		}
		
		proforma.setId_proforma(proformaId);
		
		proforma.getDetalleProforma().forEach(d -> {
			d.setProforma(proforma);
		});
		return dao.save(proforma);
	}


	@Override
	public void eliminarProforma(String id) {
		dao.delete(id);
	}

	@Override
	public Proforma actualizarProfBase(Proforma proforma) {
		proforma.getDetalleProforma().forEach(d -> {
			d.setProforma(proforma);
		});
		return dao.save(proforma);
	}

	@Override
	public Proforma obtenerDatosClienteVerProforma(String id) {
		return dao.findOne(id);
	}

	@Override
	public Proforma getProformaPorId(String id) {
		return dao.findOne(id);
	}

	/* @Override
	public List<Metodo> obtenerMetodos(String id_servicio) {
		List<Metodo> metodos = new ArrayList<>();
		dao.obtenerMetodos(id_servicio).forEach( x -> {
			Metodo m = new Metodo();
			m.setId_metodo(String.valueOf(x[0]));
			m.setServicio(String.valueOf(x[1]));
			m.setDescr_mt(String.valueOf(x[2]));
			m.setCertificado_mt(String.valueOf(x[3]));
			m.setNombre_mt(String.valueOf(x[4]));
			m.setAux_idmetodo(String.valueOf(x[5]));
			menus.add(m);
		});
		return metodos;			
	} 
	} */

/*	@Override
	public List<Metodo> obtenerMetodos(String idMetodo) {
		return dao;
	}*/

}
