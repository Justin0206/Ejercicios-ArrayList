package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Mostrar elementos");
            System.out.println("3. Eliminar elemento por indice");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el elemento: ");
                    String elemento = entrada.nextLine();
                    elementos.add(elemento);
                    System.out.println("Elemento agregado correctamente.");
                    break;

                case 2:
                    if (elementos.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("\nElementos almacenados:");

                        for (int i = 0; i < elementos.size(); i++) {
                            System.out.println(i + ". " + elementos.get(i));
                        }
                    }
                    break;

                case 3:
                    if (elementos.isEmpty()) {
                        System.out.println("No hay elementos para eliminar.");
                    } else {
                        System.out.println("\nElementos almacenados:");

                        for (int i = 0; i < elementos.size(); i++) {
                            System.out.println(i + ". " + elementos.get(i));
                        }

                        System.out.print("Ingrese el indice que desea eliminar: ");
                        int indice = Integer.parseInt(entrada.nextLine());

                        if (indice >= 0 && indice < elementos.size()) {
                            String eliminado = elementos.remove(indice);
                            System.out.println("Elemento eliminado: " + eliminado);
                        } else {
                            System.out.println("Indice no valido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}