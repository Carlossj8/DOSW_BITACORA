package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

    public static List<Pokemon> obtenerEquipoElite(List<Pokemon> pokemons) {
        return pokemons.stream()
                .filter(p -> p.getPoderCombate() > 500)
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

            System.out.print("Poder de Combate (PC): ");
            double pc = Double.parseDouble(scanner.nextLine().trim());

            pokemons.add(new Pokemon(nombre, pc));
        }

        List<Pokemon> elite = obtenerEquipoElite(pokemons);
        System.out.println(elite);
    }
}
