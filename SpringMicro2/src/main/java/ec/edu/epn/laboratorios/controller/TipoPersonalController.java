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

import ec.edu.epn.laboratorios.model.TipoPersonal;
import ec.edu.epn.laboratorios.service.TipoPersonalService;

@RestController
@RequestMapping("/tipoPersonal")
public class TipoPersonalController {
	@Autowired
	private TipoPersonalService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<TipoPersonal> getTipoPersonal() {
		return service.getTipoPersonal();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public TipoPersonal ingresarTipoPersonal(@RequestBody TipoPersonal tipoPersonal) {
		return service.ingresarTipoPersonal(tipoPersonal);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public TipoPersonal actualizarPersonal(@RequestBody TipoPersonal tipoPersonal) {
		return service.actualizarTipoPersonal(tipoPersonal);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarTipoPersonal(@PathVariable("id") String id) {
		service.eliminarTipoPersonal(id);
	}
}
