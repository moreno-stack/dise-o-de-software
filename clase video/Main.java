 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el idioma del video (ESPAÑOL, INGLÉS, PORTUGUÉS):");
        String idiomaStr = scanner.nextLine().toUpperCase();
        Idioma idioma;
        try {
            idioma = Idioma.valueOf(idiomaStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Idioma inválido. Usando ESPANOL por defecto.");
            idioma = Idioma.ESPAÑOL;
        }

        System.out.println("Ingrese la duración en horas:");
        float duracion = 0;
        try {
            String duracionStr = scanner.nextLine();
            duracion = Float.parseFloat(duracionStr);
        } catch (Exception e) {
            System.out.println("Duración inválida. Usando 0 por defecto.");
        }

        Video video = new Video(idioma, duracion);

        System.out.println("Datos del video:");
        System.out.println(video);

        scanner.close();
    }
}