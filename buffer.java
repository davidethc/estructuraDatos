import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivos {

    public static void main(String[] args) {
        try {
            // Crear un FileReader para leer un archivo de texto
            FileReader lector = new FileReader("archivo_entrada.txt");
            // Crear un FileWriter para escribir en un archivo de texto
            FileWriter escritor = new FileWriter("archivo_salida.txt");

            // Leer y escribir caracteres uno por uno
            int caracter;
            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter);
            }

            // Cerrar los flujos
            lector.close();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
