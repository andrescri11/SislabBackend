package ec.edu.epn.laboratorios.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SequenceGenerator(
		name = "MovimientosInventarioSecuencia", 
		sequenceName = "secuencia_movinventario", 
		initialValue = 1, 
		allocationSize = 1)

@Entity
@Table(name = "movimientosinventario")
public class MovimientosInventario {
	
	@Id
	@GeneratedValue(generator = "MovimientosInventariogenerator")
	@GenericGenerator(name = "MovimientosInventariogenerator", 
						parameters = @Parameter(name = "sequenceName", value = "secuencia_movinventario"),
						strategy = "ec.edu.epn.laboratorios.utils.MyGenerator")
	private String id_movimiento;
	
	@Column(name = "id_existencia", nullable = false)
	private String id_existencia;
	
	@ManyToOne
	@JoinColumn(name = "id_ordeninventario", nullable = false)
	private OrdenInventario ordenInventario;
	//@Column(name = "id_ordeninventario", nullable = false)
	//private String id_ordeninventario;
	
	private String envase_mov;
	
	@Column(name = "cantidad_mov", nullable = false)
	private Integer cantidad_mov;
	private Double preciocompra_mov;
	private String observaciones_mov;
	private Integer saldo_e;
	private Integer dism;
	private Integer increm;
	private LocalDate fecha_mi;
	private String aux1;
	private String aux2;
	private String toi;
	private Double cantidad_dmt;
	private String id_tipojust;
	

}
