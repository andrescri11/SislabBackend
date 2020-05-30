package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidad")
public class Unidad {
	
	@Id
	private Integer id_unidad;
	
	@Column(name = "nombre_u", nullable = false)
	private String nombre_u;
	
	@Column(name = "jefe_u", nullable = false)
	private String jefe_u;
	
	private String descr_u;
	private String sigla_u;
	private String direccion_u;
	private String telefono_u;
	private String contacto1_u;
	private String contacto2_u;
	private String tel_cont1_u;
	private String tel_cont2_u;
	private String email_cont1_u;
	private String email_cont2_u;
	
	@Column(name = "codigo_u", nullable = false)
	private String codigo_u;
	
	private String aux_id_unid;

	public Integer getId_unidad() {
		return id_unidad;
	}

	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}

	public String getNombre_u() {
		return nombre_u;
	}

	public void setNombre_u(String nombre_u) {
		this.nombre_u = nombre_u;
	}

	public String getJefe_u() {
		return jefe_u;
	}

	public void setJefe_u(String jefe_u) {
		this.jefe_u = jefe_u;
	}

	public String getDescr_u() {
		return descr_u;
	}

	public void setDescr_u(String descr_u) {
		this.descr_u = descr_u;
	}

	public String getSigla_u() {
		return sigla_u;
	}

	public void setSigla_u(String sigla_u) {
		this.sigla_u = sigla_u;
	}

	public String getDireccion_u() {
		return direccion_u;
	}

	public void setDireccion_u(String direccion_u) {
		this.direccion_u = direccion_u;
	}

	public String getTelefono_u() {
		return telefono_u;
	}

	public void setTelefono_u(String telefono_u) {
		this.telefono_u = telefono_u;
	}

	public String getContacto1_u() {
		return contacto1_u;
	}

	public void setContacto1_u(String contacto1_u) {
		this.contacto1_u = contacto1_u;
	}

	public String getContacto2_u() {
		return contacto2_u;
	}

	public void setContacto2_u(String contacto2_u) {
		this.contacto2_u = contacto2_u;
	}

	public String getTel_cont1_u() {
		return tel_cont1_u;
	}

	public void setTel_cont1_u(String tel_cont1_u) {
		this.tel_cont1_u = tel_cont1_u;
	}

	public String getTel_cont2_u() {
		return tel_cont2_u;
	}

	public void setTel_cont2_u(String tel_cont2_u) {
		this.tel_cont2_u = tel_cont2_u;
	}

	public String getEmail_cont1_u() {
		return email_cont1_u;
	}

	public void setEmail_cont1_u(String email_cont1_u) {
		this.email_cont1_u = email_cont1_u;
	}

	public String getEmail_cont2_u() {
		return email_cont2_u;
	}

	public void setEmail_cont2_u(String email_cont2_u) {
		this.email_cont2_u = email_cont2_u;
	}

	public String getCodigo_u() {
		return codigo_u;
	}

	public void setCodigo_u(String codigo_u) {
		this.codigo_u = codigo_u;
	}

	public String getAux_id_unid() {
		return aux_id_unid;
	}

	public void setAux_id_unid(String aux_id_unid) {
		this.aux_id_unid = aux_id_unid;
	}

}
