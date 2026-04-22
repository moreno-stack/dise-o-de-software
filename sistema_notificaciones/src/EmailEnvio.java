public class EmailEnvio implements CanalEnvio {
    private String correoExtra;

    public EmailEnvio(String correoExtra) {
        this.correoExtra = correoExtra;
    }

    @Override
    public void enviar(Notificacion n) {
        System.out.println("Enviando EMAIL a " + n.getDestinatario());
        System.out.println("Mensaje: " + n.getMensaje());
    }
}
