package main.dosw.semana2.pokemon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static int calcularSumaTotalNiveles(List<Integer> niveles) {
        return niveles.stream()
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los niveles de los Pokémon separados por comas o espacios:");
        String linea = scanner.nextLine();

        List<Integer> niveles = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .map(Integer::parseInt)
                .toList();

        int suma = calcularSumaTotalNiveles(niveles);
        System.out.println("Suma total de niveles: " + suma);
    }
}
