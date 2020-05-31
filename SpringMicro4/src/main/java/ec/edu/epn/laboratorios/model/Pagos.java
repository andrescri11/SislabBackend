package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import io.swagger.annotations.ApiModel;

@SequenceGenerator(
		name = "PagosSecuencia", 
		sequenceName = "secuencia_pagos", 
		initialValue = 1, 
		allocationSize = 1)

@ApiModel(description = "Información de pagos")
@Entity
@Table(name = "pagos")
public class Pagos {
	
	@Id
	@GeneratedValue(generator = "PagosGenerator")
	@GenericGenerator(name = "PagosGenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_pagos"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_pagos;
	
	private String id_factura;
	/*@ManyToOne
	@JoinColumn(name = "id_factura", nullable = false)
	private Factura factura;
	*/
	private String numero_documento_pa;
	private Integer monto_pa;
	private Integer saldo_pa;
	private Integer id_bancos;
	private String id_forma_pago;
	private String id_tc;
	private String procedencia_pa;
	private String id_rcb_caja;
	private Double comision_tc;
	private String cuenta_corriente_pa;
	private String id_nc;
	public String getId_pagos() {
		return id_pagos;
	}
	public void setId_pagos(String id_pagos) {
		this.id_pagos = id_pagos;
	}
	/*public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}*/
	public String getNumero_documento_pa() {
		return numero_documento_pa;
	}
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public void setNumero_documento_pa(String numero_documento_pa) {
		this.numero_documento_pa = numero_documento_pa;
	}
	public Integer getMonto_pa() {
		return monto_pa;
	}
	public void setMonto_pa(Integer monto_pa) {
		this.monto_pa = monto_pa;
	}
	public Integer getSaldo_pa() {
		return saldo_pa;
	}
	public void setSaldo_pa(Integer saldo_pa) {
		this.saldo_pa = saldo_pa;
	}
	public Integer getId_bancos() {
		return id_bancos;
	}
	public void setId_bancos(Integer id_bancos) {
		this.id_bancos = id_bancos;
	}
	public String getId_forma_pago() {
		return id_forma_pago;
	}
	public void setId_forma_pago(String id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}
	public String getId_tc() {
		return id_tc;
	}
	public void setId_tc(String id_tc) {
		this.id_tc = id_tc;
	}
	public String getProcedencia_pa() {
		return procedencia_pa;
	}
	public void setProcedencia_pa(String procedencia_pa) {
		this.procedencia_pa = procedencia_pa;
	}
	public String getId_rcb_caja() {
		return id_rcb_caja;
	}
	public void setId_rcb_caja(String id_rcb_caja) {
		this.id_rcb_caja = id_rcb_caja;
	}
	public Double getComision_tc() {
		return comision_tc;
	}
	public void setComision_tc(Double comision_tc) {
		this.comision_tc = comision_tc;
	}
	public String getCuenta_corriente_pa() {
		return cuenta_corriente_pa;
	}
	public void setCuenta_corriente_pa(String cuenta_corriente_pa) {
		this.cuenta_corriente_pa = cuenta_corriente_pa;
	}
	public String getId_nc() {
		return id_nc;
	}
	public void setId_nc(String id_nc) {
		this.id_nc = id_nc;
	}

}
