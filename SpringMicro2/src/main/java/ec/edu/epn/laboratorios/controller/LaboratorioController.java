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
import ec.edu.epn.laboratorios.model.Laboratorio;
import ec.edu.epn.laboratorios.service.LaboratorioService;

@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {
	
	@Autowired
	private LaboratorioService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Laboratorio> getLaboratorios() {
		return service.getLaboratorios();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}", produces = "application/json")
	public Laboratorio getLaboratorioPorId(@PathVariable("id") String id) {
		Laboratorio laboratorio = service.getLaboratorioPorId(id);
		if(laboratorio == null) {
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		return service.getLaboratorioPorId(id);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Laboratorio ingresarLaboratorio(@RequestBody Laboratorio laboratorio) {
		return service.ingresarLaboratorio(laboratorio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Laboratorio actualizarLaboratorio(@RequestBody Laboratorio laboratorio) {
		return service.actualizarLaboratorio(laboratorio);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarLaboratorio(@PathVariable("id") String id) {
		service.eliminarLaboratorio(id);
	}
}
