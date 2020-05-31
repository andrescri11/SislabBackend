package ec.edu.epn.laboratorios.utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;


public class MyGenerator implements Configurable, IdentifierGenerator {

	private String sequenceName;
	
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {

		Connection connection = (Connection) arg0.connection();
		PreparedStatement ps = null;
		String consultaSecuencia = "select nextval ('\"laboratorios\"." + sequenceName + "')";
		try {
			ps = connection.prepareStatement(consultaSecuencia);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				return rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		sequenceName = params.getProperty("sequenceName");
	}

}
