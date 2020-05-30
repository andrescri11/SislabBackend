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

import ec.edu.epn.laboratorios.model.DetalleMetodo;
import ec.edu.epn.laboratorios.model.DetalleProforma;
import ec.edu.epn.laboratorios.service.DetalleProformaService;

@RestController
@RequestMapping("/detalleProforma")
public class DetalleProformaController {
	
	@Autowired
	private DetalleProformaService service;	

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<DetalleProforma> getDetalleProforma() {
		return service.getDetalleProforma();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public DetalleProforma ingresarDetalleProf(@RequestBody DetalleProforma detalleProforma) {
		return service.ingresarDetalleProf(detalleProforma);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public DetalleProforma actualizarDetalleProfBase(@RequestBody DetalleProforma detalleProforma) {
		return service.actualizarDetalleProfBase(detalleProforma);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarDetalleProforma(@PathVariable("id") String id) {
		service.eliminarDetalleProforma(id);;
	}

}
