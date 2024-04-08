import java.util.ArrayList;
import java.util.List;

public class Clinica {
    // Atributos
    private String nomeDoDono;
    private String nomeDaClinica;
    private String CNPJ;
    private String logradouro;
    private Integer codigoDaClinica;
    private List<Cliente> listaDeClientes = new ArrayList<>();

    // Construtores
    public Clinica(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public Clinica(String nomeDoDono, List<Cliente> listaDeClientes) {
        this.nomeDoDono = nomeDoDono;
        this.listaDeClientes = listaDeClientes;
    }

    // Métodos
    public void calcularIMC(Float peso, Float altura) {
        Float IMC = peso / (altura * altura);
        if (IMC < 18.5F) {
            System.out.println(String.format("%.2f = Magreza", IMC));
        } else if (IMC >= 18.5F && IMC <= 24.9F) {
            System.out.println(String.format("%.2f = Normal", IMC));
        } else if (IMC >= 25.0F && IMC <= 29.9F) {
            System.out.println(String.format("%.2f = Sobrepeso", IMC));
        } else if (IMC >= 30.0F && IMC <= 39.9F) {
            System.out.println(String.format("%.2f = Obesidade", IMC));
        } else if (IMC > 40.0F) {
            System.out.println(String.format("%.2f = Obesidade grave", IMC));
        }
    }

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public Float tratamento(Integer id) {
        float peso = 0F;

        try {
            listaDeClientes.get(id).setPeso(listaDeClientes.get(id).getPeso() - 5);
            peso = listaDeClientes.get(id).getPeso();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cliente não identificado!");
            System.exit(1);
        }
        return peso;
    }

    public Float tratamento(Integer id, Float valor) {
        Float peso = 0F;

        try {
            listaDeClientes.get(id).setPeso(listaDeClientes.get(id).getPeso() - valor);
            peso = listaDeClientes.get(id).getPeso();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cliente não identificado!");
            System.exit(1);
        }
        return peso;
    }

    // Getter
    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
}
