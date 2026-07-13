package org.example;

import java.util.Scanner;

public class Pregunta2 {
    public static void Trimestre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del año");
        int trimestre = sc.nextInt();
        String mes = "";

        switch (trimestre){
            case 1:
            case 2:
            case 3:
                if (trimestre <=3 && trimestre >= 1) {
                    System.out.println("Primer trimestre");
                }
                break;
            case 4:
            case 5:
            case 6:
                 if (trimestre <= 6 && trimestre >=4 ) {
                    System.out.println("Segundo trimestre");                }
                break;

            case 7:
            case 8:
            case 9:
                if (trimestre <= 9 && trimestre >=7 ) {
                    System.out.println("Tercer trimestre");                }
                break;
            case 10:
            case 11:
            case 12:
                if (trimestre <= 12 && trimestre >=10 ) {
                    System.out.println("Cuarto trimestre");                }
                break;
        }




    }
}
