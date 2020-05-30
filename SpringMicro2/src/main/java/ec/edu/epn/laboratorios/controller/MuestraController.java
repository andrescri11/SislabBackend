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

import ec.edu.epn.laboratorios.model.Muestra;
import ec.edu.epn.laboratorios.service.MuestraService;

@RestController
@RequestMapping("/muestra")
public class MuestraController implements MuestraService{
	
	@Autowired
	private MuestraService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Muestra> getMuestra() {
		return service.getMuestra();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Muestra ingresarMuestra(@RequestBody Muestra muestra) {
		return service.ingresarMuestra(muestra);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Muestra actualizarMuestra(@RequestBody Muestra muestra) {
		return service.actualizarMuestra(muestra);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarMuestra(@PathVariable("id") String id) {
		service.eliminarMuestra(id);
	}

}
