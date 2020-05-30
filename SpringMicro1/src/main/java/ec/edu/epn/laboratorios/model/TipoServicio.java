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
		name = "tipoServicioSecuencia", 
		sequenceName = "secuencia_tiposervicio", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tiposervicio")
public class TipoServicio {

	@Id
	@GeneratedValue(generator = "TipoServiciogenerator")
	@GenericGenerator(name = "TipoServiciogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tiposervicio"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tiposerv;
	
	private String nombre_ts;
	private String descr_ts;
	
	public String getId_tiposerv() {
		return id_tiposerv;
	}
	public void setId_tiposerv(String id_tiposerv) {
		this.id_tiposerv = id_tiposerv;
	}
	public String getNombre_ts() {
		return nombre_ts;
	}
	public void setNombre_ts(String nombre_ts) {
		this.nombre_ts = nombre_ts;
	}
	public String getDescr_ts() {
		return descr_ts;
	}
	public void setDescr_ts(String descr_ts) {
		this.descr_ts = descr_ts;
	}
	
	
}
