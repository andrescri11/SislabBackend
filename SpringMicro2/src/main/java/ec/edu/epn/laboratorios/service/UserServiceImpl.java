package ec.edu.epn.laboratorios.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ec.edu.epn.laboratorios.dao.IUsuarioDAO;
import ec.edu.epn.laboratorios.model.Usuario;

@Service("userDetailsService")
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private IUsuarioDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userDAO.findOneByUsername(username); //from usuario where username := username
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		user.getRoles().forEach( role -> {
			authorities.add(new SimpleGrantedAuthority(role.getNombre()));
		});
		
		UserDetails userDetails = new User(user.getUsername(), user.getPassword(), authorities);
		
		return userDetails;
	}

}
