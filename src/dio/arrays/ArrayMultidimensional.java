package dio.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) { // Linha
            for (int j = 0; j < M[i].length; j++) { // Coluna
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementroColuna : linha) {
                System.out.print(elementroColuna + " ");
            }
            System.out.println();
        }

    }
}
