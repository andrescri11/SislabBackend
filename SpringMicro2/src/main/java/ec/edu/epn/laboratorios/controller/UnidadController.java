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
import ec.edu.epn.laboratorios.model.Unidad;
import ec.edu.epn.laboratorios.service.UnidadService;

@RestController
@RequestMapping("/unidad")
public class UnidadController {
	@Autowired
	private UnidadService service;

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<Unidad> getUnidad() {
		return service.getUnidad();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}")
	public Unidad consultarUnidad(@PathVariable("id") String idStr) {
		System.out.print("NO pasa la consutla");
		Integer id = Integer.parseInt(idStr);
		Unidad unidad = service.consultarUnidad(id);
		System.out.print("Pasa la consutla");
		if(unidad == null) {
			System.out.print("Entra if");
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		System.out.print("muere");
		System.out.print(unidad);
		return unidad;
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Unidad ingresarUnidad(@RequestBody Unidad unidad) {
		return service.ingresarUnidad(unidad);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Unidad actualizarUnidad
	(@RequestBody Unidad unidad) {
		return service.actualizarUnidad(unidad);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarUnidad(@PathVariable("id") Integer id) {
		service.eliminarUnidad(id);
	}
}
