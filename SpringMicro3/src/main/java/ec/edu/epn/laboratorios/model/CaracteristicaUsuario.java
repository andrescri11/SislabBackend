package ec.edu.epn.laboratorios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "caracteristica_usuario")
public class CaracteristicaUsuario implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_caracteristica", nullable = false)
	private Caracteristica caracteristica;
	//private String id_caracteristica;
	
	@Id
	private Integer id_usuario;
	

}
