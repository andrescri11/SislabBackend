package ec.edu.epn.laboratorios.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ordenTrabajo")
public class OrdenTrabajo {
	
	@Id
	private String id_orden;
	
	@OneToMany(mappedBy = "ordenTrabajo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
			fetch = FetchType.LAZY/*en consulta, solo trae datos de maestro*/, orphanRemoval = true)
	private List<DetalleOrden> detalleOrden;
	
	private String id_factura;
	private String id_cliente;
	private Date fechaorden_ot;
	private Date fechaentrega_ot;
	private String observ_ot;
	private Integer numeromuestra_ot;
	private Integer aux_ordent;
	private String estado_ot;
	private Date fecha_cierre;
	private Integer id_usuario;
	private String id_ti;
	private String tipo_ot;
	private String responsable_ot;
	
	public String getId_orden() {
		return id_orden;
	}
	public void setId_orden(String id_orden) {
		this.id_orden = id_orden;
	}
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public String getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Date getFechaorden_ot() {
		return fechaorden_ot;
	}
	public void setFechaorden_ot(Date fechaorden_ot) {
		this.fechaorden_ot = fechaorden_ot;
	}
	public Date getFechaentrega_ot() {
		return fechaentrega_ot;
	}
	public void setFechaentrega_ot(Date fechaentrega_ot) {
		this.fechaentrega_ot = fechaentrega_ot;
	}
	public String getObserv_ot() {
		return observ_ot;
	}
	public void setObserv_ot(String observ_ot) {
		this.observ_ot = observ_ot;
	}
	public Integer getNumeromuestra_ot() {
		return numeromuestra_ot;
	}
	public void setNumeromuestra_ot(Integer numeromuestra_ot) {
		this.numeromuestra_ot = numeromuestra_ot;
	}
	public Integer getAux_ordent() {
		return aux_ordent;
	}
	public void setAux_ordent(Integer aux_ordent) {
		this.aux_ordent = aux_ordent;
	}
	public String getEstado_ot() {
		return estado_ot;
	}
	public void setEstado_ot(String estado_ot) {
		this.estado_ot = estado_ot;
	}
	public Date getFecha_cierre() {
		return fecha_cierre;
	}
	public void setFecha_cierre(Date fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getId_ti() {
		return id_ti;
	}
	public void setId_ti(String id_ti) {
		this.id_ti = id_ti;
	}
	public String getTipo_ot() {
		return tipo_ot;
	}
	public void setTipo_ot(String tipo_ot) {
		this.tipo_ot = tipo_ot;
	}
	public String getResponsable_ot() {
		return responsable_ot;
	}
	public void setResponsable_ot(String responsable_ot) {
		this.responsable_ot = responsable_ot;
	}
	public List<DetalleOrden> getDetalleOrden() {
		return detalleOrden;
	}
	public void setDetalleOrden(List<DetalleOrden> detalleOrden) {
		this.detalleOrden = detalleOrden;
	}
	
}
