package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "presentacionSecuencia", 
		sequenceName = "secuencia_presentacion", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "presentacion")
public class Presentacion {
	
	public String getId_presentacion() {
		return id_presentacion;
	}
	public void setId_presentacion(String id_presentacion) {
		this.id_presentacion = id_presentacion;
	}
	public String getNombre_prs() {
		return nombre_prs;
	}
	public void setNombre_prs(String nombre_prs) {
		this.nombre_prs = nombre_prs;
	}
	public String getDescr_prs() {
		return descr_prs;
	}
	public void setDescr_prs(String descr_prs) {
		this.descr_prs = descr_prs;
	}
	@Id
	@GeneratedValue(generator = "Presentaciongenerator")
	@GenericGenerator(name = "Presentaciongenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_presentacion"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_presentacion;
	
	private String nombre_prs;
	private String descr_prs;

}
