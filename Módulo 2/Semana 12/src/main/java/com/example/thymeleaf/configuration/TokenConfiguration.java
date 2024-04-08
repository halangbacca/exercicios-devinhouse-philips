package com.example.thymeleaf.configuration;

import com.example.thymeleaf.repository.UsuarioRepository;
import com.example.thymeleaf.service.TokenService;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TokenConfiguration extends OncePerRequestFilter {
    private final TokenService tokenService;
    private final UsuarioRepository repository;

    public TokenConfiguration(TokenService tokenService, UsuarioRepository repository){
        this.tokenService = tokenService;
        this.repository = repository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException, ServletException {
        var token = recuperarToken(request);
        var valido = tokenService.isTokenValid(token);
        if(valido) autenticarCliente(token);

        filterChain.doFilter(request, response);
    }

    private void autenticarCliente(String token) {
//        var idUsuario = tokenService.getIdUsuario
    }

    private String recuperarToken(HttpServletRequest request) {
        var token = request.getHeader("Authorization");
        if(token.isBlank() || !token.startsWith("Bearer")) return null;

        return token.substring(7);
    }

}
