public class AppEnvio implements CanalEnvio {
    private String token;

    public AppEnvio(String token) {
        this.token = token;
    }

    @Override
    public void enviar(Notificacion n) {
        System.out.println("Notificación APP enviada a " + n.getDestinatario());
        System.out.println("Mensaje: " + n.getMensaje());
    }
}
