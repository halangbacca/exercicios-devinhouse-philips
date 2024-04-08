public class Cliente {
    // Atributos
    private String nome;
    private Float peso;
    private Float altura;
    private Integer idade;

    // Construtores
    public Cliente(String nome, Float altura, Float peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente(Float altura, Float peso, Integer idade) {
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    // Getters e Setters
    public Float getPeso() {
        return peso;
    }

    public Float setPeso(Float peso) {
        this.peso = peso;
        return peso;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}