package ec.edu.epn.laboratorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	@Autowired
    private ResourceServerTokenServices tokenServices;
	
    @Value("${security.jwt.resource-ids}")
    private String resourceIds;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(resourceIds).tokenServices(tokenServices);
    }
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
                http
                .exceptionHandling().authenticationEntryPoint(new AuthException())
                .and() 
                .requestMatchers()
                .and()
                .authorizeRequests()
                // Micro 1
                .antMatchers("/cliente/**" ).authenticated()
                .antMatchers("/metodo/**" ).authenticated()
                .antMatchers("/proforma/**" ).authenticated()
                .antMatchers("/servicio/**" ).authenticated()
                .antMatchers("/tipoCliente/**" ).authenticated()
                .antMatchers("/tipoServicio/**" ).authenticated()
                // Micro 2
                .antMatchers("/cargosPersonal/**" ).authenticated()
                .antMatchers("/laboratorio/**" ).authenticated()
                .antMatchers("/muestra/**" ).authenticated()
                .antMatchers("/personal/**" ).authenticated()
                .antMatchers("/ordenTrabajo/**" ).authenticated()
                .antMatchers("/tipoPersonal/**" ).authenticated()
                .antMatchers("/unidad/**" ).authenticated()
                // Micro 3                             
                .antMatchers("/bodega/**" ).authenticated()
                .antMatchers("/caracteristica/**" ).authenticated()
                .antMatchers("/compra/**" ).authenticated()
                .antMatchers("/concentracion/**" ).authenticated()
                .antMatchers("/estadoProducto/**" ).authenticated()
                .antMatchers("/existencias/**" ).authenticated()
                .antMatchers("/grado/**" ).authenticated()
                .antMatchers("/hidratacion/**" ).authenticated()
                .antMatchers("/movimientosInventario/**" ).authenticated()
                .antMatchers("/posgiro/**" ).authenticated()
                .antMatchers("/presentacion/**" ).authenticated()
                .antMatchers("/producto/**" ).authenticated()
                .antMatchers("/proveedor/**" ).authenticated()
                .antMatchers("/riesgoEspecifico/**" ).authenticated()
                .antMatchers("/tipoOrdenInventario/**" ).authenticated()
                .antMatchers("/tipoProducto/**" ).authenticated()
                .antMatchers("/tipoProvedor/**" ).authenticated()
                .antMatchers("/unidadMedida/**" ).authenticated();
                // .antMatchers("/oauth/token/**" ).authenticated();
    }    
}
