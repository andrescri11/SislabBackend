package ec.edu.epn.laboratorios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/***************falta primary key doble**********/
@Entity
@Table(name = "bodega_usuario")
public class BodegaUsuario implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "id_bodega", nullable = false)
	private Bodega bodega;
	//private String id_bodega;
	
	@Id
	private Integer id_usuario;
}
