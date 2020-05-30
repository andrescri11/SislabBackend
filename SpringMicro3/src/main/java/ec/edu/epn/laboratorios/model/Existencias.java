package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "existencias")
public class Existencias {
	
	@Id
	private String id_existencia;
	
	public String getId_existencia() {
		return id_existencia;
	}
	public void setId_existencia(String id_existencia) {
		this.id_existencia = id_existencia;
	}
	public Integer getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Bodega getBodega() {
		return bodega;
	}
	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}
	public Presentacion getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(Presentacion presentacion) {
		this.presentacion = presentacion;
	}
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public EstadoProducto getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(EstadoProducto estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public Grado getGrado() {
		return grado;
	}
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	public String getId_hidratacion() {
		return id_hidratacion;
	}
	public void setId_hidratacion(String id_hidratacion) {
		this.id_hidratacion = id_hidratacion;
	}
	public Posgiro getPosgiro() {
		return posgiro;
	}
	public void setPosgiro(Posgiro posgiro) {
		this.posgiro = posgiro;
	}
	public Integer getCantidad_e() {
		return cantidad_e;
	}
	public void setCantidad_e(Integer cantidad_e) {
		this.cantidad_e = cantidad_e;
	}
	/*public LocalDate getFechacad_e() {
		return fechacad_e;
	}
	public void setFechacad_e(LocalDate fechacad_e) {
		this.fechacad_e = fechacad_e;
	}*/
	public String getObsolescencia_e() {
		return obsolescencia_e;
	}
	public Date getFechacad_e() {
		return fechacad_e;
	}
	public void setFechacad_e(Date fechacad_e) {
		this.fechacad_e = fechacad_e;
	}
	public Date getFechabaja_e() {
		return fechabaja_e;
	}
	public void setObsolescencia_e(String obsolescencia_e) {
		this.obsolescencia_e = obsolescencia_e;
	}
	public Double getTasauso_e() {
		return tasauso_e;
	}
	public void setTasauso_e(Double tasauso_e) {
		this.tasauso_e = tasauso_e;
	}
	public Integer getNenvase_e() {
		return nenvase_e;
	}
	public void setNenvase_e(Integer nenvase_e) {
		this.nenvase_e = nenvase_e;
	}
	/*public LocalDate getFechabaja_e() {
		return fechabaja_e;
	}
	public void setFechabaja_e(LocalDate fechabaja_e) {
		this.fechabaja_e = fechabaja_e;
	}*/
	public String getUbica_e() {
		return ubica_e;
	}
	public void setUbica_e(String ubica_e) {
		this.ubica_e = ubica_e;
	}
	public String getPureza_e() {
		return pureza_e;
	}
	public void setPureza_e(String pureza_e) {
		this.pureza_e = pureza_e;
	}
	public Concentracion getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(Concentracion concentracion) {
		this.concentracion = concentracion;
	}
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	public Double getCantidadneta_e() {
		return cantidadneta_e;
	}
	public void setCantidadneta_e(Double cantidadneta_e) {
		this.cantidadneta_e = cantidadneta_e;
	}
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Integer getDism() {
		return dism;
	}
	public void setDism(Integer dism) {
		this.dism = dism;
	}
	public Integer getIncrem() {
		return increm;
	}
	public void setIncrem(Integer increm) {
		this.increm = increm;
	}
	public String getAux1() {
		return aux1;
	}
	public void setAux1(String aux1) {
		this.aux1 = aux1;
	}
	public String getAux2() {
		return aux2;
	}
	public void setAux2(String aux2) {
		this.aux2 = aux2;
	}
	public String getToi() {
		return toi;
	}
	public void setToi(String toi) {
		this.toi = toi;
	}
	private Integer id_unidad;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	//private String id_producto;
	
	@ManyToOne
	@JoinColumn(name = "id_bodega", nullable = false)
	private Bodega bodega;
	//private String id_bodega;
	
	@ManyToOne
	@JoinColumn(name = "id_presentacion", nullable = false)
	private Presentacion presentacion;
	//private String id_presentacion;
	
	@ManyToOne
	@JoinColumn(name = "id_umedida", nullable = false)
	private UnidadMedida unidadMedida;
	//private String id_umedida;
	
	@ManyToOne
	@JoinColumn(name = "id_estadoprod", nullable  = true)
	private EstadoProducto estadoProducto;
	//private String id_estadoprod;
	
	@ManyToOne
	@JoinColumn(name = "id_grado", nullable = false)
	private Grado grado;
	//private String id_grado;
	
	private String id_hidratacion;
	
	@ManyToOne
	@JoinColumn(name = "id_posgiro", nullable = false)
	private Posgiro posgiro;
	//private String id_posgiro;
	
	private Integer cantidad_e;
	private Date fechacad_e;
	private String obsolescencia_e;
	private Double tasauso_e;
	private Integer nenvase_e;
	//private LocalDate fechabaja_e;
	private Date fechabaja_e;
	private String ubica_e;
	public void setFechabaja_e(Date fechabaja_e) {
		this.fechabaja_e = fechabaja_e;
	}
	private String pureza_e;
	
	@ManyToOne
	@JoinColumn(name = "id_concentracion", nullable = false)
	private Concentracion concentracion;
	//private String id_concentracion;
	
	@ManyToOne
	@JoinColumn(name = "id_caracteristica", nullable = true)
	private Caracteristica caracteristica;
	//private String id_caracteristica;
	
	private Double cantidadneta_e;
	
	@ManyToOne
	@JoinColumn(name = "id_tipoprod", nullable = false)
	private TipoProducto tipoProducto;
	//private String id_tipoprod;
	
	private Integer dism;
	private Integer increm;
	private String aux1;
	private String aux2;
	private String toi;
	

}
