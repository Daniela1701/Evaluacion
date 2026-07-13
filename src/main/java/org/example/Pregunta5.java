package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pregunta5 {
    public  void Nombres(){
        String [] lenguajes = {"C" , "Java" , "C++" , "Python" , "JavaScript"};
       String masLargo = lenguajes[0];
        for (int i = 1; i < lenguajes.length; i++)
        {
            if (
                    lenguajes[i].length()>masLargo.length()){
                masLargo = lenguajes[i];

        }
            }
            System.out.println("El lenguaje mas largo es: " +masLargo);

    }
}


