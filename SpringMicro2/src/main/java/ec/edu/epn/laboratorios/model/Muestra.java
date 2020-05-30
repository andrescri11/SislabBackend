package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "muestra")
public class Muestra {

	@Id
	private String id_muestra;
	
	private String codigo_m_cliente;
	private Date fecha_toma_m;
	private String tipo_m;
	private String origen_m;
	private String tipoenvase_m;
	private String preservante_m;
	private String tipopreservante_m;
	private String refrigeracion_m;
	private Integer aux_muestra;
	private String id_factura;
	private String descr_m;
	private Integer num_muestra_fact;
	private Integer id_unidad;
	private String id_ti;
	
	public String getId_muestra() {
		return id_muestra;
	}
	public void setId_muestra(String id_muestra) {
		this.id_muestra = id_muestra;
	}
	public String getCodigo_m_cliente() {
		return codigo_m_cliente;
	}
	public void setCodigo_m_cliente(String codigo_m_cliente) {
		this.codigo_m_cliente = codigo_m_cliente;
	}
	public Date getFecha_toma_m() {
		return fecha_toma_m;
	}
	public void setFecha_toma_m(Date fecha_toma_m) {
		this.fecha_toma_m = fecha_toma_m;
	}
	public String getTipo_m() {
		return tipo_m;
	}
	public void setTipo_m(String tipo_m) {
		this.tipo_m = tipo_m;
	}
	public String getOrigen_m() {
		return origen_m;
	}
	public void setOrigen_m(String origen_m) {
		this.origen_m = origen_m;
	}
	public String getTipoenvase_m() {
		return tipoenvase_m;
	}
	public void setTipoenvase_m(String tipoenvase_m) {
		this.tipoenvase_m = tipoenvase_m;
	}
	public String getPreservante_m() {
		return preservante_m;
	}
	public void setPreservante_m(String preservante_m) {
		this.preservante_m = preservante_m;
	}
	public String getTipopreservante_m() {
		return tipopreservante_m;
	}
	public void setTipopreservante_m(String tipopreservante_m) {
		this.tipopreservante_m = tipopreservante_m;
	}
	public String getRefrigeracion_m() {
		return refrigeracion_m;
	}
	public void setRefrigeracion_m(String refrigeracion_m) {
		this.refrigeracion_m = refrigeracion_m;
	}
	public Integer getAux_muestra() {
		return aux_muestra;
	}
	public void setAux_muestra(Integer aux_muestra) {
		this.aux_muestra = aux_muestra;
	}
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public String getDescr_m() {
		return descr_m;
	}
	public void setDescr_m(String descr_m) {
		this.descr_m = descr_m;
	}
	public Integer getNum_muestra_fact() {
		return num_muestra_fact;
	}
	public void setNum_muestra_fact(Integer num_muestra_fact) {
		this.num_muestra_fact = num_muestra_fact;
	}
	public Integer getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}
	public String getId_ti() {
		return id_ti;
	}
	public void setId_ti(String id_ti) {
		this.id_ti = id_ti;
	}
	
}
