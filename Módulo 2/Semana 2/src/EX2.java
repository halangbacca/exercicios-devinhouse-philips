public class EX2 {
    public static void main(String[] args) {
        double somaPrimeiroArray = 0;
        double somaSegundoArray = 0;
        double somaTerceiroArray = 0;
        double somaQuartoArray = 0;

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        System.out.println("Primeiro elemento do terceiro array: " + notas[2][0]);
        System.out.println("Segundo elemento do quarto array: " + notas[3][1]);

        for (int i = 0; i < notas[0].length; i++) {
            somaPrimeiroArray += notas[0][i];
        }

        for (int i = 0; i < notas[1].length; i++) {
            somaSegundoArray += notas[1][i];
        }

        for (int i = 0; i < notas[2].length; i++) {
            somaTerceiroArray += notas[2][i];
        }

        for (int i = 0; i < notas[3].length; i++) {
            somaQuartoArray += notas[3][i];
        }

        System.out.println("Soma das quatro primeiras notas do primeiro array: " + somaPrimeiroArray);
        System.out.println("Soma das quatro primeiras notas do segundo array: " + somaSegundoArray);
        System.out.println("Soma das quatro primeiras notas do terceiro array: " + somaTerceiroArray);
        System.out.println("Soma das quatro primeiras notas do quarto array: " + somaQuartoArray);

    }
}
