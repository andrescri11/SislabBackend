package ec.edu.epn.laboratorios.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Información de movimiento de caja")
@Entity
@Table(name = "movimiento_caja")
public class MovimientoCaja {
	
	@Id
	private Integer id_movimiento_caja;
	
	@Column(name = "id_caja", nullable = false)
	private Integer id_caja;
	
	@Column(name = "tipo_mov_caja", nullable = false)
	private String tipo_mov_caja;
	
	private Double saldo_inicial_mov_caja;
	private Double saldo_total_mov_caja;
	private Double saldo_siguiente_apertura_mov_caja;
	
	//tipo timestamp en bdd
	private Date fecha_hoy;
	private String observacion_mov_caja;
	private Integer inciotimbre1;
	private Integer inciotimbre2;
	private Integer inciotimbre3;
	private Integer inciotimbre4;
	public Integer getId_movimiento_caja() {
		return id_movimiento_caja;
	}
	public void setId_movimiento_caja(Integer id_movimiento_caja) {
		this.id_movimiento_caja = id_movimiento_caja;
	}
	public Integer getId_caja() {
		return id_caja;
	}
	public void setId_caja(Integer id_caja) {
		this.id_caja = id_caja;
	}
	public String getTipo_mov_caja() {
		return tipo_mov_caja;
	}
	public void setTipo_mov_caja(String tipo_mov_caja) {
		this.tipo_mov_caja = tipo_mov_caja;
	}
	public Double getSaldo_inicial_mov_caja() {
		return saldo_inicial_mov_caja;
	}
	public void setSaldo_inicial_mov_caja(Double saldo_inicial_mov_caja) {
		this.saldo_inicial_mov_caja = saldo_inicial_mov_caja;
	}
	public Double getSaldo_total_mov_caja() {
		return saldo_total_mov_caja;
	}
	public void setSaldo_total_mov_caja(Double saldo_total_mov_caja) {
		this.saldo_total_mov_caja = saldo_total_mov_caja;
	}
	public Double getSaldo_siguiente_apertura_mov_caja() {
		return saldo_siguiente_apertura_mov_caja;
	}
	public void setSaldo_siguiente_apertura_mov_caja(Double saldo_siguiente_apertura_mov_caja) {
		this.saldo_siguiente_apertura_mov_caja = saldo_siguiente_apertura_mov_caja;
	}
	public Date getFecha_hoy() {
		return fecha_hoy;
	}
	public void setFecha_hoy(Date fecha_hoy) {
		this.fecha_hoy = fecha_hoy;
	}
	public String getObservacion_mov_caja() {
		return observacion_mov_caja;
	}
	public void setObservacion_mov_caja(String observacion_mov_caja) {
		this.observacion_mov_caja = observacion_mov_caja;
	}
	public Integer getInciotimbre1() {
		return inciotimbre1;
	}
	public void setInciotimbre1(Integer inciotimbre1) {
		this.inciotimbre1 = inciotimbre1;
	}
	public Integer getInciotimbre2() {
		return inciotimbre2;
	}
	public void setInciotimbre2(Integer inciotimbre2) {
		this.inciotimbre2 = inciotimbre2;
	}
	public Integer getInciotimbre3() {
		return inciotimbre3;
	}
	public void setInciotimbre3(Integer inciotimbre3) {
		this.inciotimbre3 = inciotimbre3;
	}
	public Integer getInciotimbre4() {
		return inciotimbre4;
	}
	public void setInciotimbre4(Integer inciotimbre4) {
		this.inciotimbre4 = inciotimbre4;
	}
	

}
