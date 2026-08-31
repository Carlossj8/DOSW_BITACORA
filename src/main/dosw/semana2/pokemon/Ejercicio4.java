package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio4 {

    public static Optional<Pokemon> encontrarPokemonAlfa(List<Pokemon> pokemons) {
        return pokemons.stream()
                .max(Comparator.comparingInt(Pokemon::getNivel));
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

        Optional<Pokemon> alfa = encontrarPokemonAlfa(pokemons);
        alfa.ifPresent(p -> System.out.println("Pokémon Alfa: " + p.getNombre() + " (nivel " + p.getNivel() + ")"));
    }
}
