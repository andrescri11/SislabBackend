package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "tipoProductoSecuencia", 
		sequenceName = "secuencia_tipoproducto", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tipoproducto")
public class TipoProducto {

	public String getId_tipoprod() {
		return id_tipoprod;
	}
	public void setId_tipoprod(String id_tipoprod) {
		this.id_tipoprod = id_tipoprod;
	}
	public String getNombre_tprod() {
		return nombre_tprod;
	}
	public void setNombre_tprod(String nombre_tprod) {
		this.nombre_tprod = nombre_tprod;
	}
	public String getDescr_tprod() {
		return descr_tprod;
	}
	public void setDescr_tprod(String descr_tprod) {
		this.descr_tprod = descr_tprod;
	}
	@Id
	@GeneratedValue(generator = "tipoProductogenerator")
	@GenericGenerator(name = "tipoProductogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tipoproducto"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tipoprod;
	
	private String nombre_tprod;
	private String descr_tprod;
}
