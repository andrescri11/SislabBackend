package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SequenceGenerator(
		name = "detalleOrdenSecuencia", 
		sequenceName = "secuencia_detalle_ordent", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "detalleorden")
public class DetalleOrden {
	
	@Id
	@GeneratedValue(generator = "DetalleOrdengenerator")
	@GenericGenerator(name = "DetalleOrdengenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_detalle_ordent"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_detalleorden;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_orden", nullable = false)
	private OrdenTrabajo ordenTrabajo;
	
	//private String id_muestra;
	@ManyToOne
	@JoinColumn(name = "id_muestra", nullable = true)
	private Muestra muestra;
	
	//private String id_personal;
	@ManyToOne
	@JoinColumn(name = "id_personal", nullable = false)
	private Personal personal;
	
	private Double horas_trabajo;
	private LocalDate fecha_inicio_analisis;
	private LocalDate fecha_fin_analisis;
	private String id_servicio;
	private String id_metodo;
	private String estado_dot;
	private Integer size_existencias;
	
	public String getId_detalleorden() {
		return id_detalleorden;
	}
	public void setId_detalleorden(String id_detalleorden) {
		this.id_detalleorden = id_detalleorden;
	}
	public OrdenTrabajo getOrdenTrabajo() {
		return ordenTrabajo;
	}
	public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
		this.ordenTrabajo = ordenTrabajo;
	}
	public Muestra getMuestra() {
		return muestra;
	}
	public void setMuestra(Muestra muestra) {
		this.muestra = muestra;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public Double getHoras_trabajo() {
		return horas_trabajo;
	}
	public void setHoras_trabajo(Double horas_trabajo) {
		this.horas_trabajo = horas_trabajo;
	}
	public LocalDate getFecha_inicio_analisis() {
		return fecha_inicio_analisis;
	}
	public void setFecha_inicio_analisis(LocalDate fecha_inicio_analisis) {
		this.fecha_inicio_analisis = fecha_inicio_analisis;
	}
	public LocalDate getFecha_fin_analisis() {
		return fecha_fin_analisis;
	}
	public void setFecha_fin_analisis(LocalDate fecha_fin_analisis) {
		this.fecha_fin_analisis = fecha_fin_analisis;
	}
	public String getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(String id_servicio) {
		this.id_servicio = id_servicio;
	}
	public String getId_metodo() {
		return id_metodo;
	}
	public void setId_metodo(String id_metodo) {
		this.id_metodo = id_metodo;
	}
	public String getEstado_dot() {
		return estado_dot;
	}
	public void setEstado_dot(String estado_dot) {
		this.estado_dot = estado_dot;
	}
	public Integer getSize_existencias() {
		return size_existencias;
	}
	public void setSize_existencias(Integer size_existencias) {
		this.size_existencias = size_existencias;
	}
	

}
