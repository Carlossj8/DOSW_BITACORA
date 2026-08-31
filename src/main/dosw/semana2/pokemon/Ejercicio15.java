package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio15 {

    public static Optional<Entrenador> encontrarEntrenadorConMasMedallas(List<Entrenador> entrenadores) {
        return entrenadores.stream()
                .max(Comparator.comparingInt(e -> e.getMedallas()));
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

        Optional<Entrenador> campeon = encontrarEntrenadorConMasMedallas(entrenadores);
        campeon.ifPresent(e -> {
            System.out.println("Campeón de gimnasios: " + e.getNombre());
            System.out.println("Medallas obtenidas: " + e.getMedallas());
        });
    }
}
