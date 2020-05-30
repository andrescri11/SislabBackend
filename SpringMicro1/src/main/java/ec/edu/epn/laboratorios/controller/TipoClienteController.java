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

import ec.edu.epn.laboratorios.model.TipoCliente;
import ec.edu.epn.laboratorios.service.TipoClienteService;

@RestController
@RequestMapping("/tipoClientes")
public class TipoClienteController {
	
	@Autowired
	private TipoClienteService service;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping
	public List<TipoCliente> getTcliente() {
		return service.getTcliente();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}")
	public TipoCliente consultarTipoCliente(@PathVariable("id") String id) {
		return service.consultarTipoCliente(id);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public TipoCliente ingresarTipoCliente(@RequestBody TipoCliente tipoCliente) {
		return service.ingresarTipoCliente(tipoCliente);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public TipoCliente actualizarTipoCliente(@RequestBody TipoCliente tipoCliente) {
		return service.actualizarTipoCliente(tipoCliente);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarTipoCliente(@PathVariable("id") String id) {
		service.eliminarTipoCliente(id);
	}
}
