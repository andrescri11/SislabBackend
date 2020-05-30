package ec.edu.epn.laboratorios.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@SequenceGenerator(
		name = "clienteSecuencia", 
		sequenceName = "secuencia_cliente", 
		initialValue = 1, 
		allocationSize = 1)

@ApiModel(description = "Información del cliente")
@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clienteSecuencia")
	@GeneratedValue(generator = "Clientegenerator")
	@GenericGenerator(name = "Clientegenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_cliente"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_cliente;

	@ManyToOne
	@JoinColumn(name = "id_tipocliente", nullable = false)
	private TipoCliente tipoCliente;

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@ApiModelProperty(notes = "Nombre debe tener mínimo 2 caracteres")
	@Size(min = 2, message = "Nombre debe tener mínimo 2 caracteres")
	@Column(name = "nombre_cl", nullable = false)
	private String nombre_cl;

	@Column(name = "direccion_cl", nullable = false)
	private String direccion_cl;

	@ApiModelProperty(notes = "Cedula debe tener 10 caracteres")
	@Size(min = 10, max = 10, message = "Cedula debe tener 10 caracteres")
	private String cedula;
	
	private String ruc_cl;
	
	@ApiModelProperty(notes = "Telefono debe tener mínimo 7 caracteres")
	@Size(min = 7, message = "Telefono debe tener mínimo 7 caracteres")
	private String telefono_cl;
	
	@Size(min = 7, message = "Telefono debe tener mínimo 7 caracteres")
	private String otrofono_cl;
	
	private String celular_cl;
	private String fax_cl;
	private String email_cl;
	private String contacto_cl;
	private String nombre_usuario;
	private Date fechatrans;
	private String pasaporte_cl;

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getRuc_cl() {
		return ruc_cl;
	}

	public void setRuc_cl(String ruc_cl) {
		this.ruc_cl = ruc_cl;
	}

	public String getNombre_cl() {
		return nombre_cl;
	}

	public void setNombre_cl(String nombre_cl) {
		this.nombre_cl = nombre_cl;
	}

	public String getDireccion_cl() {
		return direccion_cl;
	}

	public void setDireccion_cl(String direccion_cl) {
		this.direccion_cl = direccion_cl;
	}

	public String getTelefono_cl() {
		return telefono_cl;
	}

	public void setTelefono_cl(String telefono_cl) {
		this.telefono_cl = telefono_cl;
	}

	public String getOtrofono_cl() {
		return otrofono_cl;
	}

	public void setOtrofono_cl(String otrofono_cl) {
		this.otrofono_cl = otrofono_cl;
	}

	public String getCelular_cl() {
		return celular_cl;
	}

	public void setCelular_cl(String celular_cl) {
		this.celular_cl = celular_cl;
	}

	public String getFax_cl() {
		return fax_cl;
	}

	public void setFax_cl(String fax_cl) {
		this.fax_cl = fax_cl;
	}

	public String getEmail_cl() {
		return email_cl;
	}

	public void setEmail_cl(String email_cl) {
		this.email_cl = email_cl;
	}

	public String getContacto_cl() {
		return contacto_cl;
	}

	public void setContacto_cl(String contacto_cl) {
		this.contacto_cl = contacto_cl;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public Date getFechatrans() {
		return fechatrans;
	}

	public void setFechatrans(Date fechatrans) {
		this.fechatrans = fechatrans;
	}

	public String getPasaporte_cl() {
		return pasaporte_cl;
	}

	public void setPasaporte_cl(String pasaporte_cl) {
		this.pasaporte_cl = pasaporte_cl;
	}

}
