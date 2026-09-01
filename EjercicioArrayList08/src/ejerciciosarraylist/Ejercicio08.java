package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = entrada.nextInt();

            numeros.add(numero);

            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        System.out.println("\nTodos los números:");
        System.out.println(numeros);

        if (numerosPares.isEmpty()) {
            System.out.println("No se ingresaron números pares.");
        } else {
            System.out.println("Números pares:");
            System.out.println(numerosPares);
        }

        entrada.close();
    }
}