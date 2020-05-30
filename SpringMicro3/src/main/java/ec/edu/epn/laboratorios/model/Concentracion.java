package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "concentracionSecuencia", 
		sequenceName = "secuencia_concentracion", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "concentracion")
public class Concentracion {

	public String getId_concentracion() {
		return id_concentracion;
	}

	public void setId_concentracion(String id_concentracion) {
		this.id_concentracion = id_concentracion;
	}

	public String getNombre_con() {
		return nombre_con;
	}

	public void setNombre_con(String nombre_con) {
		this.nombre_con = nombre_con;
	}

	public String getDescr_con() {
		return descr_con;
	}

	public void setDescr_con(String descr_con) {
		this.descr_con = descr_con;
	}

	@Id
	@GeneratedValue(generator = "Concentraciongenerator")
	@GenericGenerator(name = "Concentraciongenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_concentracion"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_concentracion;
	
	@Column(name = "nombre_con", nullable = false)
	private String nombre_con;
	
	private String descr_con;
	
}
