public class Main {
    public static void main(String[] args) {

        Destinatario d = new Destinatario("1","Juan","juan@mail.com","300123","token123");
        System.out.println("Destinatario creado: " + d.getNombre() + " - " + d.getCorreoElectronico());

        GestorNotificaciones gestor = new GestorNotificaciones();
        System.out.println("Gestor de Notificaciones creado.");

        Notificacion n = NotificacionFactory.crearCorreo(
                gestor.generarCodigo("NOT"),
                d,
                TipoNotificacion.PUBLICACION_CALIFICACIONES
        );
        System.out.println("Notificación creada: Código " + n.getCodigo() + " - Tipo: " + n.getEstado());

        boolean resultado = gestor.enviarYRegistrar(n);
        System.out.println("Resultado del envío: " + resultado);
    }
}
