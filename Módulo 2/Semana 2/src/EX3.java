public class EX3 {
    public static void main(String[] args) {
        int soma = 0;

        int[] extrato = {100, -35, -15, -5, 55, -20};

        for (int i = 0; i < extrato.length; i++) {
            System.out.print("[" + extrato[i] + "]");
        }

        System.out.print("\n");

        for (int i = extrato.length - 1; i >= 0; i--) {
            System.out.print("[" + extrato[i] + "]");
        }

        for (int i = 0; i < extrato.length; i++) {
            soma += extrato[i];
        }

        System.out.println("\nSaldo final da conta: R$" + soma);

        if (soma > 0) {
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo negativo");
        }

    }
}
