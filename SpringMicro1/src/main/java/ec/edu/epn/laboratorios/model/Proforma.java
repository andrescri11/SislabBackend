package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@SequenceGenerator(
		name = "proformaSecuencia", 
		sequenceName = "secuencia_proforma"//, 
		//initialValue = 1, 
		//allocationSize = 1
		)

@Entity
@Table(name = "proforma")
public class Proforma {
	
	@Id
	private String id_proforma;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "proforma", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
			fetch = FetchType.LAZY/*en consulta, solo trae datos de maestro*/, orphanRemoval = true)
	private List<DetalleProforma> detalleProforma;

	@Column(name = "subtotal_po", nullable = true)
	private Double subtotal_po;
	
	@Column(name = "iva_po", nullable = true)
	private Double iva_po;
	
	@Column(name = "total_po", nullable = true)
	private Double total_po;
	
	private Date fecha;
	private String estado_po;
	
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proformaSecuencia")
	private Integer auxid_proforma;
	
	private String representante_po;
	private String obser_po;
	private String motivo_estadopo;
	private Integer id_usuario;
	
	// @JsonSerialize(using = ToStringSerializer.class)
	//private LocalDate fecha_ptarjeta;
	private Date fecha_ptarjeta;
	
	private String codigo_autoriza;
	private String id_emisor;
	private String tarjeta;
	private String obser_trj;
	private String codigo_resultado;
	private String codigo_operacion;
	private String codigo_plam;
	private String codigo_cuota;
	private String procesoweb_po;
	
	
	public String getId_proforma() {
		return id_proforma;
	}
	public void setId_proforma(String id_proforma) {
		this.id_proforma = id_proforma;
	}
	public Double getSubtotal_po() {
		return subtotal_po;
	}
	public void setSubtotal_po(Double subtotal_po) {
		this.subtotal_po = subtotal_po;
	}
	public Double getIva_po() {
		return iva_po;
	}
	public void setIva_po(Double iva_po) {
		this.iva_po = iva_po;
	}
	public Double getTotal_po() {
		return total_po;
	}
	public void setTotal_po(Double total_po) {
		this.total_po = total_po;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado_po() {
		return estado_po;
	}
	public void setEstado_po(String estado_po) {
		this.estado_po = estado_po;
	}
	public Integer getAuxid_proforma() {
		return auxid_proforma;
	}
	public void setAuxid_proforma(Integer auxid_proforma) {
		this.auxid_proforma = auxid_proforma;
	}
	public String getRepresentante_po() {
		return representante_po;
	}
	public void setRepresentante_po(String representante_po) {
		this.representante_po = representante_po;
	}
	public String getObser_po() {
		return obser_po;
	}
	public void setObser_po(String obser_po) {
		this.obser_po = obser_po;
	}
	public String getMotivo_estadopo() {
		return motivo_estadopo;
	}
	public void setMotivo_estadopo(String motivo_estadopo) {
		this.motivo_estadopo = motivo_estadopo;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Date getFecha_ptarjeta() {
		return fecha_ptarjeta;
	}
	public void setFecha_ptarjeta(Date fecha_ptarjeta) {
		this.fecha_ptarjeta = fecha_ptarjeta;
	}
	public String getCodigo_autoriza() {
		return codigo_autoriza;
	}
	public void setCodigo_autoriza(String codigo_autoriza) {
		this.codigo_autoriza = codigo_autoriza;
	}
	public String getId_emisor() {
		return id_emisor;
	}
	public void setId_emisor(String id_emisor) {
		this.id_emisor = id_emisor;
	}
	public String getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public String getObser_trj() {
		return obser_trj;
	}
	public void setObser_trj(String obser_trj) {
		this.obser_trj = obser_trj;
	}
	public String getCodigo_resultado() {
		return codigo_resultado;
	}
	public void setCodigo_resultado(String codigo_resultado) {
		this.codigo_resultado = codigo_resultado;
	}
	public String getCodigo_operacion() {
		return codigo_operacion;
	}
	public void setCodigo_operacion(String codigo_operacion) {
		this.codigo_operacion = codigo_operacion;
	}
	public String getCodigo_plam() {
		return codigo_plam;
	}
	public void setCodigo_plam(String codigo_plam) {
		this.codigo_plam = codigo_plam;
	}
	public String getCodigo_cuota() {
		return codigo_cuota;
	}
	public void setCodigo_cuota(String codigo_cuota) {
		this.codigo_cuota = codigo_cuota;
	}
	public String getProcesoweb_po() {
		return procesoweb_po;
	}
	public void setProcesoweb_po(String procesoweb_po) {
		this.procesoweb_po = procesoweb_po;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<DetalleProforma> getDetalleProforma() {
		return detalleProforma;
	}
	public void setDetalleProforma(List<DetalleProforma> detalleProforma) {
		this.detalleProforma = detalleProforma;
	}
}