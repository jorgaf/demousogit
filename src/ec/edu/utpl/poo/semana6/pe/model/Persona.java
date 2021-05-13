package ec.edu.utpl.poo.semana6.pe.model;

public class Persona {
    private String cedula;
    private String nombre;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
