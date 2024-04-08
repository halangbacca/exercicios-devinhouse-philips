import java.util.Arrays;

public class EX5 {
    public static void calcular(Integer[] arr) {
        Integer maior;
        Integer menor;

        if (arr == null || arr.length <= 1 || arr[0] == arr[arr.length - 1]) {
            System.out.println("Não é possível calcular!");
        } else {
            Arrays.sort(arr);
            menor = arr[0];
            maior = arr[arr.length - 1];
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
    }

    public static void main(String[] args) {
        calcular(new Integer[]{56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47});
        calcular(new Integer[]{1});
        calcular(new Integer[]{1, -1});
        calcular(new Integer[]{null});
        calcular(new Integer[]{-2, -2, -2, -2});
        calcular(new Integer[]{20, 10, 30});
    }
}
