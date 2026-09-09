package dev.rampmaster;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correoIns;
    protected String run;

    //metodo constructor
    public Usuario(String nombre, String apellido, String correoIns, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoIns = correoIns;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoIns() {
        return correoIns;
    }

    public void setCorreoIns(String correoIns) {
        this.correoIns = correoIns;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}


