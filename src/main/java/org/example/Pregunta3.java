package org.example;

import java.util.Scanner;

public class Pregunta3 {
    public static void Numeros () {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Ingresar primer número");

            int valor = sc.nextInt();

            if ( valor == 0 ){

                break;
        }

            suma = suma + valor;
    }
        System.out.println("la suma es: " +suma);
}
}