package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "posgiroSecuencia", 
		sequenceName = "secuencia_postgiro", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "posgiro")
public class Posgiro {
	
	public String getId_posgiro() {
		return id_posgiro;
	}
	public void setId_posgiro(String id_posgiro) {
		this.id_posgiro = id_posgiro;
	}
	public String getNombre_pg() {
		return nombre_pg;
	}
	public void setNombre_pg(String nombre_pg) {
		this.nombre_pg = nombre_pg;
	}
	public String getDescr_pg() {
		return descr_pg;
	}
	public void setDescr_pg(String descr_pg) {
		this.descr_pg = descr_pg;
	}
	@Id
	@GeneratedValue(generator = "Posgirogenerator")
	@GenericGenerator(name = "Posgirogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_postgiro"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_posgiro;
	
	private String nombre_pg;
	private String descr_pg;

}
