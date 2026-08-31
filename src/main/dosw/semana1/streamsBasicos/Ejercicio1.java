package main.dosw.semana1.streamsBasicos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static List<Integer> obtenerParesMayoresADiez(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los números separados por comas o espacios:");
        String linea = scanner.nextLine();

        List<Integer> entrada = Arrays.stream(linea.split("[,\\s]+"))
                .filter(s -> !s.isBlank())
                .map(Integer::parseInt)
                .toList();

        List<Integer> resultado = obtenerParesMayoresADiez(entrada);
        System.out.println(resultado);
    }
}
