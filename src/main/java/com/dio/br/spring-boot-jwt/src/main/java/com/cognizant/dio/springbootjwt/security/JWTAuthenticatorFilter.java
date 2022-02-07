package com.cognizant.dio.springbootjwt.security;

import com.cognizant.dio.springbootjwt.data.UserData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class JWTAuthenticatorFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;


    public JWTAuthenticatorFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public Authentication authentication(HttpServletRequest request,
                                         HttpServletResponse response) throws AuthenticationException {
        try {
            UserData userData = new ObjectMapper().readValue(request.getInputStream(), UserData.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userData.getUserName(),
                    userData.getPassword(),
                    new ArrayList<>()));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
