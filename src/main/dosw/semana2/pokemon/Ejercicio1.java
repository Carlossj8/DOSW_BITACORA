package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static List<String> obtenerPokemonTipoFuego(List<Pokemon> pokemons) {
        return pokemons.stream()
                .filter(p -> "Fuego".equalsIgnoreCase(p.getTipo()))
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

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine().trim();

            pokemons.add(new Pokemon(nombre, tipo));
        }

        List<String> tipoFuego = obtenerPokemonTipoFuego(pokemons);
        System.out.println(tipoFuego);
    }
}
