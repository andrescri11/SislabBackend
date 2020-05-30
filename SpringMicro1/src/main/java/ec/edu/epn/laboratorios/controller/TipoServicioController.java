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

import ec.edu.epn.laboratorios.model.TipoServicio;
import ec.edu.epn.laboratorios.service.TipoServicioService;

@RestController
@RequestMapping("/tipoServicio")
public class TipoServicioController {

	@Autowired
	private TipoServicioService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<TipoServicio> getTipoServicio() {
		return service.getTipoServicio();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}")
	public TipoServicio consultarTipoServicio(@PathVariable("id") String id) {
		return service.consultarTipoServicio(id);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public TipoServicio ingresarTipoServicio(@RequestBody TipoServicio tiposervicio) {
		return service.ingresarTipoServicio(tiposervicio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public TipoServicio actualizarTipoServicio(@RequestBody TipoServicio tiposervicio) {
		return service.actualizarTipoServicio(tiposervicio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarTipoServicio(@PathVariable("id") String id) {
		service.eliminarTipoServicio(id);
	}

}
