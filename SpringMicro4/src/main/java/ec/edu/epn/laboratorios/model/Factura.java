package ec.edu.epn.laboratorios.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Información de factura")
@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	private String id_factura;
	private String id_proforma;
	
	//tipo timestamp en bdd
	@Column(name = "fechafac_f", nullable = true)
	private Date fechafac_f;
	
	@Column(name = "subtotal_f", nullable = true)
	private Double subtotal_f;
	
	@Column(name = "descuento_f", nullable = true)
	private Double descuento_f;
	
	@Column(name = "iva_f", nullable = true)
	private Double iva_f;
	
	public String getId_estado_factura() {
		return id_estado_factura;
	}
	public void setId_estado_factura(String id_estado_factura) {
		this.id_estado_factura = id_estado_factura;
	}
	@Column(name = "total_f", nullable = true)
	private Double total_f;
	
	private String id_estado_factura;
	/*@ManyToOne
	@JoinColumn(name = "id_estado_factura", nullable = true)
	private EstadoFactura estadoFactura;
	*/
	private String id_forma_pago;
	
	@Column(name = "id_punto_facturacion", nullable = true)
	private String id_punto_facturacion;
	
	private String id_cliente;
	private Integer id_caja;
	private String tipo_f;
	private Integer porcentajeiva;
	private String concepto;
	private String motivoestado_f;
	private Integer auxsecuencia;
	private String nombre_e;
	private String direccion_e;
	private String telefono_e;
	private String carrera_e;
	private String cedula_e;
	private String num3;
	private String num2;
	private String num1;
	private Date fechafac_pend;
	private String nombre_cli;
	private String direccion_cli;
	private String ruc_cli;
	private String cedula_cli;
	private String id_estudiante;
	private String telefono_cli;
	private String aux;
	private Integer nropagos;
	private Date fec_comprom_pago;
	private Date fec_max_nc;
	private String email_cl;
	private String path;
	private String estadomail;
	private String pathxml;
	private String claveacceso;
	private String numautoriza;
	private String fechaautoriza;
	private String ambiente;
	private String emision;
	private String estado_sri;
	private String xml;
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public String getId_proforma() {
		return id_proforma;
	}
	public void setId_proforma(String id_proforma) {
		this.id_proforma = id_proforma;
	}
	public Date getFechafac_f() {
		return fechafac_f;
	}
	public void setFechafac_f(Date fechafac_f) {
		this.fechafac_f = fechafac_f;
	}
	public Double getSubtotal_f() {
		return subtotal_f;
	}
	public void setSubtotal_f(Double subtotal_f) {
		this.subtotal_f = subtotal_f;
	}
	public Double getDescuento_f() {
		return descuento_f;
	}
	public void setDescuento_f(Double descuento_f) {
		this.descuento_f = descuento_f;
	}
	public Double getIva_f() {
		return iva_f;
	}
	public void setIva_f(Double iva_f) {
		this.iva_f = iva_f;
	}
	public Double getTotal_f() {
		return total_f;
	}
	public void setTotal_f(Double total_f) {
		this.total_f = total_f;
	}
	/*public EstadoFactura getEstadoFactura() {
		return estadoFactura;
	}
	public void setEstadoFactura(EstadoFactura estadoFactura) {
		this.estadoFactura = estadoFactura;
	}*/
	public String getId_forma_pago() {
		return id_forma_pago;
	}
	public void setId_forma_pago(String id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}
	public String getId_punto_facturacion() {
		return id_punto_facturacion;
	}
	public void setId_punto_facturacion(String id_punto_facturacion) {
		this.id_punto_facturacion = id_punto_facturacion;
	}
	public String getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Integer getId_caja() {
		return id_caja;
	}
	public void setId_caja(Integer id_caja) {
		this.id_caja = id_caja;
	}
	public String getTipo_f() {
		return tipo_f;
	}
	public void setTipo_f(String tipo_f) {
		this.tipo_f = tipo_f;
	}
	public Integer getPorcentajeiva() {
		return porcentajeiva;
	}
	public void setPorcentajeiva(Integer porcentajeiva) {
		this.porcentajeiva = porcentajeiva;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getMotivoestado_f() {
		return motivoestado_f;
	}
	public void setMotivoestado_f(String motivoestado_f) {
		this.motivoestado_f = motivoestado_f;
	}
	public Integer getAuxsecuencia() {
		return auxsecuencia;
	}
	public void setAuxsecuencia(Integer auxsecuencia) {
		this.auxsecuencia = auxsecuencia;
	}
	public String getNombre_e() {
		return nombre_e;
	}
	public void setNombre_e(String nombre_e) {
		this.nombre_e = nombre_e;
	}
	public String getDireccion_e() {
		return direccion_e;
	}
	public void setDireccion_e(String direccion_e) {
		this.direccion_e = direccion_e;
	}
	public String getTelefono_e() {
		return telefono_e;
	}
	public void setTelefono_e(String telefono_e) {
		this.telefono_e = telefono_e;
	}
	public String getCarrera_e() {
		return carrera_e;
	}
	public void setCarrera_e(String carrera_e) {
		this.carrera_e = carrera_e;
	}
	public String getCedula_e() {
		return cedula_e;
	}
	public void setCedula_e(String cedula_e) {
		this.cedula_e = cedula_e;
	}
	public String getNum3() {
		return num3;
	}
	public void setNum3(String num3) {
		this.num3 = num3;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public Date getFechafac_pend() {
		return fechafac_pend;
	}
	public void setFechafac_pend(Date fechafac_pend) {
		this.fechafac_pend = fechafac_pend;
	}
	public String getNombre_cli() {
		return nombre_cli;
	}
	public void setNombre_cli(String nombre_cli) {
		this.nombre_cli = nombre_cli;
	}
	public String getDireccion_cli() {
		return direccion_cli;
	}
	public void setDireccion_cli(String direccion_cli) {
		this.direccion_cli = direccion_cli;
	}
	public String getRuc_cli() {
		return ruc_cli;
	}
	public void setRuc_cli(String ruc_cli) {
		this.ruc_cli = ruc_cli;
	}
	public String getCedula_cli() {
		return cedula_cli;
	}
	public void setCedula_cli(String cedula_cli) {
		this.cedula_cli = cedula_cli;
	}
	public String getId_estudiante() {
		return id_estudiante;
	}
	public void setId_estudiante(String id_estudiante) {
		this.id_estudiante = id_estudiante;
	}
	public String getTelefono_cli() {
		return telefono_cli;
	}
	public void setTelefono_cli(String telefono_cli) {
		this.telefono_cli = telefono_cli;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
	}
	public Integer getNropagos() {
		return nropagos;
	}
	public void setNropagos(Integer nropagos) {
		this.nropagos = nropagos;
	}
	public Date getFec_comprom_pago() {
		return fec_comprom_pago;
	}
	public void setFec_comprom_pago(Date fec_comprom_pago) {
		this.fec_comprom_pago = fec_comprom_pago;
	}
	public Date getFec_max_nc() {
		return fec_max_nc;
	}
	public void setFec_max_nc(Date fec_max_nc) {
		this.fec_max_nc = fec_max_nc;
	}
	public String getEmail_cl() {
		return email_cl;
	}
	public void setEmail_cl(String email_cl) {
		this.email_cl = email_cl;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getEstadomail() {
		return estadomail;
	}
	public void setEstadomail(String estadomail) {
		this.estadomail = estadomail;
	}
	public String getPathxml() {
		return pathxml;
	}
	public void setPathxml(String pathxml) {
		this.pathxml = pathxml;
	}
	public String getClaveacceso() {
		return claveacceso;
	}
	public void setClaveacceso(String claveacceso) {
		this.claveacceso = claveacceso;
	}
	public String getNumautoriza() {
		return numautoriza;
	}
	public void setNumautoriza(String numautoriza) {
		this.numautoriza = numautoriza;
	}
	public String getFechaautoriza() {
		return fechaautoriza;
	}
	public void setFechaautoriza(String fechaautoriza) {
		this.fechaautoriza = fechaautoriza;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getEmision() {
		return emision;
	}
	public void setEmision(String emision) {
		this.emision = emision;
	}
	public String getEstado_sri() {
		return estado_sri;
	}
	public void setEstado_sri(String estado_sri) {
		this.estado_sri = estado_sri;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}

}
