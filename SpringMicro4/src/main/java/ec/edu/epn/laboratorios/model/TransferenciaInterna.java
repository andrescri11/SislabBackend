package ec.edu.epn.laboratorios.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Información de pagos")
@Entity
@Table(name = "TransferenciaInterna")
public class TransferenciaInterna {
	
	@Id
	private String id_ti;
	
	private String id_proforma;
	private Date fecha;
	private Integer total_ti;
	private Integer subtotal_ti;
	private Integer iva_ti;
	private String id_punto_facturacion;
	private String estado_ti;
	private Integer id_caja;
	public String getId_ti() {
		return id_ti;
	}
	public void setId_ti(String id_ti) {
		this.id_ti = id_ti;
	}
	public String getId_proforma() {
		return id_proforma;
	}
	public void setId_proforma(String id_proforma) {
		this.id_proforma = id_proforma;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getTotal_ti() {
		return total_ti;
	}
	public void setTotal_ti(Integer total_ti) {
		this.total_ti = total_ti;
	}
	public Integer getSubtotal_ti() {
		return subtotal_ti;
	}
	public void setSubtotal_ti(Integer subtotal_ti) {
		this.subtotal_ti = subtotal_ti;
	}
	public Integer getIva_ti() {
		return iva_ti;
	}
	public void setIva_ti(Integer iva_ti) {
		this.iva_ti = iva_ti;
	}
	public String getId_punto_facturacion() {
		return id_punto_facturacion;
	}
	public void setId_punto_facturacion(String id_punto_facturacion) {
		this.id_punto_facturacion = id_punto_facturacion;
	}
	public String getEstado_ti() {
		return estado_ti;
	}
	public void setEstado_ti(String estado_ti) {
		this.estado_ti = estado_ti;
	}
	public Integer getId_caja() {
		return id_caja;
	}
	public void setId_caja(Integer id_caja) {
		this.id_caja = id_caja;
	}
	

}
