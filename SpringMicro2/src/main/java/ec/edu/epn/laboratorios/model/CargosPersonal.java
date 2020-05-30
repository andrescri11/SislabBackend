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
		name = "cargoPersonalSecuencia", 
		sequenceName = "secuencia_cargopersonal", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "cargospersonal")
public class CargosPersonal {

	@Id
	@GeneratedValue(generator = "CargoPersonalgenerator")
	@GenericGenerator(name = "CargoPersonalgenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_cargopersonal"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_cargo;

	private String nombre_cp;
	private String descr_cp;
	
	public String getId_cargo() {
		return id_cargo;
	}
	public void setId_cargo(String id_cargo) {
		this.id_cargo = id_cargo;
	}
	public String getNombre_cp() {
		return nombre_cp;
	}
	public void setNombre_cp(String nombre_cp) {
		this.nombre_cp = nombre_cp;
	}
	public String getDescr_cp() {
		return descr_cp;
	}
	public void setDescr_cp(String descr_cp) {
		this.descr_cp = descr_cp;
	}
}
