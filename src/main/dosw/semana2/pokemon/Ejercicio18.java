package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio18 {

    public static List<Pokemon> obtenerTop5Pokemon(List<Pokemon> pokemons) {
        return pokemons.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPoderCombate(), p1.getPoderCombate()))
                .limit(5)
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

        List<Pokemon> top5 = obtenerTop5Pokemon(pokemons);
        for (int i = 0; i < top5.size(); i++) {
            Pokemon p = top5.get(i);
            long pcEntero = (long) p.getPoderCombate();
            String pcStr = (p.getPoderCombate() == pcEntero) ? String.valueOf(pcEntero) : String.valueOf(p.getPoderCombate());
            System.out.println("#" + (i + 1) + " " + p.getNombre() + " – PC: " + pcStr);
        }
    }
}
