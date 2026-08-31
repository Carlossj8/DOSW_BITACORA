package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

    public static List<String> obtenerPokemonListosParaEvolucionar(List<Pokemon> pokemons) {
        return pokemons.stream()
                .filter(Pokemon::isPuedeEvolucionar)
                .map(Pokemon::getNombre)
                .toList();
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

            System.out.print("¿Puede evolucionar? (true/false): ");
            boolean puedeEvolucionar = Boolean.parseBoolean(scanner.nextLine().trim());

            pokemons.add(new Pokemon(nombre, puedeEvolucionar));
        }

        List<String> listos = obtenerPokemonListosParaEvolucionar(pokemons);
        System.out.println(listos);
    }
}
