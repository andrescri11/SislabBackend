package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {
	
	@Id
	private String id_servicio;
	
	@Column(name = "id_laboratorio", nullable = false)
	private String id_laboratorio;
	
	@Column(name = "nombre_s", nullable = false)
	private String nombre_s;
	
	@Column(name = "precio_s", nullable = false)
	private Double precio_s;
	
	@ManyToOne
	@JoinColumn(name = "id_tiposerv", nullable = false)
	private TipoServicio tipoServicio;
	
	private String descr_s;
	private Integer aux_id_servicio;
	private String acreditado;
	public String getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(String id_servicio) {
		this.id_servicio = id_servicio;
	}
	public String getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(String id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
	
	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getNombre_s() {
		return nombre_s;
	}
	public void setNombre_s(String nombre_s) {
		this.nombre_s = nombre_s;
	}
	public String getDescr_s() {
		return descr_s;
	}
	public void setDescr_s(String descr_s) {
		this.descr_s = descr_s;
	}
	public Integer getAux_id_servicio() {
		return aux_id_servicio;
	}
	public void setAux_id_servicio(int aux_id_servicio) {
		this.aux_id_servicio = aux_id_servicio;
	}
	public Double getPrecio_s() {
		return precio_s;
	}
	public void setPrecio_s(Double precio_s) {
		this.precio_s = precio_s;
	}
	public String getAcreditado() {
		return acreditado;
	}
	public void setAcreditado(String acreditado) {
		this.acreditado = acreditado;
	}
}
