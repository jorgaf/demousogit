package ec.edu.utpl.poo.semana6.pe.model;

public class Cargo {
    private String role;
    private double salario;

    public Cargo(String role, double salario) {
        this.role = role;
        this.salario = salario;
    }

    public String getRole() {
        return role;
    }

    public double getSalario() {
        return salario;
    }
}
