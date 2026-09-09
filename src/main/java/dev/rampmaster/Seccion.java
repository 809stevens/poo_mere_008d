package dev.rampmaster;

public class Seccion {
    // Atributos
    private String codigo;
    private Asignatura asignatura;
    private boolean activa = false;

    public Seccion(String codigo, Asignatura asignatura){
        this.codigo = codigo;
        this.asignatura = asignatura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
