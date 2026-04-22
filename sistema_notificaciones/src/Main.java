public class Main {
    public static void main(String[] args) {

        CanalEnvio canal = new EmailEnvio("soporte@uni.edu");

        Notificacion notif = NotificacionFactory.crearNotificacion(
                "CALIFICACION",
                "001",
                "estudiante@correo.com",
                "Tus notas han sido publicadas",
                canal
        );

        notif.enviar();
    }
}
