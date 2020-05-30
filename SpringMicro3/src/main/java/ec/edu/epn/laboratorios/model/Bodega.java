package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "bodegaSecuencia", 
		sequenceName = "secuencia_bodega", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "bodega")
public class Bodega {

	@Id
	@GeneratedValue(generator = "Bodegagenerator")
	@GenericGenerator(name = "Bodegagenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_bodega"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_bodega;
	
	private Integer id_unidad;
	private Integer id_usuario;
	public String getId_bodega() {
		return id_bodega;
	}
	public void setId_bodega(String id_bodega) {
		this.id_bodega = id_bodega;
	}
	public Integer getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(Integer id_unidad) {
		this.id_unidad = id_unidad;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre_bg() {
		return nombre_bg;
	}
	public void setNombre_bg(String nombre_bg) {
		this.nombre_bg = nombre_bg;
	}
	public String getUbicacion_bg() {
		return ubicacion_bg;
	}
	public void setUbicacion_bg(String ubicacion_bg) {
		this.ubicacion_bg = ubicacion_bg;
	}
	public String getDescr_bg() {
		return descr_bg;
	}
	public void setDescr_bg(String descr_bg) {
		this.descr_bg = descr_bg;
	}
	public String getHabilitar_bd() {
		return habilitar_bd;
	}
	public void setHabilitar_bd(String habilitar_bd) {
		this.habilitar_bd = habilitar_bd;
	}
	private String nombre_bg;
	private String ubicacion_bg;
	private String descr_bg;
	private String habilitar_bd;
}
