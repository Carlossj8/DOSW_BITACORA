package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio17 {

    public static Optional<Entrenador> obtenerEntrenadorMasPoderoso(List<Entrenador> entrenadores) {
        return entrenadores.stream()
                .max(Comparator.comparingDouble(e -> e.calcularPoderTotalEquipo()));
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

            System.out.println("Ingrese los valores de PC de su equipo separados por comas o espacios:");
            String lineaPc = scanner.nextLine();

            List<Pokemon> equipo = Arrays.stream(lineaPc.split("[,\\s]+"))
                    .filter(s -> !s.isBlank())
                    .map(s -> new Pokemon("Pokemon", Double.parseDouble(s)))
                    .toList();

            entrenadores.add(new Entrenador(nombre, equipo));
        }

        Optional<Entrenador> masPoderoso = obtenerEntrenadorMasPoderoso(entrenadores);
        masPoderoso.ifPresent(e -> {
            long totalEntero = (long) e.calcularPoderTotalEquipo();
            String totalStr = (e.calcularPoderTotalEquipo() == totalEntero) ? String.valueOf(totalEntero) : String.valueOf(e.calcularPoderTotalEquipo());
            System.out.println("Entrenador más poderoso: " + e.getNombre());
            System.out.println("Poder acumulado del equipo: " + totalStr);
        });
    }
}
