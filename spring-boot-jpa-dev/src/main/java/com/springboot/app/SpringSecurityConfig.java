package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // acceso de las rutas publicas y proteccion rutas privadas
        http.authorizeRequests().antMatchers("/","/css/**","/js/**","/images/**","/listar").permitAll()
                .antMatchers("/ver/**").hasAnyRole("USER")
                .antMatchers("/uploads/**").hasAnyRole("USER")
                .antMatchers("/form/**").hasAnyRole("ADMIN")
                .antMatchers("/eliminar/**").hasAnyRole("ADMIN")
                .antMatchers("/factura/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated();
    }

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception{

        /*
        * Guardamos usuaros In-Memory
        * */
        UserBuilder users = User.withDefaultPasswordEncoder();
        build.inMemoryAuthentication()
                .withUser(users.username("admin").password("123456").roles("ADMIN","USER"))
                .withUser(users.username("plerzundi").password("123456").roles("USER"));
    }

}
