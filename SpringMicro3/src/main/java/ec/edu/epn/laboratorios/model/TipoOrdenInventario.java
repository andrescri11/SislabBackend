package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "tipoOrdenInventarioSecuencia", 
		sequenceName = "secuencia_toi", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tipordeninv")
public class TipoOrdenInventario {
	
	@Id
	@GeneratedValue(generator = "tipoOrdenInventariogenerator")
	@GenericGenerator(name = "tipoOrdenInventariogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_toi"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tipordeninv;
	
	public String getId_tipordeninv() {
		return id_tipordeninv;
	}
	public void setId_tipordeninv(String id_tipordeninv) {
		this.id_tipordeninv = id_tipordeninv;
	}
	private String nombre_toi;
	private String descr_toi;
	public String getNombre_toi() {
		return nombre_toi;
	}
	public void setNombre_toi(String nombre_toi) {
		this.nombre_toi = nombre_toi;
	}
	public String getDescr_toi() {
		return descr_toi;
	}
	public void setDescr_toi(String descr_toi) {
		this.descr_toi = descr_toi;
	}

}
