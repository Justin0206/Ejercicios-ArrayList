package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> pendientes = new ArrayList<>();
        ArrayList<String> completadas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\nCONTROL DE ACTIVIDADES");
            System.out.println("1. Agregar actividad");
            System.out.println("2. Mostrar actividades pendientes");
            System.out.println("3. Marcar actividad como completada");
            System.out.println("4. Mostrar actividades completadas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la actividad: ");
                    String actividad = entrada.nextLine();
                    pendientes.add(actividad);
                    System.out.println("Actividad agregada correctamente.");
                    break;

                case 2:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay actividades pendientes.");
                    } else {
                        System.out.println("\nACTIVIDADES PENDIENTES:");

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println((i + 1) + ". " + pendientes.get(i));
                        }
                    }
                    break;

                case 3:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay actividades para completar.");
                    } else {
                        System.out.println("\nACTIVIDADES PENDIENTES:");

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println((i + 1) + ". " + pendientes.get(i));
                        }

                        System.out.print("Ingrese el número de la actividad completada: ");
                        int posicion = Integer.parseInt(entrada.nextLine()) - 1;

                        if (posicion >= 0 && posicion < pendientes.size()) {
                            String tareaCompletada = pendientes.remove(posicion);
                            completadas.add(tareaCompletada);
                            System.out.println("Actividad marcada como completada.");
                        } else {
                            System.out.println("Número de actividad inválido.");
                        }
                    }
                    break;

                case 4:
                    if (completadas.isEmpty()) {
                        System.out.println("No hay actividades completadas.");
                    } else {
                        System.out.println("\nACTIVIDADES COMPLETADAS:");

                        for (String actividadCompletada : completadas) {
                            System.out.println("- " + actividadCompletada);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}