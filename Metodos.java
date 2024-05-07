/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication38;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Metodos {

    Scanner entrada;
    File archivo;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.archivo = new File("Aula.txt");
    }

    public int numEst() {
        System.out.println("Cuantos estudiantes va a ingresar");
        return entrada.nextInt();
    }

    public void escribir() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre;
        double calculoP, programacionP, logicaP;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        entrada.nextLine();
        System.out.println("Ingrese su nombre:    ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese notas para Calculo");
        calculoP = promedio();
        System.out.println("Ingrese notas para Programacion");
        programacionP = promedio();
        System.out.println("Ingrese notas para Logica");
        logicaP = promedio();
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.printf("%s\n%s\n%s\n%s\n", nombre, Double.toString(calculoP),
                     Double.toString(programacionP)
                    ,Double.toString(logicaP));
            linea.close();

        } catch (Exception e) {
        }
    }

    public double promedio() {
        double n1, n2, n3;
        System.out.println("Ingrese nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        n3 = entrada.nextDouble();
        return (n1 + n2 + n3) / 3;
    }

    

    // Arreglos
    public void traer(int n) {
        String[] arreglo = new String[n];
        double[] arregloC = new double[n];
        double[] arregloP = new double[n];
        double[] arregloL = new double[n];
        FileReader leer;
        BufferedReader almacenamiento;
        String nombre = "", cadena = "", id = "",
                calculoP = "", programacionP = "", logicaP = "";
        try {
            int i = 0;
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                nombre = cadena;
                cadena = almacenamiento.readLine();
                calculoP = cadena;
                cadena = almacenamiento.readLine();
                programacionP = cadena;
                cadena = almacenamiento.readLine();
                logicaP = cadena;

                if (cadena != null) {

                        arreglo[i] = String.format("%s", nombre);
                        arregloC[i] = Double.parseDouble(calculoP);
                        arregloP[i] = Double.parseDouble(programacionP);
                        arregloL[i] = Double.parseDouble(logicaP);
                    i++;
                }
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }

        String aprobadoCalculo = "Los estudiantes que aprobaron calculo son:";
        String aprobadoProgramacion = "Los estudiantes que aprobaron "
                + "Programacion son:";
        String aprobadoLogica = "Los estudiantes que aprobaron Logica son:";
        for (int i = 0; i < arregloP.length; i++) {
            System.out.println(arregloP[i]);
        }
        for (int i = 0; i < arreglo.length; i++) {

            if (arregloC[i] >= 7) {
                aprobadoCalculo = String.format("%s\nEl estudainte "
                        + "%s con promedio de %.2f",
                         aprobadoCalculo, arreglo[i], arregloC[i]);
            }
            if (arregloP[i] >= 7) {
                aprobadoProgramacion = String.format("%s\nEl estudainte "
                        + "%s con promedio de %.2f",
                         aprobadoProgramacion, arreglo[i], arregloP[i]);
            }
            if (arregloL[i] >= 7) {
                aprobadoLogica = String.format("%s\nEl estudainte "
                        + "%s con promedio de %.2f",
                         aprobadoLogica, arreglo[i], arregloL[i]);
            }
        }
        System.out.printf("%s\n%s\n%s\n", aprobadoCalculo,
                 aprobadoProgramacion, aprobadoLogica);
    }
}
