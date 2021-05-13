package ec.edu.utpl.poo.semana6.pe.model;

import java.time.LocalDate;

public class Empleado {
    private Persona empleado;
    private Cargo funcion;
    private LocalDate fechaIngreso;
    private EmailInstitucional email;
    private ExtensionTelf extensionTelf;

    public Empleado( Persona empleado, Cargo funcion, String email, String nroExtension ) {
        this.empleado = empleado;
        this.funcion = funcion;
        this.fechaIngreso = LocalDate.now();
        this.email = new EmailInstitucional(email);
        this.extensionTelf = new ExtensionTelf(nroExtension);
    }

    public String getNombre() {
        return empleado.getNombre();
    }

    public String getRol() {
        return funcion.getRole();
    }

    public double getSalario() {
        return funcion.getSalario();
    }

    public String getEmail() {
        return email.getEmail();
    }

    public String getExtensionTelf() {
        return extensionTelf.getNro();
    }
}
