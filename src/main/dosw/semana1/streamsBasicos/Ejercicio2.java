package main.dosw.semana1.streamsBasicos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static List<String> procesarPalabras(List<String> palabras) {
        return palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }

    public static long contarPalabras(List<String> palabras) {
        return palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las palabras separadas por comas o espacios:");
        String linea = scanner.nextLine();

        List<String> entrada = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .toList();

        long cantidad = contarPalabras(entrada);
        System.out.println("Cantidad de palabras resultantes: " + cantidad);
    }
}
