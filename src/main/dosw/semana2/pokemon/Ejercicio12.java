package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio12 {

    public static Optional<Pokemon> obtenerCampeonRegional(List<Pokemon> pokemons) {
        return pokemons.stream()
                .max(Comparator.comparingDouble(p -> p.getPoderCombate()));
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

        Optional<Pokemon> campeon = obtenerCampeonRegional(pokemons);
        campeon.ifPresent(p -> {
            long pcEntero = (long) p.getPoderCombate();
            String pcStr = (p.getPoderCombate() == pcEntero) ? String.valueOf(pcEntero) : String.valueOf(p.getPoderCombate());
            System.out.println("Campeón: " + p.getNombre() + " con PC: " + pcStr);
        });
    }
}
