package ec.edu.utpl.poo.semana6.pe.model;

public class EmailInstitucional {
    public static final String DOMINIO = "utpl.edu.ec";

    private String usuario;
    private boolean isPublico;
    private int capacidadMax;

    public EmailInstitucional(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return usuario.concat("@").concat(DOMINIO);
    }
}
