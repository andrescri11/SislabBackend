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
@Table(name = "riesgoespecifico")
public class RiesgoEspecifico {

	public String getId_riesgoespecifico() {
		return id_riesgoespecifico;
	}
	public void setId_riesgoespecifico(String id_riesgoespecifico) {
		this.id_riesgoespecifico = id_riesgoespecifico;
	}
	public String getNombre_re() {
		return nombre_re;
	}
	public void setNombre_re(String nombre_re) {
		this.nombre_re = nombre_re;
	}
	public String getDescr_re() {
		return descr_re;
	}
	public void setDescr_re(String descr_re) {
		this.descr_re = descr_re;
	}
	@Id
	@GeneratedValue(generator = "TipoProductogenerator")
	@GenericGenerator(name = "TipoProductogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tipoproducto"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_riesgoespecifico;
	
	private String nombre_re;
	private String descr_re;
}
