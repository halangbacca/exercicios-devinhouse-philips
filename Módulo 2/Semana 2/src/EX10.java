import java.util.Scanner;

public class EX10 {
    public static void palindromo(String palavra) {
        String palavraInvertida = new StringBuffer(palavra.toLowerCase()).reverse().toString().toLowerCase();
        if (palavraInvertida.equals(palavra.toLowerCase())) {
            System.out.println("A palavra é um palíndromo!");
        } else {
            System.out.println("A palavra não é um palíndromo!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Digite uma palavra: ");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        palindromo(palavra);

    }
}
