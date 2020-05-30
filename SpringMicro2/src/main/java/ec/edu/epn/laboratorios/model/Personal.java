package ec.edu.epn.laboratorios.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
	
	@Id
	private String id_personal;
	
	@Column(name = "cedula_pe", nullable = false)
	private String cedula_pe;
	
	@Column(name = "nombres_pe", nullable = false)
	private String nombres_pe;
	
	@Column(name = "direccion_pe", nullable = false)
	private String direccion_pe;
	
	@Column(name = "email_pe", nullable = false)
	private String email_pe;
	
	@Column(name = "sueldo_pe", nullable = false)
	private Double sueldo_pe;
	
	@Column(name = "fechaing_pe", nullable = false)
	private Date fechaing_pe;
	
	//private String id_tipopersonal;
	@ManyToOne
	@JoinColumn(name = "id_tipopersonal", nullable = false)
	private TipoPersonal tipoPersonal;
	
	//private String id_cargo;
	@ManyToOne
	@JoinColumn(name = "id_cargo", nullable = false)
	private CargosPersonal cargosPersonal;
	
	private String telefono_pe;
	private String cargo_pe;
	private String tipo_pe;
	private Date fechafin_pe;
	private Integer aux_idpersonal;
	private Integer id_unidad;
	
	public String getId_personal() {
		return id_personal;
	}
	public void setId_personal(String id_personal) {
		this.id_personal = id_personal;
	}
	public String getCedula_pe() {
		return cedula_pe;
	}
	public void setCedula_pe(String cedula_pe) {
		this.cedula_pe = cedula_pe;
	}
	public String getNombres_pe() {
		return nombres_pe;
	}
	public void setNombres_pe(String nombres_pe) {
		this.nombres_pe = nombres_pe;
	}
	public String getDireccion_pe() {
		return direccion_pe;
	}
	public void setDireccion_pe(String direccion_pe) {
		this.direccion_pe = direccion_pe;
	}
	public String getEmail_pe() {
		return email_pe;
	}
	public void setEmail_pe(String email_pe) {
		this.email_pe = email_pe;
	}
	public Double getSueldo_pe() {
		return sueldo_pe;
	}
	public void setSueldo_pe(Double sueldo_pe) {
		this.sueldo_pe = sueldo_pe;
	}
	public Date getFechaing_pe() {
		return fechaing_pe;
	}
	public void setFechaing_pe(Date fechaing_pe) {
		this.fechaing_pe = fechaing_pe;
	}
	public TipoPersonal getTipoPersonal() {
		return tipoPersonal;
	}
	public void setTipoPersonal(TipoPersonal tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
	}
	public CargosPersonal getCargoPersonal() {
		return cargosPersonal;
	}
	public void setCargoPersonal(CargosPersonal cargoPersonal) {
		this.cargosPersonal = cargoPersonal;
	}
	public String getTelefono_pe() {
		return telefono_pe;
	}
	public void setTelefono_pe(String telefono_pe) {
		this.telefono_pe = telefono_pe;
	}
	public String getCargo_pe() {
		return cargo_pe;
	}
	public void setCargo_pe(String cargo_pe) {
		this.cargo_pe = cargo_pe;
	}
	public String getTipo_pe() {
		return tipo_pe;
	}
	public void setTipo_pe(String tipo_pe) {
		this.tipo_pe = tipo_pe;
	}
	public Date getFechafin_pe() {
		return fechafin_pe;
	}
	public void setFechafin_pe(Date fechafin_pe) {
		this.fechafin_pe = fechafin_pe;
	}
	public Integer getAux_idpersonal() {
		return aux_idpersonal;
	}
	public void setAux_idpersonal(Integer aux_idpersonal) {
		this.aux_idpersonal = aux_idpersonal;
	}
	public Integer getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}

}
