package edu.collections.ejercicio4;

import java.util.Set;
import java.util.TreeSet;

public class Estudiante {
    private String nombre;
    private Set<String> asignaturasAprovadas;
    private Set<String> asignaturasPendientes;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    public void cursarAsignatura(String asignatura, boolean aprobada) {

        if (asignaturasAprovadas.contains(asignatura)) {
            System.out.println("Ya ha cursado esa asignatura");
            return;
        }
        if (aprobada) {
            asignaturasAprovadas.add(asignatura);
            asignaturasPendientes.remove(asignatura);
        } else {
            asignaturasPendientes.add(asignatura);
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
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", asignaturasAprovadas=" + asignaturasAprovadas +
                ", asignaturasPendientes=" + asignaturasPendientes +
                '}';
    }
}
