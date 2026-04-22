public class NotificacionFactory {

    public static NotificacionCorreo crearCorreo(String codigo, Destinatario dest, TipoNotificacion tipo) {
        return new NotificacionCorreo(codigo, dest, tipo);
    }

    public static NotificacionSMS crearSMS(String codigo, Destinatario dest, TipoNotificacion tipo) {
        return new NotificacionSMS(codigo, dest, tipo);
    }

    public static NotificacionMovil crearMovil(String codigo, Destinatario dest, TipoNotificacion tipo) {
        return new NotificacionMovil(codigo, dest, tipo);
    }
}
