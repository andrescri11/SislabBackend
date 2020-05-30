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

@SequenceGenerator(
		name = "laboratorioSecuencia", 
		sequenceName = "secuencia_laboratorio", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "laboratorio")
public class Laboratorio {

	@Id
	@GeneratedValue(generator = "Laboratoriogenerator")
	@GenericGenerator(name = "Laboratoriogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_laboratorio"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_laboratorio;
	
	//private Integer id_unidad;
	@ManyToOne
	@JoinColumn(name = "id_unidad")
	private Unidad unidad;
	
	private String nombre_l;
	private String leyendaprof_l;
	private String centrocosto_l;
	private String responsable_l;
	private String email_l;
	private String direccion_l;
	private String telefono_l;
	private String fax_l;
	private String leyenda_ot_l;
	
	public String getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(String id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public Unidad getUnidad() {
		return unidad;
	}
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	public String getNombre_l() {
		return nombre_l;
	}
	public void setNombre_l(String nombre_l) {
		this.nombre_l = nombre_l;
	}
	public String getLeyendaprof_l() {
		return leyendaprof_l;
	}
	public void setLeyendaprof_l(String leyendaprof_l) {
		this.leyendaprof_l = leyendaprof_l;
	}
	public String getCentrocosto_l() {
		return centrocosto_l;
	}
	public void setCentrocosto_l(String centrocosto_l) {
		this.centrocosto_l = centrocosto_l;
	}
	public String getResponsable_l() {
		return responsable_l;
	}
	public void setResponsable_l(String responsable_l) {
		this.responsable_l = responsable_l;
	}
	public String getEmail_l() {
		return email_l;
	}
	public void setEmail_l(String email_l) {
		this.email_l = email_l;
	}
	public String getDireccion_l() {
		return direccion_l;
	}
	public void setDireccion_l(String direccion_l) {
		this.direccion_l = direccion_l;
	}
	public String getTelefono_l() {
		return telefono_l;
	}
	public void setTelefono_l(String telefono_l) {
		this.telefono_l = telefono_l;
	}
	public String getFax_l() {
		return fax_l;
	}
	public void setFax_l(String fax_l) {
		this.fax_l = fax_l;
	}
	public String getLeyenda_ot_l() {
		return leyenda_ot_l;
	}
	public void setLeyenda_ot_l(String leyenda_ot_l) {
		this.leyenda_ot_l = leyenda_ot_l;
	}
	
}
