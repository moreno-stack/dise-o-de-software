public enum TipoNotificacion {
    PUBLICACION_CALIFICACIONES,
    RECORDATORIO_PAGO,
    CANCELACION_CLASE,
    CONFIRMACION_INSCRIPCION;

    public String getDescripcion() {
        switch (this) {
            case PUBLICACION_CALIFICACIONES: return "Publicación de calificaciones";
            case RECORDATORIO_PAGO: return "Recordatorio de pago";
            case CANCELACION_CLASE: return "Cancelación de clase";
            case CONFIRMACION_INSCRIPCION: return "Confirmación de inscripción";
            default: return "";
        }
    }
}
