package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("Cuantos nombres desea ingresar: ");
        int cantidad = Integer.parseInt(entrada.nextLine());

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre " + i + ": ");
            nombres.add(entrada.nextLine());
        }

        System.out.println("\nNombres almacenados:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        entrada.close();
    }
}