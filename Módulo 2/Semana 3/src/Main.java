public class Main {
    public static void main(String[] args) {

        // Instancia uma nova clínica
        Clinica clinica = new Clinica("Halan");

        // Adiciona um novo cliente
        clinica.adicionarCliente(new Cliente("Halan", 175F, 55F));
        clinica.adicionarCliente(new Cliente("Daniel", 168F, 80F));
        clinica.adicionarCliente(new Cliente("Luciana", 150F, 60F));

        // Halan
        System.out.println(clinica.tratamento(0)); // 50
        System.out.println(clinica.tratamento(0, 5.0F)); // 45

        // Daniel
        System.out.println(clinica.tratamento(1)); // 50
        System.out.println(clinica.tratamento(1, 5.0F)); // 45

        // Lista de clientes
        System.out.println(clinica.getListaDeClientes().toString());

    }
}