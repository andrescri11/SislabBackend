package ec.edu.epn.laboratorios.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.epn.laboratorios.dao.IMenuDAO;
import ec.edu.epn.laboratorios.model.Menu;



@Service
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private IMenuDAO dao;

	@Override
	public Menu registrar(Menu menu) {
		return dao.save(menu);
	}

	@Override
	public Menu modificar(Menu menu) {
		return dao.save(menu);
	}

	@Override
	public void eliminar(int idMenu) {
		dao.delete(idMenu);
	}

	@Override
	public Menu listarId(int idMenu) {
		return dao.findOne(idMenu);
	}

	@Override
	public List<Menu> listar() {
		return dao.findAll();
	}

	@Override
	public List<Menu> listarMenuPorUsuario(String nombre) {		
		List<Menu> menus = new ArrayList<>();
		dao.listarMenuPorUsuario(nombre).forEach( x -> {
			Menu m = new Menu();
			m.setIdMenu((Integer.parseInt(String.valueOf(x[0]))));
			m.setTitulo(String.valueOf(x[1]));
			m.setNombre(String.valueOf(x[2]));
			m.setUrl(String.valueOf(x[3]));		
	
			menus.add(m);
			System.out.print(m);
		});
		return menus;			
	}

}
