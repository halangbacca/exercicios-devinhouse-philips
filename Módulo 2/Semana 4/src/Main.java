import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 0;

        do {
            try {
                System.out.print("Digite a sua idade: ");
                Scanner scanner = new Scanner(System.in);
                idade = scanner.nextInt();

                if (idade < 0 || idade == 0 || idade > 100) {
                    throw new InputMismatchException();
                } else {
                    System.out.println("Olá, você tem " + idade + " anos de idade!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Não foi possível determinar sua idade!\n");
            }
        } while (idade < 0 || idade == 0 || idade > 100);
    }
}