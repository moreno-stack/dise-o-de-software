import java.util.Date;

public abstract class Notificacion {
    protected String codigo;
    protected String destinatario;
    protected String mensaje;
    protected Date fechaEnvio;
    protected String estado;
    protected CanalEnvio canal;

    public Notificacion(String codigo, String destinatario, String mensaje, CanalEnvio canal) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = new Date();
        this.estado = "PENDIENTE";
        this.canal = canal;
    }

    public void enviar() {
        canal.enviar(this);
        estado = "ENVIADO";
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
