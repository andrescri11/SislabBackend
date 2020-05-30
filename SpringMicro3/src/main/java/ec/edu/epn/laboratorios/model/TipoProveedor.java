package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "tipoProveedorSecuencia", 
		sequenceName = "secuencia_tipo_proveedor", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tipoproveedor")
public class TipoProveedor {

	public String getId_tipoproveedor() {
		return id_tipoproveedor;
	}
	public void setId_tipoproveedor(String id_tipoproveedor) {
		this.id_tipoproveedor = id_tipoproveedor;
	}
	public String getNombre_tpv() {
		return nombre_tpv;
	}
	public void setNombre_tpv(String nombre_tpv) {
		this.nombre_tpv = nombre_tpv;
	}
	public String getDescr_tpv() {
		return descr_tpv;
	}
	public void setDescr_tpv(String descr_tpv) {
		this.descr_tpv = descr_tpv;
	}
	@Id
	@GeneratedValue(generator = "tipoProveedorgenerator")
	@GenericGenerator(name = "tipoProveedorgenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tipo_proveedor"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tipoproveedor;
	
	private String nombre_tpv;
	private String descr_tpv;
}
