package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	private String id_producto;
	
	@ManyToOne
	@JoinColumn(name = "id_riesgoespecifico")
	private RiesgoEspecifico riesgoEspecifico;
	//private String id_riesgoespecifico;
	
	private String nombre_pr;
	private String descr_pr;
	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public RiesgoEspecifico getRiesgoEspecifico() {
		return riesgoEspecifico;
	}

	public void setRiesgoEspecifico(RiesgoEspecifico riesgoEspecifico) {
		this.riesgoEspecifico = riesgoEspecifico;
	}

	public String getNombre_pr() {
		return nombre_pr;
	}

	public void setNombre_pr(String nombre_pr) {
		this.nombre_pr = nombre_pr;
	}

	public String getDescr_pr() {
		return descr_pr;
	}

	public void setDescr_pr(String descr_pr) {
		this.descr_pr = descr_pr;
	}

	public Double getStockmin_pr() {
		return stockmin_pr;
	}

	public void setStockmin_pr(Double stockmin_pr) {
		this.stockmin_pr = stockmin_pr;
	}

	public Double getStock_pr() {
		return stock_pr;
	}

	public void setStock_pr(Double stock_pr) {
		this.stock_pr = stock_pr;
	}

	public Double getStockcrt_pr() {
		return stockcrt_pr;
	}

	public void setStockcrt_pr(Double stockcrt_pr) {
		this.stockcrt_pr = stockcrt_pr;
	}

	public String getIupac_pr() {
		return iupac_pr;
	}

	public void setIupac_pr(String iupac_pr) {
		this.iupac_pr = iupac_pr;
	}

	public String getRiesgo_pr() {
		return riesgo_pr;
	}

	public void setRiesgo_pr(String riesgo_pr) {
		this.riesgo_pr = riesgo_pr;
	}

	public String getFormula_pr() {
		return formula_pr;
	}

	public void setFormula_pr(String formula_pr) {
		this.formula_pr = formula_pr;
	}

	public String getColorriesgo_pr() {
		return colorriesgo_pr;
	}

	public void setColorriesgo_pr(String colorriesgo_pr) {
		this.colorriesgo_pr = colorriesgo_pr;
	}

	public Double getPrecio_pr() {
		return precio_pr;
	}

	public void setPrecio_pr(Double precio_pr) {
		this.precio_pr = precio_pr;
	}

	public String getRiesgosalud_pr() {
		return riesgosalud_pr;
	}

	public void setRiesgosalud_pr(String riesgosalud_pr) {
		this.riesgosalud_pr = riesgosalud_pr;
	}

	public String getRiesgoinflamabilidad_pr() {
		return riesgoinflamabilidad_pr;
	}

	public void setRiesgoinflamabilidad_pr(String riesgoinflamabilidad_pr) {
		this.riesgoinflamabilidad_pr = riesgoinflamabilidad_pr;
	}

	public String getRiesgoreactividad_pr() {
		return riesgoreactividad_pr;
	}

	public void setRiesgoreactividad_pr(String riesgoreactividad_pr) {
		this.riesgoreactividad_pr = riesgoreactividad_pr;
	}

	public Integer getAux_idprod() {
		return aux_idprod;
	}

	public void setAux_idprod(Integer aux_idprod) {
		this.aux_idprod = aux_idprod;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	private Double stockmin_pr;
	private Double stock_pr;
	private Double stockcrt_pr;
	private String iupac_pr;
	private String riesgo_pr;
	private String formula_pr;
	private String colorriesgo_pr;
	private Double precio_pr;
	private String riesgosalud_pr;
	private String riesgoinflamabilidad_pr;
	private String riesgoreactividad_pr;
	private Integer aux_idprod;
	
	@ManyToOne
	@JoinColumn(name = "id_tipoprod")
	private TipoProducto tipoProducto;
	//private String id_tipoprod;
}
