package ec.edu.epn.laboratorios.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "metodoSecuencia", 
		sequenceName = "secuencia_metodo", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "metodo")
public class Metodo {
	
	@Id
	@GeneratedValue(generator = "Metodogenerator")
	@GenericGenerator(name = "Metodogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_metodo"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_metodo;
	
	@ManyToOne
	@JoinColumn(name = "id_servicio", nullable = false)
	private Servicio servicio;
	
	private String descr_mt;
	private String certificado_mt;
	private String nombre_mt;
	private Integer aux_idmetodo;
	
	@OneToMany(mappedBy = "metodo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
			fetch = FetchType.LAZY/*en consulta, solo trae datos de maestro*/, orphanRemoval = true)
	private List<DetalleMetodo> detalleMetodo;
	
	public List<DetalleMetodo> getDetalleMetodo() {
		return detalleMetodo;
	}
	public void setDetalleMetodo(List<DetalleMetodo> detalleMetodo) {
		this.detalleMetodo = detalleMetodo;
	}
	public void setAux_idmetodo(Integer aux_idmetodo) {
		this.aux_idmetodo = aux_idmetodo;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public String getId_metodo() {
		return id_metodo;
	}
	public void setId_metodo(String id_metodo) {
		this.id_metodo = id_metodo;
	}
	public String getDescr_mt() {
		return descr_mt;
	}
	public void setDescr_mt(String descr_mt) {
		this.descr_mt = descr_mt;
	}
	public String getCertificado_mt() {
		return certificado_mt;
	}
	public void setCertificado_mt(String certificado_mt) {
		this.certificado_mt = certificado_mt;
	}
	public String getNombre_mt() {
		return nombre_mt;
	}
	public void setNombre_mt(String nombre_mt) {
		this.nombre_mt = nombre_mt;
	}
	public Integer getAux_idmetodo() {
		return aux_idmetodo;
	}
	public void setAux_idmetodo(int aux_idmetodo) {
		this.aux_idmetodo = aux_idmetodo;
	}
}
