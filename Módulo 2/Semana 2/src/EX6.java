import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX6 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4);
        List<Integer> novaLista = new ArrayList<>();

        for (Integer numero : lista) {
            novaLista.add(numero * 3);
        }

        for (Integer numero : novaLista) {
            System.out.println(numero);
        }

    }
}
