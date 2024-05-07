import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivosConBuffer {

    public static void main(String[] args) {
        try {
            // Crear un BufferedReader para leer un archivo de texto
            BufferedReader lector = new BufferedReader(new FileReader("archivo_entrada.txt"));
            // Crear un BufferedWriter para escribir en un archivo de texto
            BufferedWriter escritor = new BufferedWriter(new FileWriter("archivo_salida.txt"));

            // Leer y escribir líneas completas
            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine(); // Agregar un salto de línea
            }

            // Cerrar los flujos
            lector.close();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
