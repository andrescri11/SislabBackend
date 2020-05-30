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
		name = "detalleProformaSecuencia", 
		sequenceName = "secuencia_detalleproforma", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "detalle_proforma")
public class DetalleProforma {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(generator = "DetalleProformagenerator")
	@GenericGenerator(name = "DetalleProformagenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_detalleproforma"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_detallepo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_proforma", nullable = false)
	private Proforma proforma;
	
	@ManyToOne
	@JoinColumn(name = "id_servicio", nullable = false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name = "id_metodo", nullable = false)
	private Metodo metodo;

	private Integer cantidad_po;
	private Double valorunitario_po;
	private Double totalservicio_po;
	private String id_laboratorio;
	
	public String getId_detallepo() {
		return id_detallepo;
	}
	public void setId_detallepo(String id_detallepo) {
		this.id_detallepo = id_detallepo;
	}
	
	public Proforma getProforma() {
		return proforma;
	}
	public void setProforma(Proforma proforma) {
		this.proforma = proforma;
	}
	public void setCantidad_po(Integer cantidad_po) {
		this.cantidad_po = cantidad_po;
	}
	
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Metodo getMetodo() {
		return metodo;
	}
	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}
	public Integer getCantidad_po() {
		return cantidad_po;
	}
	public Double getValorunitario_po() {
		return valorunitario_po;
	}
	public void setValorunitario_po(Double valorunitario_po) {
		this.valorunitario_po = valorunitario_po;
	}
	public Double getTotalservicio_po() {
		return totalservicio_po;
	}
	public void setTotalservicio_po(Double totalservicio_po) {
		this.totalservicio_po = totalservicio_po;
	}
	public String getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(String id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
}
