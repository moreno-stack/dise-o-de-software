import java.time.LocalDateTime;

public abstract class Notificacion {

    protected String codigo;
    protected Destinatario destinatario;
    protected String mensaje;
    protected LocalDateTime fechaEnvio;
    protected EstadoNotificacion estado;
    protected TipoNotificacion tipo;

    public Notificacion(String codigo, Destinatario destinatario, TipoNotificacion tipo) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.tipo = tipo;
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    public boolean enviar() {
        try {
            prepararEnvio();
            boolean resultado = ejecutarEnvio();
            estado = resultado ? EstadoNotificacion.ENVIADA : EstadoNotificacion.FALLIDA;
            fechaEnvio = LocalDateTime.now();
            registrarLog();
            return resultado;
        } catch (Exception e) {
            estado = EstadoNotificacion.FALLIDA;
            return false;
        }
    }

    protected abstract void prepararEnvio();
    protected abstract boolean ejecutarEnvio();
    protected abstract String getMedioEnvio();

    protected void registrarLog() {
        System.out.println("[" + getMedioEnvio() + "] " + mensaje + " -> " + estado);
    }

    public String getCodigo() { return codigo; }
    public EstadoNotificacion getEstado() { return estado; }
}
