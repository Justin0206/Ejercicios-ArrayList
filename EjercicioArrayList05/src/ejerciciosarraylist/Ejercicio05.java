package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Ingrese cinco nombres:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres.add(entrada.nextLine());
        }

        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = entrada.nextLine();

        if (nombres.contains(nombreBuscado)) {
            System.out.println("El nombre existe en la lista.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }

        entrada.close();
    }
}