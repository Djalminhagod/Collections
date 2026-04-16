package edu.collections.ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int suma = 0;
        int mayor = 0;
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(67);
    numeros.add(5);
    numeros.add(6);
    numeros.add(7);

        System.out.println("imprimiendo numeros");
    for(Integer numero : numeros){

        System.out.println(numero);
    }
        System.out.println("cantidad de numeros");
        System.out.println(numeros.size());

        for(int i = 0; i < numeros.size(); i++){
            suma += numeros.get(i);
        }
        System.out.println("suma de todos los numeros");
        System.out.println(suma);
        for(int i = 0; i < numeros.size(); i++){
            if(mayor < numeros.get(i)){
                mayor = numeros.get(i);
            }
        }
        System.out.println("el numero mayor es: "+mayor);
}
}
