package com.example.thymeleaf.dto;

import com.example.thymeleaf.model.Perfil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private Boolean ativo;
    private Perfil perfil;
}
