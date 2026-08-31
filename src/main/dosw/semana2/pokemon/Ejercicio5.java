package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    public static long contarPokemonNivelSuperiorAOchenta(List<Pokemon> pokemons) {
        return pokemons.stream()
                .filter(p -> p.getNivel() > 80)
                .count();
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

            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(scanner.nextLine().trim());

            pokemons.add(new Pokemon(nombre, nivel));
        }

        long cantidadLegendarios = contarPokemonNivelSuperiorAOchenta(pokemons);
        System.out.println("Pokémon con nivel > 80: " + cantidadLegendarios);
    }
}
