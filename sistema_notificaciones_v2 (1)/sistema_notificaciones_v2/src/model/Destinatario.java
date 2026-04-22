public class Destinatario {
    private String id;
    private String nombre;
    private String correoElectronico;
    private String numeroCelular;
    private String tokenMovil;

    public Destinatario(String id, String nombre, String correo, String celular, String token) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correo;
        this.numeroCelular = celular;
        this.tokenMovil = token;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreoElectronico() { return correoElectronico; }
    public String getNumeroCelular() { return numeroCelular; }
    public String getTokenMovil() { return tokenMovil; }
}
