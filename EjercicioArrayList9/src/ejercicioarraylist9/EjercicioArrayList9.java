package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidad = Integer.parseInt(entrada.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEmpleado " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el salario: ");
            double salario = Double.parseDouble(entrada.nextLine());

            empleados.add(new Empleado(nombre, salario));
        }

        double sumaSalarios = 0;

        System.out.println("\nLISTA DE EMPLEADOS:");

        for (Empleado empleado : empleados) {
            System.out.println(
                "Nombre: " + empleado.getNombre()
                + " | Salario: " + empleado.getSalario()
            );

            sumaSalarios += empleado.getSalario();
        }

        if (empleados.isEmpty()) {
            System.out.println("No se ingresaron empleados.");
        } else {
            double promedio = sumaSalarios / empleados.size();
            System.out.println("\nPromedio de salarios: " + promedio);
        }

        entrada.close();
    }
}