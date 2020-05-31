package ec.edu.epn.laboratorios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@SequenceGenerator(
		name = "detalleFacturaSecuencia", 
		sequenceName = "secuencia_detalle_factura", 
		initialValue = 1, 
		allocationSize = 1)

@ApiModel(description = "Información del detalle de factura")
@Entity
@Table(name = "detallefactura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(generator = "DetalleFacturaGenerator")
	@GenericGenerator(name = "DetalleFacturaGenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_detalle_factura"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_detallefactura;
	
	private String id_servicio;
	
	@ApiModelProperty(notes = "id_factura debe tener mínimo x caracteres")
	@Size(min = 2, message = "id_factura debe tener mínimo x caracteres")
	@Column(name = "id_factura", nullable = false)
	private String id_factura;
	
	private Double costo_df;
	private Integer unidades_df;
	private Double costot_df;
	private String estado_serv;
	private Integer control_unidades;
	private String id_metodo;
	private String id_concepto;
	private Integer porcentajeiva;
	private String mes_arriendo;
	private Double valor_iva;
	private Double subtotal;
	private String nombreser;
	public String getId_detallefactura() {
		return id_detallefactura;
	}
	public void setId_detallefactura(String id_detallefactura) {
		this.id_detallefactura = id_detallefactura;
	}
	public String getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(String id_servicio) {
		this.id_servicio = id_servicio;
	}
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public Double getCosto_df() {
		return costo_df;
	}
	public void setCosto_df(Double costo_df) {
		this.costo_df = costo_df;
	}
	public Integer getUnidades_df() {
		return unidades_df;
	}
	public void setUnidades_df(Integer unidades_df) {
		this.unidades_df = unidades_df;
	}
	public Double getCostot_df() {
		return costot_df;
	}
	public void setCostot_df(Double costot_df) {
		this.costot_df = costot_df;
	}
	public String getEstado_serv() {
		return estado_serv;
	}
	public void setEstado_serv(String estado_serv) {
		this.estado_serv = estado_serv;
	}
	public Integer getControl_unidades() {
		return control_unidades;
	}
	public void setControl_unidades(Integer control_unidades) {
		this.control_unidades = control_unidades;
	}
	public String getId_metodo() {
		return id_metodo;
	}
	public void setId_metodo(String id_metodo) {
		this.id_metodo = id_metodo;
	}
	public String getId_concepto() {
		return id_concepto;
	}
	public void setId_concepto(String id_concepto) {
		this.id_concepto = id_concepto;
	}
	public Integer getPorcentajeiva() {
		return porcentajeiva;
	}
	public void setPorcentajeiva(Integer porcentajeiva) {
		this.porcentajeiva = porcentajeiva;
	}
	public String getMes_arriendo() {
		return mes_arriendo;
	}
	public void setMes_arriendo(String mes_arriendo) {
		this.mes_arriendo = mes_arriendo;
	}
	public Double getValor_iva() {
		return valor_iva;
	}
	public void setValor_iva(Double valor_iva) {
		this.valor_iva = valor_iva;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public String getNombreser() {
		return nombreser;
	}
	public void setNombreser(String nombreser) {
		this.nombreser = nombreser;
	}
	

}
