package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import io.swagger.annotations.ApiModel;

@SequenceGenerator(
		name = "EstadoFacturaSecuencia", 
		sequenceName = "secuencia_estado_factura", 
		initialValue = 1, 
		allocationSize = 1)

@ApiModel(description = "Información del estado de factura")
@Entity
@Table(name = "estado_factura")
public class EstadoFactura {
	
	@Id
	@GeneratedValue(generator = "EstadoFacturaGenerator")
	@GenericGenerator(name = "EstadoFacturaGenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_estado_factura"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_estado_factura;
	
	private String nombre_ef;
	private String descr_ef;
	public String getId_estado_factura() {
		return id_estado_factura;
	}
	public void setId_estado_factura(String id_estado_factura) {
		this.id_estado_factura = id_estado_factura;
	}
	public String getNombre_ef() {
		return nombre_ef;
	}
	public void setNombre_ef(String nombre_ef) {
		this.nombre_ef = nombre_ef;
	}
	public String getDescr_ef() {
		return descr_ef;
	}
	public void setDescr_ef(String descr_ef) {
		this.descr_ef = descr_ef;
	}

}
