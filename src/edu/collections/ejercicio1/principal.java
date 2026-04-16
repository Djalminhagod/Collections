package edu.collections.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class principal {
     public static void main() {
        Scanner sc = new Scanner(System.in);
         Set<String> lista = new HashSet<String>();
         System.out.println("Introduce 3 palabras");
         for (int i = 0; i < 3; i++) {

             lista.add(sc.nextLine());
         }
         for (String s : lista) {
             System.out.println(s);
         }


    }
}
