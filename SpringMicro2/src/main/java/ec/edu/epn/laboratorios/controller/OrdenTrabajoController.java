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
import ec.edu.epn.laboratorios.model.OrdenTrabajo;
import ec.edu.epn.laboratorios.service.OrdenTrabajoService;

@RestController
@RequestMapping("/ordenTrabajo")
public class OrdenTrabajoController {
	@Autowired
	private OrdenTrabajoService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<OrdenTrabajo> getOrdenTrabajo() {
		return service.getOrdenTrabajo();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public OrdenTrabajo ingresarOrdenT(@RequestBody OrdenTrabajo ordenTrabajo) {
		return service.ingresarOrdenT(ordenTrabajo);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public OrdenTrabajo actualizarOrdenBase(@RequestBody OrdenTrabajo ordenTrabajo) {
		return service.actualizarOrdenBase(ordenTrabajo);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}", produces = "application/json")
	public OrdenTrabajo getOrdenPorId(@PathVariable("id") String id) {
		OrdenTrabajo orden = service.getOrdenPorId(id);
		if(orden == null) {
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		return service.getOrdenPorId(id);
	}
}

