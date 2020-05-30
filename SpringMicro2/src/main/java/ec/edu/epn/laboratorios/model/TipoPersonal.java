package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "tipoPersonalSecuencia", 
		sequenceName = "secuencia_tipo_personal", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tipopersonal")
public class TipoPersonal {
	
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipoPersonalSecuencia")
	@Id
	@GeneratedValue(generator = "TipoPersonalgenerator")
	@GenericGenerator(name = "TipoPersonalgenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tipo_personal"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tipopersonal;
	
	private String nombre_tp;
	private String descr_tp;
	
	public String getId_tipopersonal() {
		return id_tipopersonal;
	}
	public void setId_tipopersonal(String id_tipopersonal) {
		this.id_tipopersonal = id_tipopersonal;
	}
	public String getNombre_tp() {
		return nombre_tp;
	}
	public void setNombre_tp(String nombre_tp) {
		this.nombre_tp = nombre_tp;
	}
	public String getDescr_tp() {
		return descr_tp;
	}
	public void setDescr_tp(String descr_tp) {
		this.descr_tp = descr_tp;
	}

}
