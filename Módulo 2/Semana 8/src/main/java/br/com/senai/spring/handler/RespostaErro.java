package br.com.senai.spring.handler;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@NotBlank
public class RespostaErro {
    private String mensagem;
    private String exception;

    public RespostaErro(String exception) {
        this.exception = exception;
    }

}
