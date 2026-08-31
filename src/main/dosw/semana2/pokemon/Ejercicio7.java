package main.dosw.semana2.pokemon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static List<String> ordenarAlfabeticamente(List<String> nombres) {
        return nombres.stream()
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los Pokémon separados por comas o espacios:");
        String linea = scanner.nextLine();

        List<String> nombres = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .toList();

        List<String> ordenados = ordenarAlfabeticamente(nombres);
        System.out.println(ordenados);
    }
}
