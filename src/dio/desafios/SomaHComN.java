package dio.desafios;

import java.util.Scanner;

class SomaHComN {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {

            h+= (double)1/i;

        }

        //TODO: Calcule o valor de H de forma que resulte na soma dos termos:


        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        System.out.println(Math.round(h));
    }
}
