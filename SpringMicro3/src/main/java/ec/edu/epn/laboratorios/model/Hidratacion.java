package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "HidratacionSecuencia", 
		sequenceName = "secuencia_hidratacion", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "hidratacion")
public class Hidratacion {

	public String getId_hidratacion() {
		return id_hidratacion;
	}
	public void setId_hidratacion(String id_hidratacion) {
		this.id_hidratacion = id_hidratacion;
	}
	public String getNombre_hi() {
		return nombre_hi;
	}
	public void setNombre_hi(String nombre_hi) {
		this.nombre_hi = nombre_hi;
	}
	public String getDescr_hi() {
		return descr_hi;
	}
	public void setDescr_hi(String descr_hi) {
		this.descr_hi = descr_hi;
	}
	@Id
	@GeneratedValue(generator = "Hidrataciongenerator")
	@GenericGenerator(name = "Hidrataciongenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_hidratacion"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_hidratacion;
	
	private String nombre_hi;
	private String descr_hi;

}
