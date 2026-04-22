public class SMSEnvio implements CanalEnvio {
    private String numero;

    public SMSEnvio(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(Notificacion n) {
        System.out.println("Enviando SMS a " + numero);
        System.out.println("Mensaje: " + n.getMensaje());
    }
}
