package dev.paie.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	  @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/**").permitAll()
		.antMatchers("/h2-console/**").permitAll()
		.antMatchers("/auth").permitAll()
		.anyRequest().authenticated()
		.and().headers().frameOptions().disable();
	}

	
}
