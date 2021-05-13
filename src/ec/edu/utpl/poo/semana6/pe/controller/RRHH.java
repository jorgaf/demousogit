package ec.edu.utpl.poo.semana6.pe.controller;

import ec.edu.utpl.poo.semana6.pe.model.Cargo;
import ec.edu.utpl.poo.semana6.pe.model.Empleado;
import ec.edu.utpl.poo.semana6.pe.model.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RRHH {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char opc;
        System.out.println("***********-SISTEMA DE RRHH-***********");
        do {
            System.out.println("Ingrese una opción: ");
            System.out.println("[1] Crear un nuevo empleado.");
            System.out.println("[2] Imprimir nómina.");
            System.out.println("[S] Imprimir nómina.");
            System.out.print("Su selección: ");
            opc = lector.next().toUpperCase().charAt(0);
            switch (opc) {
                case '1' -> crearEmpleado(lector);
                case '2'-> imprimirNomina();
                case 'S'-> System.out.println("Adiós");
            }
        } while( opc != 'S');
        System.out.println("Vuelve pronto");
    }

    private static void crearEmpleado(Scanner lector) {
        System.out.println("*****Creación empleado****");
        String email;
        String nroExtension;

        Persona p = crearPersona(lector);
        Cargo c = crearCargo(lector);

        System.out.print("Ingrese email: ");
        email = lector.next();
        System.out.print("Ingrese # extensión: ");
        nroExtension = lector.next();

        Empleado emp = new Empleado(p, c, email,nroExtension);
        empleados.add(emp);
        System.out.println("\nEmpleado creado correctamente\n");
    }

    private static Persona crearPersona(Scanner lector) {
        String cedula;
        String nombre;

        System.out.print("Ingrese cédula: ");
        cedula = lector.next();
        System.out.print("Ingrese nombre: ");
        nombre = lector.next();
        return new Persona(cedula, nombre);
    }

    private static Cargo crearCargo(Scanner lector) {
        String rol;
        double salario;
        System.out.print("Ingrese rol: ");
        rol = lector.next();
        System.out.print("Ingrese salario: ");
        salario = lector.nextDouble();
        return new Cargo(rol, salario);
    }

    private static void imprimirNomina() {
        System.out.println("***** NÓMINA DE EMPLEADOS *****");
        System.out.printf("%12s\t%20s\t%12s\t%10s\t%10s\n",
                "NOMBRE",
                "EMAIL",
                "ROL",
                "EXTENSIÓN",
                "SALARIO");

        for( var emp : empleados ) {
            System.out.printf("%12s\t%20s\t%12s\tExt.:%-10s\t%10.2f\n",
                    emp.getNombre(),
                    emp.getEmail(),
                    emp.getRol(),
                    emp.getExtensionTelf(),
                    emp.getSalario());
        }
    }
}
