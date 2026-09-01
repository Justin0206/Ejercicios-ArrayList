package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 10 números enteros.");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            numeros.add(entrada.nextInt());
        }

        System.out.println("\nNúmeros almacenados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        entrada.close();
    }
}