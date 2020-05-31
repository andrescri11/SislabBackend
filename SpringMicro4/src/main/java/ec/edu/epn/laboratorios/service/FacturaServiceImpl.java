package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.FacturaDAO;
import ec.edu.epn.laboratorios.model.Factura;

@Service
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	private FacturaDAO dao;

	@Override
	public List<Factura> getFactura() {
		return dao.findAll();
	}

	@Override
	public Factura actualizarFactura(Factura factura) {
		return dao.save(factura);
	}

	@Override
	public Factura ingresarFactura(Factura factura) {

		List<Object[]> ultimoValorSecuencia = dao.ultimoValorSecuencia();
		String maxCodProforma = String.valueOf(ultimoValorSecuencia.get(0));
		String facturaId = "";

		switch (maxCodProforma.length()) {
		case 1:
			facturaId = "F000" + maxCodProforma;
			break;
		case 2:
			facturaId = "F00" + maxCodProforma;
			break;
		case 3:
			facturaId = "F0" + maxCodProforma;
			break;
		case 4:
			facturaId = "F" + maxCodProforma;
			break;
		}
		
		factura.setId_factura(facturaId);
		factura.setId_estado_factura("PENDIENTE");
		//factura.setId_proforma(id_proforma);

		return dao.save(factura);
	}

	@Override
	public void eliminarFactura(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
}
