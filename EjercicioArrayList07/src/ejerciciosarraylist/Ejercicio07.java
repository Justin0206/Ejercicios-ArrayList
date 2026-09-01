package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidad = entrada.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            double calificacion = entrada.nextDouble();

            calificaciones.add(calificacion);
            suma += calificacion;
        }

        if (calificaciones.isEmpty()) {
            System.out.println("No se ingresaron calificaciones.");
        } else {
            double promedio = suma / calificaciones.size();

            System.out.println("\nCalificaciones ingresadas:");

            for (double calificacion : calificaciones) {
                System.out.println(calificacion);
            }

            System.out.println("Promedio de las calificaciones: " + promedio);
        }

        entrada.close();
    }
}