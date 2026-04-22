public class NotificacionCorreo extends Notificacion {

    public NotificacionCorreo(String codigo, Destinatario dest, TipoNotificacion tipo) {
        super(codigo, dest, tipo);
    }

    protected void prepararEnvio() {
        mensaje = tipo.getDescripcion() + " para " + destinatario.getNombre();
    }

    protected boolean ejecutarEnvio() {
        System.out.println("Enviando EMAIL a " + destinatario.getCorreoElectronico());
        return true;
    }

    protected String getMedioEnvio() { return "EMAIL"; }
}
