package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "unidadMedidaSecuencia", 
		sequenceName = "secuencia_unidadmedida", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "unidadmedida")
public class UnidadMedida {
	
	public String getId_umedida() {
		return id_umedida;
	}
	public void setId_umedida(String id_umedida) {
		this.id_umedida = id_umedida;
	}
	public String getMedida_um() {
		return medida_um;
	}
	public void setMedida_um(String medida_um) {
		this.medida_um = medida_um;
	}
	public String getDescr_um() {
		return descr_um;
	}
	public void setDescr_um(String descr_um) {
		this.descr_um = descr_um;
	}
	public String getSigla_um() {
		return sigla_um;
	}
	public void setSigla_um(String sigla_um) {
		this.sigla_um = sigla_um;
	}
	@Id
	@GeneratedValue(generator = "UnidadMedidagenerator")
	@GenericGenerator(name = "UnidadMedidagenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_unidadmedida"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_umedida;
	
	private String medida_um;
	private String descr_um;
	private String sigla_um;

}
