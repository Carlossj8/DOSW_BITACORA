package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RetoMewtwo {

    public static void calcularReportePoderPorTipo(List<Pokemon> pokemons) {
        Map<String, List<Double>> poderesPorTipo = pokemons.stream()
                .filter(p -> p.getNivel() >= 50)
                .map(p -> new Pokemon(p.getNombre(), p.getTipo().toUpperCase(), p.getNivel(), p.getPoderCombate()))
                .collect(Collectors.groupingBy(
                        p -> p.getTipo(),
                        Collectors.mapping(p -> p.getPoderCombate(), Collectors.toList())
                ));

        poderesPorTipo.entrySet().stream()
                .map(entry -> Map.entry(
                        entry.getKey(),
                        entry.getValue().stream().reduce(0.0, (a, b) -> a + b)
                ))
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> {
                    long totalEntero = entry.getValue().longValue();
                    String totalStr = (entry.getValue() == totalEntero) ? String.valueOf(totalEntero) : String.valueOf(entry.getValue());
                    System.out.println(entry.getKey() + " -> Poder acumulado: " + totalStr);
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

            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Poder de Combate (PC): ");
            double pc = Double.parseDouble(scanner.nextLine().trim());

            pokemons.add(new Pokemon(nombre, tipo, nivel, pc));
        }

        calcularReportePoderPorTipo(pokemons);
    }
}
