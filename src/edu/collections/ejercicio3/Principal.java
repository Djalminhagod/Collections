package edu.collections.ejercicio3;


import java.util.Map;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        Map<String,Integer> inventario = new TreeMap<String,Integer>();

        inventario.put("anillo",2);
        inventario.put("pulsera",1);
        inventario.put("piercing",3);
        System.out.println("este es el inventario: "+inventario);
        inventario.merge("anillo",1, Integer::sum);
        System.out.println("este es el inventario: "+inventario);
        inventario.remove("pulsera");
        System.out.println("este es el inventario: "+inventario);

    }
}
