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

import ec.edu.epn.laboratorios.model.Personal;
import ec.edu.epn.laboratorios.service.PersonalService;

@RestController
@RequestMapping("/personal")
public class PersonalController {
	@Autowired
	private PersonalService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Personal> getListaPersonal() {
		return service.getListaPersonal();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Personal ingresarPersonal(@RequestBody Personal personal) {
		return service.ingresarPersonal(personal);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Personal actualizarPersonal(@RequestBody Personal personal) {
		return service.actualizarPersonal(personal);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarPersonal(@PathVariable("id") String id) {
		service.eliminarPersonal(id);
	}
}
