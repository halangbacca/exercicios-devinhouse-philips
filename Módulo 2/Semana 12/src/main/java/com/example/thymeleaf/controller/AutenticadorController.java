package com.example.thymeleaf.controller;

import com.example.thymeleaf.dto.LoginDto;
import com.example.thymeleaf.dto.TokenDto;
import com.example.thymeleaf.dto.UsuarioDto;
import com.example.thymeleaf.model.Usuario;
import com.example.thymeleaf.repository.PerfilRepository;
import com.example.thymeleaf.repository.UsuarioRepository;
import com.example.thymeleaf.service.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AutenticadorController {
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final UsuarioRepository repository;
    private final PerfilRepository perfilRepository;
    private final PasswordEncoder encoder;

    public AutenticadorController(AuthenticationManager authenticationManager, TokenService tokenService, UsuarioRepository repository, PerfilRepository perfilRepository, PasswordEncoder encoder) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.repository = repository;
        this.perfilRepository = perfilRepository;
        this.encoder = encoder;
    }

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Validated LoginDto loginDto) {
        var login = loginDto.converter();
        try {
            var authentication = authenticationManager.authenticate(login);
            var token = tokenService.gerarToken(authentication);
            return ResponseEntity.ok(new TokenDto(token, "Bearer"));
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody @Validated UsuarioDto usuarioDto) {
        perfilRepository.save(usuarioDto.getPerfil());

        var usuario = Usuario.builder()
                .username(usuarioDto.getUsername())
                .password(encoder.encode(usuarioDto.getPassword()))
                .ativo(usuarioDto.getAtivo())
                .perfis(List.of(usuarioDto.getPerfil()))
                .build();
        repository.save(usuario);
        return ResponseEntity.created(URI.create("/auth/cadastrar")).build();
    }

}
