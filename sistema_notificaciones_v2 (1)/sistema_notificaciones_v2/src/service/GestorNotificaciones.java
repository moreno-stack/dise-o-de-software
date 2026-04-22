import java.util.*;

public class GestorNotificaciones {

    private List<Notificacion> historial = new ArrayList<>();
    private int contadorCodigos = 1;

    public String generarCodigo(String prefijo) {
        return prefijo + "-" + (contadorCodigos++);
    }

    public void registrar(Notificacion n) {
        historial.add(n);
    }

    public boolean enviarYRegistrar(Notificacion n) {
        boolean enviado = n.enviar();
        registrar(n);
        return enviado;
    }
}
