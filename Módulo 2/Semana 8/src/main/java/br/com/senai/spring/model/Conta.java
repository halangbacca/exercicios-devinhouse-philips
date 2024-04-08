package br.com.senai.spring.model;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    @Min(0)
    private Double saldo = 0.0;
    private Integer clienteId;

    public void recebe(Double valor){
        this.saldo += valor;
    }
}
