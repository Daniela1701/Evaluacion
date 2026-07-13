package org.example;

import java.util.Scanner;

public class Pregunta4 {
    public static void enteros() {
        int mayor = 9;
        int numero[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Numero 1");
        numero[0] = sc.nextInt();
        System.out.printf("Numero 2");
        numero[1] = sc.nextInt();
        System.out.printf("Numero 3");
        numero[2] = sc.nextInt();
        System.out.printf("Numero 4");
        numero[3] = sc.nextInt();
        System.out.printf("Numero 5");
        numero[4] = sc.nextInt();
        System.out.printf("Numero 6");
        numero[5] = sc.nextInt();
        System.out.printf("Numero 7");
        numero[6] = sc.nextInt();
        System.out.printf("Numero 8");
        numero[7] = sc.nextInt();
        System.out.printf("Numero 9");
        numero[8] = sc.nextInt();
        System.out.printf("Numero 10");
        numero[9] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numero[i] > 9) {
                System.out.println("Numero mayor" + mayor);
            }
            break;
        }


    }
}