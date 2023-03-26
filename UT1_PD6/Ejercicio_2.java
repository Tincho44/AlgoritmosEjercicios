import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        String rutaArchivo = "entrada.txt";
        leerEntradaArchivo(rutaArchivo);
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            int entero = Integer.parseInt(br.readLine());
            float flotante = Float.parseFloat(br.readLine());
            String nombre = br.readLine();

            System.out.println("El entero leído es: " + entero);
            System.out.println("El número de punto flotante es: " + flotante);
            System.out.println("La cadena leída es \"" + nombre + "\"");
            System.out.printf("¡Hola %s! La suma de %d y %.2f es %.2f.%n", nombre, entero, flotante, entero + flotante);
            System.out.printf("La división entera de %.2f y %d es %d y su resto es %.2f.%n", flotante, entero, (int) (flotante / entero), flotante % entero);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
