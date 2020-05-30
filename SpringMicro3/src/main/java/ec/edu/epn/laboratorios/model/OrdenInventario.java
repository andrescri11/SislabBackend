package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordeninventario")
public class OrdenInventario {
	
	@Id
	private String id_ordeninventario;
	
	private String id_detalleorden;
	
	@ManyToOne
	@JoinColumn(name = "id_compra")
	private Compra compra;
	//private String id_compra;
	
	@ManyToOne
	@JoinColumn(name = "id_tipordeninv")
	private TipoOrdenInventario tipoOrdenInventario;
	//private String id_tipordeninv;
	
	private Integer id_unidad;
	private String responsable_oi;
	private LocalDate fechaingreso_oi;
	private String descr_oi;
	private Integer auxid_oi;
	private String estado_oi;
	private String motivo_estado;
}
