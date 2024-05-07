package com.mycompany.archivos;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class archivoo {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Secreo");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
        public static void crearArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Secreo");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
}
