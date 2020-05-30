package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "estadoProductoSecuencia", 
		sequenceName = "secuencia_estadoproducto", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "estadoproducto")
public class EstadoProducto {
	
	@Id
	@GeneratedValue(generator = "EstadoProductogenerator")
	@GenericGenerator(name = "EstadoProductogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_estadoproducto"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_estadoprod;
	
	public String getId_estadoprod() {
		return id_estadoprod;
	}
	public void setId_estadoprod(String id_estadoprod) {
		this.id_estadoprod = id_estadoprod;
	}
	public String getNombre_estp() {
		return nombre_estp;
	}
	public void setNombre_estp(String nombre_estp) {
		this.nombre_estp = nombre_estp;
	}
	public String getDescr_estp() {
		return descr_estp;
	}
	public void setDescr_estp(String descr_estp) {
		this.descr_estp = descr_estp;
	}
	private String nombre_estp;
	private String descr_estp;

}
