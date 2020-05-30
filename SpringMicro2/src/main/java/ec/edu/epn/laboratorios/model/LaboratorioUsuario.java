package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laboratorio_usuario")
public class LaboratorioUsuario {
	
	@Id
	private Integer id_laboratorio;
	private Integer id_usuario;
	
	public Integer getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(Integer id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	
}
