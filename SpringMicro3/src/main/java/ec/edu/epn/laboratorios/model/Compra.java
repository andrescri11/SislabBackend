package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import ec.edu.epn.laboratorios.utils.MyLocalDateConverter;

@SequenceGenerator(
		name = "compraSecuencia", 
		sequenceName = "secuencia_compras", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "compra")
public class Compra {
	
	@Id
	@GeneratedValue(generator = "Compragenerator")
	@GenericGenerator(name = "Compragenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_compras"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_compra;
		
	private Integer id_unidad;
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;
	//private String id_proveedor;
	
	private Date fecha_co;
	private Double monto_co;
	private String descr_compra;
	private String documento_co;
	private Integer auxidcompra;
	
	public String getId_compra() {
		return id_compra;
	}
	public void setId_compra(String id_compra) {
		this.id_compra = id_compra;
	}
	public Integer getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}
	public Date getFecha_co() {
		return fecha_co;
	}
	public void setFecha_co(Date fecha_co) {
		this.fecha_co = fecha_co;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	
	public Double getMonto_co() {
		return monto_co;
	}
	public void setMonto_co(Double monto_co) {
		this.monto_co = monto_co;
	}
	public String getDescr_compra() {
		return descr_compra;
	}
	public void setDescr_compra(String descr_compra) {
		this.descr_compra = descr_compra;
	}
	public String getDocumento_co() {
		return documento_co;
	}
	public void setDocumento_co(String documento_co) {
		this.documento_co = documento_co;
	}
	public Integer getAuxidcompra() {
		return auxidcompra;
	}
	public void setAuxidcompra(Integer auxidcompra) {
		this.auxidcompra = auxidcompra;
	}
}
