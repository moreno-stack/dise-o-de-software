public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo, String codigo, String destinatario, String mensaje, CanalEnvio canal) {

        switch (tipo) {
            case "CALIFICACION":
                return new NotifCalificaciones(codigo, destinatario, mensaje, canal);
            case "PAGO":
                return new NotifPago(codigo, destinatario, mensaje, canal);
            case "CANCELACION":
                return new NotifCancelacion(codigo, destinatario, mensaje, canal);
            case "EVENTO":
                return new NotifEvento(codigo, destinatario, mensaje, canal);
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
