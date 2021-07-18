package sn.mit.edu.naissance.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import sn.mit.edu.naissance.service.UserDetail;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**" ).permitAll()
                .anyRequest().authenticated()
                            
                .and()
                .formLogin()
                	.loginPage("/index").permitAll()
					.loginProcessingUrl("/seConnecter")
					.defaultSuccessUrl("/connecteSucces?login=true")
					.failureUrl("/index?error=true")
					.usernameParameter("username")
					.passwordParameter("password")

				.and()
					
			.csrf().disable().formLogin()
			.and()
			.logout()
						.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
						.logoutSuccessUrl("/index?logout=true")
						//.invalidateHttpSession(true)
												
			.and()
			.exceptionHandling()
					.accessDeniedPage("/access-denied");
		
	}
	

	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserDetail userDetails;
	
	
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
			auth
			.userDetailsService(userDetails)
			.passwordEncoder(bCryptPasswordEncoder);
			
	}


	

	

}
