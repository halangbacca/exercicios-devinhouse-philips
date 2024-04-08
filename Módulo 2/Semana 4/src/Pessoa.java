public class Pessoa {
    protected String nome;
    protected String sobrenome;

    protected String obterNomeCompleto() {
        return this.nome + this.sobrenome;
    }
}
