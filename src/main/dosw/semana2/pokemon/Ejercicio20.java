package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio20 {

    public static void analizarPokedex(List<Pokemon> pokemons) {
        Map<String, Long> porTipo = pokemons.stream()
                .collect(Collectors.groupingBy(p -> p.getTipo(), Collectors.counting()));

        Map<String, Long> porRegion = pokemons.stream()
                .collect(Collectors.groupingBy(p -> p.getRegion(), Collectors.counting()));

        long legendarios = pokemons.stream()
                .filter(p -> p.isLegendario())
                .count();

        double promedioNivel = pokemons.stream()
                .mapToInt(p -> p.getNivel())
                .average()
                .orElse(0.0);

        Optional<Pokemon> masFuerte = pokemons.stream()
                .max(Comparator.comparingDouble(p -> p.getPoderCombate()));

        System.out.println("Por tipo:     " + porTipo);
        System.out.println("Por región:   " + porRegion);
        System.out.println("Legendarios:  " + legendarios);
        System.out.printf(Locale.US, "Promedio niv: %.1f%n", promedioNivel);
        masFuerte.ifPresent(p -> {
            long pcEntero = (long) p.getPoderCombate();
            String pcStr = (p.getPoderCombate() == pcEntero) ? String.valueOf(pcEntero) : String.valueOf(p.getPoderCombate());
            System.out.println("Más fuerte:   " + p.getNombre() + " (PC: " + pcStr + ")");
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos Pokémon desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<Pokemon> pokemons = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Pokémon " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine().trim();

            System.out.print("Región: ");
            String region = scanner.nextLine().trim();

            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Poder de Combate (PC): ");
            double pc = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("¿Es legendario? (true/false): ");
            boolean legendario = Boolean.parseBoolean(scanner.nextLine().trim());

            pokemons.add(new Pokemon(nombre, tipo, nivel, pc, region, legendario));
        }

        analizarPokedex(pokemons);
    }
}
