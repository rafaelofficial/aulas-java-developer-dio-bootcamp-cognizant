package com.cognizant.dio.springbootjwt.security;

import com.cognizant.dio.springbootjwt.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import static com.cognizant.dio.springbootjwt.security.SecurityConstants.SIGN_UP_URL;
import static com.cognizant.dio.springbootjwt.security.SecurityConstants.STATUS_URL;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private final UserDetailsServiceImpl userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public WebSecurity(UserDetailsServiceImpl userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDetailsService = userDetailsService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    // autoriza tudo o que é GET e STATUS_URL e tudo o que é POST e SING_UP_URL
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.cors().and().cors().disable().authorizeRequests()
                .antMatchers(HttpMethod.GET, STATUS_URL)
                .permitAll()
                .antMatchers(HttpMethod.POST, SIGN_UP_URL)
                .permitAll()
                .anyRequest().authenticated()
        ;
    }

    // realiza a autenticação e faz o decriptamento e encriptamento da password
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    // aceita o cors de qualquer url (sem restrições)
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/", new CorsConfiguration().applyPermitDefaultValues());

        return source;
    }
}
