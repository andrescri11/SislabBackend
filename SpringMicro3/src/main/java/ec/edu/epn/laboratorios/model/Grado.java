package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "gradoSecuencia", 
		sequenceName = "secuencia_grado", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "grado")
public class Grado {
	
	public String getId_grado() {
		return id_grado;
	}
	public void setId_grado(String id_grado) {
		this.id_grado = id_grado;
	}
	public String getNombre_gr() {
		return nombre_gr;
	}
	public void setNombre_gr(String nombre_gr) {
		this.nombre_gr = nombre_gr;
	}
	public String getDescr_gr() {
		return descr_gr;
	}
	public void setDescr_gr(String descr_gr) {
		this.descr_gr = descr_gr;
	}
	@Id
	@GeneratedValue(generator = "Gradogenerator")
	@GenericGenerator(name = "Gradogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_grado"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_grado;
	
	private String nombre_gr;
	private String descr_gr;

}
