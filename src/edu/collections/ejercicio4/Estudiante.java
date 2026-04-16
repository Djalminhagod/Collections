package edu.collections.ejercicio4;

import java.util.Set;
import java.util.TreeSet;

public class Estudiante {
    String nombre;
    Set<String> asignaturasAprovadas;
    Set<String> asignaturasPendientes;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    public void cursarAsignaturas(String asignatura, boolean aprovada){
        aprovada = true;
        if (asignaturasAprovadas.contains(asignatura)){
            System.out.println("ya ha cursado la asignatura "+asignatura);
        }else {
            asignaturasAprovadas.add(asignatura);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<String> getAsignaturasPendientes() {
        return asignaturasPendientes;
    }

    public void setAsignaturasPendientes(Set<String> asignaturasPendientes) {
        this.asignaturasPendientes = asignaturasPendientes;
    }

    public Set<String> getAsignaturasAprovadas() {
        return asignaturasAprovadas;
    }

    public void setAsignaturasAprovadas(Set<String> asignaturasAprovadas) {
        this.asignaturasAprovadas = asignaturasAprovadas;
    }
}
