package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio16 {

    public static List<Entrenador> obtenerEntrenadoresExperimentados(List<Entrenador> entrenadores) {
        return entrenadores.stream()
                .filter(Entrenador::esExperimentado)
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos entrenadores desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<Entrenador> entrenadores = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Entrenador " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();

            System.out.print("Medallas: ");
            int medallas = Integer.parseInt(scanner.nextLine().trim());

            entrenadores.add(new Entrenador(nombre, medallas));
        }

        List<Entrenador> experimentados = obtenerEntrenadoresExperimentados(entrenadores);
        System.out.println(experimentados);
    }
}
