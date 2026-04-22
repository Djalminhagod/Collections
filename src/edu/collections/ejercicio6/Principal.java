package edu.collections.ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        List<String> comidas = new ArrayList<>();
        comidas.add("Pollo con patatas");
        comidas.add("Lasaña vegetal");
        comidas.add("Caldo");
        comidas.add("Pollo con patatas");
        comidas.add("Ensalada");
        comidas.add("Caldo");
        comidas.add("Pollo con patatas");
        comidas.add("burrito");
        comidas.add("burrito");
        comidas.add("burrito");



        Map<String,Integer> mapa = new HashMap<>();
        for(String comida : comidas){
            if(!mapa.containsKey(comida)){
                mapa.put(comida,1);
            }
            else{
                mapa.put(comida,mapa.get(comida)+1);
            }
        }
        System.out.println("comidas semana "+mapa);









    }
}

