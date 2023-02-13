package dio.loopsArrays;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int impar = 0;
        int par = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = sc.nextInt();

        do {
            System.out.println("Números: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade par: " + par);
        System.out.println("Quantidade impar: " + impar);
    }
}
