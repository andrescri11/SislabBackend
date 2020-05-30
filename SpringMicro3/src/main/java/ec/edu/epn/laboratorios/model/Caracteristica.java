package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "caracteristicaSecuencia", 
		sequenceName = "secuencia_caracteristica", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "caracteristica")
public class Caracteristica {
	
	@Id
	@GeneratedValue(generator = "Caracteristicagenerator")
	@GenericGenerator(name = "Caracteristicagenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_caracteristica"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_caracteristica;
	
	public String getId_caracteristica() {
		return id_caracteristica;
	}
	public void setId_caracteristica(String id_caracteristica) {
		this.id_caracteristica = id_caracteristica;
	}
	public String getNombre_cr() {
		return nombre_cr;
	}
	public void setNombre_cr(String nombre_cr) {
		this.nombre_cr = nombre_cr;
	}
	public String getDescr_cr() {
		return descr_cr;
	}
	public void setDescr_cr(String descr_cr) {
		this.descr_cr = descr_cr;
	}
	private String nombre_cr;
	private String descr_cr;

}
