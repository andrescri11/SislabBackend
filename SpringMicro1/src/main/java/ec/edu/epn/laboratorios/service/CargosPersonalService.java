package ec.edu.epn.laboratorios.service;
import java.util.List;
import ec.edu.epn.laboratorios.model.CargosPersonal;

public interface CargosPersonalService {
	List<CargosPersonal> getListaCargosPersonal();
	CargosPersonal ingresarCargoP(CargosPersonal cargosPersonal);
	void eliminarCargoPersonal(String id);
	CargosPersonal actualizarCargosP(CargosPersonal cargosPersonal);
}
