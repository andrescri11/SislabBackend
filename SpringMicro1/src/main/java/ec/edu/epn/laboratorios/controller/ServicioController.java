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

import ec.edu.epn.laboratorios.model.Servicio;
import ec.edu.epn.laboratorios.service.ServicioService;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
	
	@Autowired
	private ServicioService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Servicio> getServicios() {
		return service.getServicios();
	}

	/*@GetMapping(value = "/{id}")
	public Servicio getClientesPorId(@PathVariable("id") String id) {
		return service.getClientesPorId(id);
	}*/

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Servicio ingresarServicio(@RequestBody Servicio servicio) {
		return service.ingresarServicio(servicio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Servicio actualizarServicio(@RequestBody Servicio servicio) {
		return service.actualizarServicio(servicio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarServicio(@PathVariable("id") String id) {
		service.eliminarServicio(id);;
	}
}
