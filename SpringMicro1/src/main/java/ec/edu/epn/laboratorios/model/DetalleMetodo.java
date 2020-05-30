package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
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
		name = "detalleMetodoSecuencia", 
		sequenceName = "secuencia_detallemetodo", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "detallemetodo")
public class DetalleMetodo {
	
	@Id
	@GeneratedValue(generator = "DetalleMetodogenerator")
	@GenericGenerator(name = "DetalleMetodogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_detallemetodo"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_detallemetodo;
	
	@Column(name = "id_existencia", nullable = false)
	private String id_existencia;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_metodo", nullable = false)
	private Metodo metodo;
	
	private String id_umedida;
	private double cantidad_dmt;
	private String aux;
	private String aux2;
	
	public String getId_existencia() {
		return id_existencia;
	}
	public void setId_existencia(String id_existencia) {
		this.id_existencia = id_existencia;
	}
	
	public Metodo getMetodo() {
		return metodo;
	}
	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}
	public String getId_detallemetodo() {
		return id_detallemetodo;
	}
	public void setId_detallemetodo(String id_detallemetodo) {
		this.id_detallemetodo = id_detallemetodo;
	}
	public String getId_umedida() {
		return id_umedida;
	}
	public void setId_umedida(String id_umedida) {
		this.id_umedida = id_umedida;
	}
	public double getCantidad_dmt() {
		return cantidad_dmt;
	}
	public void setCantidad_dmt(double cantidad_dmt) {
		this.cantidad_dmt = cantidad_dmt;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
	}
	public String getAux2() {
		return aux2;
	}
	public void setAux2(String aux2) {
		this.aux2 = aux2;
	}
}
