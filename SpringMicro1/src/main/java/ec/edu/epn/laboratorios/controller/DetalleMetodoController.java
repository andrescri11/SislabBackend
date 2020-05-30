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
import ec.edu.epn.laboratorios.model.DetalleMetodo;
import ec.edu.epn.laboratorios.service.DetalleMetodoService;

@RestController
@RequestMapping("/detalleMetodo")
public class DetalleMetodoController {

	@Autowired 
	DetalleMetodoService service;
	
	/*
	@GetMapping
	public List<DetalleMetodo> getDatosDm() {
		return service.getDatosDm();
	}*/
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<DetalleMetodo>> getDatosDm() {
		List<DetalleMetodo> detallesMetodo = new ArrayList<>();
		detallesMetodo = service.getDatosDm();
		return new ResponseEntity<List<DetalleMetodo>>(detallesMetodo, HttpStatus.OK);
	}

	
	/*@GetMapping(value = "/{id}")
	public DetalleMetodo obtenerDatosProductoPorIdExistencia(@PathVariable("id") String id) {
		return service.obtenerDatosProductoPorIdExistencia(id);
	}*/
	// http://pc01ext30:8080/clientes/1019
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/{id}", produces = "application/json")
	public DetalleMetodo obtenerDatosProductoPorIdExistencia(@PathVariable("id") String id) {
		DetalleMetodo detalleMetodo = service.obtenerDatosProductoPorIdExistencia(id);
		if(detalleMetodo == null) {
			throw new  ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		return service.obtenerDatosProductoPorIdExistencia(id);
	}
		

	/*@PostMapping(consumes = "application/json", produces = "application/json")
	public DetalleMetodo ingresarDtMetodo(@RequestBody DetalleMetodo dm) {
		return service.ingresarDtMetodo(dm);
	}*/
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> ingresarDtMetodo(@RequestBody DetalleMetodo dm) {
		DetalleMetodo detMetodo = new DetalleMetodo();
		detMetodo = service.ingresarDtMetodo(dm);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dm.getId_detallemetodo()).toUri();
		return ResponseEntity.created(location).build();
	}
	

	/*@PutMapping(consumes = "application/json", produces = "application/json")
	public DetalleMetodo actualizarDetalleMetodoBDD(@RequestBody DetalleMetodo dm) {
		return service.actualizarDetalleMetodoBDD(dm);
	}*/
	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> actualizarDetalleMetodoBDD(@RequestBody DetalleMetodo dm) {
		service.actualizarDetalleMetodoBDD(dm);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	

	// http://pc01ext30:8080/clientes/1019
	/*@DeleteMapping(value = "/{id}")
	public void eliminarDetalleMetodo(@PathVariable("id") String id) {
		service.eliminarDetalleMetodo(id);;
	}*/
	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping(value = "/{id}")
	public void eliminarDetalleMetodo(@PathVariable("id") String id) {
		DetalleMetodo dm = service.obtenerDatosProductoPorIdExistencia(id);
		if(dm == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}else {
			service.eliminarDetalleMetodo(id);
		}
	}
}
