package com.edu.HMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;

import com.edu.HMS.service.UserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig<PasswordEncoder, AuthenticationManagerBuilder, userDetailsService> extends WebMvcConfigurerAdapter{

	
	@Autowired
	private UserDetailsService userDetailsService;
	
	protected  void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService (userDetailsService);
		
	}
	@Override
	protected void configurer(HttpEntity http) throws Exception {
	 http.csrf().disable()

		.authorizeRequests()
		.antMatchers("/patient/*").hasAuthority("ROLE_PATIENT")
		.antMatchers("/doctor/*").hasAuthority("ROLE_DOCTOR")
		.antMatchers("/admin/*").hasAuthority("ROLE_ADMIN")
		.antMatchers("/").permitAll()// index.html
		.antMatchers("/**").authenticated()

		.and().httpBasic()
		
		.and().formLogin().permitAll()
		.and().logout().permitAll()
		;

	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
	/*public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
}*/


