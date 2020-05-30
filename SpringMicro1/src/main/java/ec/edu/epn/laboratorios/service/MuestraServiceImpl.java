package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.MuestraDAO;
import ec.edu.epn.laboratorios.dao.UnidadDAO;
import ec.edu.epn.laboratorios.model.Muestra;

@Service
public class MuestraServiceImpl implements MuestraService{
	
	@Autowired
	private MuestraDAO dao;
	
	@Autowired
	private UnidadDAO daoUnidad;
	
	@Override
	public List<Muestra> getMuestra() {
		return dao.findAll();
	}

	@Override
	public Muestra ingresarMuestra(Muestra muestra) {
		//construir id proforma
				String codigoUnidad, maxCod, ultimoValorSeq, muestraId = "";
				List<Object[]> resultsCodUnidad = daoUnidad.getCodigoUnidad("raul");
				List<Object[]> resultsMaxCodMuestra = dao.auxiliarCodigoMaxProforma();
				List<Object[]> ultimoValorSecuencia = dao.ultimoValorSecuencia();
				codigoUnidad = String.valueOf(resultsCodUnidad.get(0));
				if(resultsMaxCodMuestra.get(0) != null) {
					maxCod = String.valueOf(resultsMaxCodMuestra.get(0));
					Integer sigCod = Integer.parseInt(maxCod) + 1;
					maxCod = sigCod.toString();
				}else {
					maxCod = String.valueOf(ultimoValorSecuencia.get(0));
				}
				muestra.setAux_muestra(Integer.parseInt(maxCod));
				switch(maxCod.length()) {
					case 1:
						muestraId = codigoUnidad + "-MU000" + maxCod;
					break;
					case 2:
						muestraId = codigoUnidad + "-MU00" + maxCod;
					break;
					case 3:
						muestraId = codigoUnidad + "-MU0" + maxCod;
					break;
					case 4:
						muestraId = codigoUnidad + "-MU" + maxCod;
					break;
				}
		muestra.setId_muestra(muestraId);
		return dao.save(muestra);
	}

	@Override
	public Muestra actualizarMuestra(Muestra muestra) {
		return dao.save(muestra);
	}

	@Override
	public void eliminarMuestra(String id) {
		dao.delete(id);
	}
}
