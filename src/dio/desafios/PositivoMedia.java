package dio.desafios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PositivoMedia {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double media;
        double x;
        int positivo = 0;
        double soma = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                positivo++;
                soma = soma + x;
            }
        }

        media = soma / positivo;
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f%n", media);
    }

}
