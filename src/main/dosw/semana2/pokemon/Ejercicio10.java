package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio10 {

    public static List<String> obtenerNombresPokedexCompacta(List<Pokemon> pokemons) {
        return pokemons.stream()
                .map(Pokemon::getNombre)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos Pokémon desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<Pokemon> pokemons = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Pokémon " + i + ":");
            System.out.print("ID: ");
            String idStr = scanner.nextLine().trim();
            Long id = idStr.isEmpty() ? null : Long.parseLong(idStr);

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine().trim();

            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Poder de Combate (PC): ");
            double pc = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Región: ");
            String region = scanner.nextLine().trim();

            System.out.print("¿Es legendario? (true/false): ");
            boolean legendario = Boolean.parseBoolean(scanner.nextLine().trim());

            pokemons.add(new Pokemon(id, nombre, tipo, nivel, pc, region, legendario));
        }

        List<String> nombres = obtenerNombresPokedexCompacta(pokemons);
        System.out.println(nombres);
    }
}
