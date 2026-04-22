public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String codigo, Destinatario dest, TipoNotificacion tipo) {
        super(codigo, dest, tipo);
    }

    protected void prepararEnvio() {
        mensaje = tipo.getDescripcion();
    }

    protected boolean ejecutarEnvio() {
        System.out.println("Enviando SMS a " + destinatario.getNumeroCelular());
        return true;
    }

    protected String getMedioEnvio() { return "SMS"; }
}
