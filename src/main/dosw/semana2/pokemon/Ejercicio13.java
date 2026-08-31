package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio13 {

    public static Map<String, List<String>> agruparPorTipo(List<Pokemon> pokemons) {
        return pokemons.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getTipo(),
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

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine().trim();

            pokemons.add(new Pokemon(nombre, tipo));
        }

        Map<String, List<String>> agrupados = agruparPorTipo(pokemons);
        agrupados.forEach((tipo, lista) -> System.out.println(tipo + ": " + lista));
    }
}
