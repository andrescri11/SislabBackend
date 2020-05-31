package ec.edu.epn.laboratorios.contoller;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ec.edu.epn.laboratorios.model.Factura;
import ec.edu.epn.laboratorios.service.FacturaService;


@RestController
@RequestMapping("/factura")

public class FacturaController {

	@Autowired
	private FacturaService service;
	
	// @PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Factura> getFactura() {
		return service.getFactura();
	}
	
	// @PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Factura ingresarFactura(@RequestBody Factura factura) {
		return service.ingresarFactura(factura);
	}

	// @PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Factura actualizarFactura(@RequestBody Factura factura) {
		return service.actualizarFactura(factura);
	}

	// @PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarFactura(@PathVariable("id") String id) {
		service.eliminarFactura(id);
	}
}
