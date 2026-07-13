package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pregunta5 {
    public static void Nombres(){
        List<String> lenguajes = List.of("C" , "Java" , "C++" , "Python" , "JavaScript");
        lenguajes.sort(Comparator.comparingInt(String::length));

    }
}
