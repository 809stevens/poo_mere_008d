package dev.rampmaster;

import java.util.HashSet;

public class Administrativo extends Usuario implements Colaborable {
    private HashSet<Asignatura> asignaturas;

    public Administrativo(String nombre, String apellido, String correoIns, String run, HashSet<Asignatura> asignaturas) {
        super(nombre, apellido, correoIns, run);
        this.asignaturas = asignaturas;
    }

    public HashSet<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(HashSet<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void agregarAsignatura(String asignatura){
        asignaturas.add(asignatura);


    }
    public void eliminarAsignatura(String){

    }

    @Override
    public int usarJunaColaborable(int valorAlmuerzo) {
        return 0;
    }
}
