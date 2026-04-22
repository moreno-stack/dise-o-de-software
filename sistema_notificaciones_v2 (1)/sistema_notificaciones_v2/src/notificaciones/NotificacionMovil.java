public class NotificacionMovil extends Notificacion {

    public NotificacionMovil(String codigo, Destinatario dest, TipoNotificacion tipo) {
        super(codigo, dest, tipo);
    }

    protected void prepararEnvio() {
        mensaje = tipo.getDescripcion();
    }

    protected boolean ejecutarEnvio() {
        System.out.println("Push enviada a token: " + destinatario.getTokenMovil());
        return true;
    }

    protected String getMedioEnvio() { return "APP"; }
}
