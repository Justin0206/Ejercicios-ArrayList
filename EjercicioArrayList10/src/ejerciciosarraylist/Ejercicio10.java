package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = aleatorio.nextInt(100) + 1;
            numeros.add(numero);
        }

        System.out.println("20 números aleatorios almacenados:");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println((i + 1) + ". " + numeros.get(i));
        }
    }
}