package ec.edu.epn.laboratorios.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.OrdenTrabajoDAO;
import ec.edu.epn.laboratorios.dao.UnidadDAO;
import ec.edu.epn.laboratorios.model.OrdenTrabajo;

@Service
public class OrdenTrabajoImpl implements OrdenTrabajoService {

	@Autowired
	private OrdenTrabajoDAO dao;
	
	@Autowired
	private UnidadDAO daoUnidad;

	@Override
	public List<OrdenTrabajo> getOrdenTrabajo() {
		return dao.findAll();
	}

	@Override
	public OrdenTrabajo ingresarOrdenT(OrdenTrabajo ordenTrabajo) {
		// construir id proforma
		String codigoUnidad, maxCod, ordenTrabajoId = "";
		// List<Object[]> resultsCodUnidad =
		// daoUnidad.getCodigoUnidad("molinaraul52@yahoo.es");
		List<Object[]> resultsCodUnidad = daoUnidad.getCodigoUnidad(ordenTrabajo.getId_ti());
		codigoUnidad = String.valueOf(resultsCodUnidad.get(0));
		List<Object[]> resultsMaxCodProforma = dao.maxCodigoOrdenTrabajo(codigoUnidad, ordenTrabajo.getTipo_ot());
		if (resultsMaxCodProforma.get(0) != null) {
			maxCod = String.valueOf(resultsMaxCodProforma.get(0));
			// OTI
			if (maxCod.length() == 15)
				maxCod = maxCod.substring(6, 10);
			else
				maxCod = maxCod.substring(5, 9);
			Integer sigCod = Integer.parseInt(maxCod) + 1;
			maxCod = sigCod.toString();
		} else {
			List<Object[]> ultimoValorSecuencia = dao.ultimoValorSecuencia();
			maxCod = String.valueOf(ultimoValorSecuencia.get(0));
		}
		Calendar cal = Calendar.getInstance();
		int anio = cal.get(Calendar.YEAR);
		String inicialesOrdenTrabajo = "Interna".compareTo(ordenTrabajo.getTipo_ot()) == 0 ? "OTI" : "OT";
		switch (maxCod.length()) {
		case 1:
			ordenTrabajoId = codigoUnidad + "-" + inicialesOrdenTrabajo + "000" + maxCod + "-" + anio;
			break;
		case 2:
			ordenTrabajoId = codigoUnidad + "-" + inicialesOrdenTrabajo + "000" + maxCod + "-" + anio;
			break;
		case 3:
			ordenTrabajoId = codigoUnidad + "-" + inicialesOrdenTrabajo + "000" + maxCod + "-" + anio;
			break;
		case 4:
			ordenTrabajoId = codigoUnidad + "-" + inicialesOrdenTrabajo + "000" + maxCod + "-" + anio;
			break;
		}
		ordenTrabajo.setId_orden(ordenTrabajoId);
		ordenTrabajo.getDetalleOrden().forEach(d -> {
			d.setOrdenTrabajo(ordenTrabajo);
		});
		return dao.save(ordenTrabajo);
	}

	@Override
	public OrdenTrabajo actualizarOrdenBase(OrdenTrabajo ordenTrabajo) {
		return dao.save(ordenTrabajo);
	}

	@Override
	public OrdenTrabajo getOrdenPorId(String id) {
		return dao.findOne(id);
	}
}
