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
import ec.edu.epn.laboratorios.model.LaboratorioUsuario;
import ec.edu.epn.laboratorios.service.LaboratorioUsuarioService;

@RestController
@RequestMapping("/laboratorioUsuario")
public class LaboratorioUsuarioController {
	
	@Autowired
	private LaboratorioUsuarioService service;

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<LaboratorioUsuario> getListaLabUsuario() {
		return service.getListaLabUsuario();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public LaboratorioUsuario ingresarLabUsuario(@RequestBody LaboratorioUsuario listaLaboratorioUsuario) {
		return service.ingresarLabUsuario(listaLaboratorioUsuario);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public LaboratorioUsuario actualizarLabUsuario(@RequestBody LaboratorioUsuario listaLaboratorioUsuario) {
		return service.actualizarLabUsuario(listaLaboratorioUsuario);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarLabUsuario(@PathVariable("id") String id) {
		service.eliminarLabUsuario(id);
	}
}
