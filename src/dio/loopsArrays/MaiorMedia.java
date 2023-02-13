package dio.loopsArrays;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();

            media = media + numero;
            if (numero > maior)
                maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Média: " + media/5);
        System.out.println("Maior numero: " + maior);
    }
}
