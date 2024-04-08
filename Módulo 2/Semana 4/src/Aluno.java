public class Aluno extends Pessoa {
    private String matricula;

    public String registrar() {
        return "Sou " + super.obterNomeCompleto() + " e minha matrícula é " + this.matricula;
    }

}
