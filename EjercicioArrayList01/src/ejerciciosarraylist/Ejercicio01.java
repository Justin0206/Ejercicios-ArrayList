package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        System.out.println("Ingrese elementos. Escriba fin para terminar.");

        while (true) {
            System.out.print("Ingrese un elemento: ");
            String elemento = entrada.nextLine();

            if (elemento.equalsIgnoreCase("fin")) {
                break;
            }

            elementos.add(elemento);
        }

        System.out.println("\nElementos ingresados:");

        for (String elemento : elementos) {
            System.out.println(elemento);
        }

        entrada.close();
    }
}