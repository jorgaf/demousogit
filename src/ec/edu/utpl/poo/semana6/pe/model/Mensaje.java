package ec.edu.utpl.poo.semana6.pe.model;

import java.util.List;

public class Mensaje {
    private Empleado emisor;
    private List<Empleado> receptores;
    private String mensaje;

    public Mensaje(Empleado emisor, List<Empleado> receptores, String mensaje) {
        this.emisor = emisor;
        this.receptores = receptores;
        this.mensaje = mensaje;
    }

    public void enviar( MedioComunicacion medio) {
        for( var receptor : receptores ) {
            medio.enviar(emisor.getNombre(), receptor.getNombre(), mensaje);
        }
    }
}
