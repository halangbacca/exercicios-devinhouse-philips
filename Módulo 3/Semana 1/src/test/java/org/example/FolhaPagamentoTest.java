package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaPagamentoTest {

    private FolhaPagamento folhaPagamento;

    @BeforeEach
    public void setup() {
        folhaPagamento = new FolhaPagamento();
    }

    @Test
    @DisplayName("Quando não informados gratificação e função gerencial, deve retornar salário base")
    void calcularSalarioBruto_salarioBase() {
        Double salarioBase = 1000.0;
        Double gratificacao = null;
        String funcao = "analista";

        Double salarioBruto = folhaPagamento.calcularSalarioBruto(salarioBase, gratificacao, funcao);

        assertNotNull(salarioBruto);
        assertEquals(salarioBase, salarioBruto);
    }

    @Test
    @DisplayName("Quando informada a gratificação, deve retornar salário acrescido do valor da gratificação")
    void calcularSalarioBruto_gratificacao() {
        Double salarioBase = 1000.0;
        Double gratificacao = 250.0;
        String funcao = "analista";

        Double salarioBruto = folhaPagamento.calcularSalarioBruto(salarioBase, gratificacao, funcao);

        assertNotNull(salarioBruto);
        assertEquals(salarioBase + gratificacao, salarioBruto);
        assertTrue(salarioBase < salarioBruto);
    }

    @Test
    @DisplayName("Quando informada a função gerencial, deve retornar salário acrescido do percentual previsto")
    void calcularSalarioBruto_funcao() {
        Double salarioBase = 1000.0;
        Double gratificacao = null;
        String funcao = "gerente";

        Double salarioBruto = folhaPagamento.calcularSalarioBruto(salarioBase, gratificacao, funcao);

        assertNotNull(salarioBruto);
        assertEquals(salarioBase * 1.30, salarioBruto);
        assertTrue(salarioBase < salarioBruto);
    }

    @Test
    @DisplayName("Quando informada a função gerencial e a gratificação, deve retornar salário acrescido dos valores")
    void calcularSalarioBruto_funcaoGratificacao() {
        Double salarioBase = 1000.0;
        Double gratificacao = 200.0;
        String funcao = "gerente";

        Double salarioBruto = folhaPagamento.calcularSalarioBruto(salarioBase, gratificacao, funcao);

        assertNotNull(salarioBruto);
        assertEquals((salarioBase + gratificacao) * 1.30, salarioBruto);
        assertTrue(salarioBase < salarioBruto);
    }

    @Test
    @DisplayName("Quando não há descontos, deve retornar o salário")
    void calcularSalarioLiquido_semDescontos() {
        Double salario = 1000.0;
        List<Double> descontos = new ArrayList<>();

        Double salarioLiquido = folhaPagamento.calcularSalarioLiquido(salario, descontos);

        assertNotNull(salarioLiquido);
        assertEquals(salario, salarioLiquido);
    }

    @Test
    @DisplayName("Quando contém descontos, deve retornar o salário com os descontos debitados")
    void calcularSalarioLiquido_comDescontos() {
        Double salario = 1000.0;
        List<Double> descontos = List.of(250.0, 200.0);
        Double somaDeDescontos = descontos.stream().reduce(Double::sum).get();

        Double salarioLiquido = folhaPagamento.calcularSalarioLiquido(salario, descontos);

        assertNotNull(salarioLiquido);
        assertEquals(salario - somaDeDescontos, salarioLiquido);
        assertTrue(salario > salarioLiquido);
    }

    @Test
    @DisplayName("Quando contém descontos que ultrapassam o valor do salário, deve lançar uma IllegalStateException")
    void calcularSalarioLiquido_salarioNegativo() {
        Double salario = 1000.0;
        List<Double> descontos = List.of(1000.0, 200.0);
        Double somaDeDescontos = descontos.stream().reduce(Double::sum).get();

        assertThrows(IllegalStateException.class, () ->
                folhaPagamento.calcularSalarioLiquido(salario, descontos));
    }

}