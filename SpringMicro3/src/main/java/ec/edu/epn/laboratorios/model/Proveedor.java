package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "proveedorSecuencia", 
		sequenceName = "secuencia_proveedor", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(generator = "Proveedorgenerator")
	@GenericGenerator(name = "Proveedorgenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_proveedor"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_proveedor;
	
	@ManyToOne
	@JoinColumn(name = "id_tipoproveedor")
	private TipoProveedor tipoProveedor;
	//private String id_tipoproveedor;
	
	private String nombre_pv;
	public String getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public TipoProveedor getTipoProveedor() {
		return tipoProveedor;
	}
	public void setTipoProveedor(TipoProveedor tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}
	public String getNombre_pv() {
		return nombre_pv;
	}
	public void setNombre_pv(String nombre_pv) {
		this.nombre_pv = nombre_pv;
	}
	public String getRuc_pv() {
		return ruc_pv;
	}
	public void setRuc_pv(String ruc_pv) {
		this.ruc_pv = ruc_pv;
	}
	public String getDireccion_pv() {
		return direccion_pv;
	}
	public void setDireccion_pv(String direccion_pv) {
		this.direccion_pv = direccion_pv;
	}
	public String getTelefono_pv() {
		return telefono_pv;
	}
	public void setTelefono_pv(String telefono_pv) {
		this.telefono_pv = telefono_pv;
	}
	public String getEmail_pv() {
		return email_pv;
	}
	public void setEmail_pv(String email_pv) {
		this.email_pv = email_pv;
	}
	public String getDescr_pv() {
		return descr_pv;
	}
	public void setDescr_pv(String descr_pv) {
		this.descr_pv = descr_pv;
	}
	private String ruc_pv;
	private String direccion_pv;
	private String telefono_pv;
	private String email_pv;
	private String descr_pv;

}
