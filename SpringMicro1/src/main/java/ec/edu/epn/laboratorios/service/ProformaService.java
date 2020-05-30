package ec.edu.epn.laboratorios.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.edu.epn.laboratorios.model.Metodo;
import ec.edu.epn.laboratorios.model.Proforma;

public interface ProformaService {
	List<Proforma> getListarProf();
	// Proforma ingresarProforma(Proforma proforma, String fechaActual, String representante);
	Proforma ingresarProforma(Proforma proforma);
	void eliminarProforma(String id);
	Proforma actualizarProfBase(Proforma proforma);
	Proforma obtenerDatosClienteVerProforma(String id);
	Proforma getProformaPorId(String id);
	// @Query("select * from laboratorios.metodo where id_servicio = 'idMetodo'")
	// List<Metodo> obtenerMetodos(@Param("idMetodo") String idMetodo);
	// List<Metodo> obtenerMetodos(String id_metodo);
}
