package ec.edu.epn.laboratorios.contoller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ec.edu.epn.laboratorios.exception.ModeloNotFoundException;
import ec.edu.epn.laboratorios.model.Cliente;
import ec.edu.epn.laboratorios.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Cliente>> getClientes() {
		List<Cliente> clientes = new ArrayList<>();
		clientes = service.getClientes();
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}

	// http://pc01ext30:8080/clientes/1019
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}", produces = "application/json")
	public Cliente getClientesPorId(@PathVariable("id") String id) {
		Cliente cliente = service.getClientesPorId(id);
		if(cliente == null) {
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		return service.getClientesPorId(id);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> ingresarCliente(@RequestBody Cliente cliente) {
		Cliente cli = new Cliente();
		cli = service.ingresarCliente(cliente);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cliente.getId_cliente()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> actualizarCliente(@RequestBody Cliente cliente) {
		service.actualizarCliente(cliente);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	// http://pc01ext30:8080/clientes/1019
	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarCliente(@PathVariable("id") String id) {
		Cliente cliente = service.getClientesPorId(id);
		if(cliente == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}else {
			service.eliminarCliente(id);
		}
	}
}
