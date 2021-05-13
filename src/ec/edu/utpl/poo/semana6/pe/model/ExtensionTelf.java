package ec.edu.utpl.poo.semana6.pe.model;

public class ExtensionTelf {
    private String nro;
    private String codigoSalida;
    private boolean tieneBuzonVoz;

    public ExtensionTelf(String nro) {
        this.nro = nro;
        this.codigoSalida = "#".concat(nro).concat("#");
        this.tieneBuzonVoz = true;
    }

    public String getNro() {
        return nro;
    }
}
