package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "tipoClienteSecuencia", 
		sequenceName = "secuencia_tipocliente", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "tipocliente")
public class TipoCliente {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipoClienteSecuencia")
	@GeneratedValue(generator = "TipoClientegenerator")
	@GenericGenerator(name = "TipoClientegenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_tipocliente"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_tipocliente;
	
	@Column(name = "tipo_tcl", nullable = false)
	private String tipo_tcl;
	
	private String factura_tcl;
	private String descr_tcl;
	private Integer iva_tcl;
	
	public String getId_tipocliente() {
		return id_tipocliente;
	}
	public void setId_tipocliente(String id_tipocliente) {
		this.id_tipocliente = id_tipocliente;
	}
	public String getTipo_tcl() {
		return tipo_tcl;
	}
	public void setTipo_tcl(String tipo_tcl) {
		this.tipo_tcl = tipo_tcl;
	}
	public String getFactura_tcl() {
		return factura_tcl;
	}
	public void setFactura_tcl(String factura_tcl) {
		this.factura_tcl = factura_tcl;
	}
	public String getDescr_tcl() {
		return descr_tcl;
	}
	public void setDescr_tcl(String descr_tcl) {
		this.descr_tcl = descr_tcl;
	}
	public Integer getIva_tcl() {
		return iva_tcl;
	}
	public void setIva_tcl(Integer iva_tcl) {
		this.iva_tcl = iva_tcl;
	}

}
