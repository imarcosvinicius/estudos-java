package dio.loopsArrays;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();
        int multi = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multi = multi * i;
        }
        System.out.println(multi);
    }
}
