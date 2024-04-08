import java.util.Arrays;
import java.util.List;

public class EX7 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        System.out.println("For clássico");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println();

        System.out.println("forEach");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        System.out.println("While");
        int indice = 0;
        while (indice < nomes.size()) {
            System.out.println(nomes.get(indice));
            indice++;
        }
    }
}
