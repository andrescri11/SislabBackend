package ec.edu.epn.laboratorios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_justificacion")
public class TipoJustificacion {

	@Id
	private String id_tipojust;
	
	private String nombre_justv;
}
