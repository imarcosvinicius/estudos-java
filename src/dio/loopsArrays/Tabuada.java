package dio.loopsArrays;

import java.awt.*;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Tabuada de: " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
