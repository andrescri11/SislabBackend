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

import ec.edu.epn.laboratorios.model.CargosPersonal;
import ec.edu.epn.laboratorios.service.CargosPersonalService;

@RestController
@RequestMapping("/cargosPersonal")
public class CargosPersonalController {
	
	@Autowired
	private CargosPersonalService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<CargosPersonal> getListaCargosPersonal() {
		return service.getListaCargosPersonal();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public CargosPersonal ingresarCargoP(@RequestBody CargosPersonal cargosPersonal) {
		return service.ingresarCargoP(cargosPersonal);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public CargosPersonal actualizarCargosP(@RequestBody CargosPersonal cargosPersonal) {
		return service.actualizarCargosP(cargosPersonal);
	}

	// http://pc01ext30:8080/clientes/1019
	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarCargosPersonal(@PathVariable("id") String id) {
		service.eliminarCargoPersonal(id);
	}
}
