package main.dosw.semana2.pokemon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static List<String> transformarNombresAMayusculas(List<String> nombres) {
        return nombres.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los Pokémon separados por comas o espacios:");
        String linea = scanner.nextLine();

        List<String> nombres = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .toList();

        List<String> mayusculas = transformarNombresAMayusculas(nombres);
        System.out.println(String.join(", ", mayusculas));
    }
}
