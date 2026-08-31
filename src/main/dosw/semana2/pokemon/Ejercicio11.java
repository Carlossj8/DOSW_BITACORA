package main.dosw.semana2.pokemon;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

    public static double calcularPoderCombatePromedio(List<Double> pcs) {
        return pcs.stream()
                .mapToDouble(pc -> pc)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores de poder de combate (PC) separados por comas o espacios:");
        String linea = scanner.nextLine();

        List<Double> pcs = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .map(s -> Double.parseDouble(s))
                .toList();

        double promedio = calcularPoderCombatePromedio(pcs);
        System.out.printf(Locale.US, "Poder de combate promedio: %.2f%n", promedio);
    }
}
