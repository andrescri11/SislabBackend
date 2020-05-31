package ec.edu.epn.laboratorios.service;

import java.util.List;

import ec.edu.epn.laboratorios.model.Factura;

public interface FacturaService {
	List<Factura> getFactura();
	Factura actualizarFactura(Factura factura);
	Factura ingresarFactura(Factura factura);
	void eliminarFactura(String id);
}
