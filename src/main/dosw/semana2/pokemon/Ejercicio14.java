package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio14 {

    public static Map<String, List<String>> agruparPorRegion(List<Pokemon> pokemons) {
        return pokemons.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getRegion(),
                        LinkedHashMap::new,
                        Collectors.mapping(p -> p.getNombre(), Collectors.toList())
                ));
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

            System.out.print("Región: ");
            String region = scanner.nextLine().trim();

            pokemons.add(new Pokemon(nombre, "", region));
        }

        Map<String, List<String>> agrupados = agruparPorRegion(pokemons);
        agrupados.forEach((region, lista) -> System.out.println(region + ": " + lista));
    }
}
