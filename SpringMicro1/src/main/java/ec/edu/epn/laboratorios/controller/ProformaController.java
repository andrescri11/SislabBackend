package ec.edu.epn.laboratorios.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.epn.laboratorios.exception.ModeloNotFoundException;
import ec.edu.epn.laboratorios.model.Proforma;
import ec.edu.epn.laboratorios.service.ProformaService;

@RestController
@RequestMapping("/proformas")
public class ProformaController {
	@Autowired
	
	private ProformaService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Proforma> getListarProf() {
		return service.getListarProf();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}")
	public Proforma obtenerDatosClienteVerProforma(@PathVariable("id") String id) {
		return service.obtenerDatosClienteVerProforma(id);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Proforma ingresarProforma(@RequestBody Proforma proforma) {
		return service.ingresarProforma(proforma);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}", produces = "application/json")
	public Proforma getProformaPorId(@PathVariable("id") String id) {
		Proforma proforma = service.getProformaPorId(id);
		if(proforma == null) {
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		return service.getProformaPorId(id);
	}

	
	/* @PostMapping(consumes = "application/json", produces = "application/json")
	public Proforma ingresarProforma(@RequestBody Proforma proforma, String fechaActual, String representante) {
		return service.ingresarProforma(proforma, fechaActual, representante);
	} */

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Proforma actualizarProfBase(@RequestBody Proforma proforma) {
		return service.actualizarProfBase(proforma);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarProforma(@PathVariable("id") String id) {
		service.eliminarProforma(id);
	}
}
