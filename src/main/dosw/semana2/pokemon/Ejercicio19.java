package main.dosw.semana2.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio19 {

    public static List<Entrenador> obtenerTop3Entrenadores(List<Entrenador> entrenadores) {
        Comparator<Entrenador> comparador = Comparator
                .comparingInt(Entrenador::getMedallas).reversed()
                .thenComparing(Comparator.comparingDouble(Entrenador::calcularPoderTotalEquipo).reversed())
                .thenComparing(Entrenador::getNombre);

        return entrenadores.stream()
                .sorted(comparador)
                .limit(3)
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos entrenadores desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<Entrenador> entrenadores = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Entrenador " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();

            System.out.print("Medallas: ");
            int medallas = Integer.parseInt(scanner.nextLine().trim());

            System.out.println("Ingrese los valores de PC de su equipo separados por comas o espacios:");
            String lineaPc = scanner.nextLine();

            List<Pokemon> equipo = Arrays.stream(lineaPc.split("[,\\s]+"))
                    .filter(s -> !s.isBlank())
                    .map(s -> new Pokemon("Pokemon", Double.parseDouble(s)))
                    .toList();

            entrenadores.add(new Entrenador(nombre, medallas, equipo));
        }

        List<Entrenador> top3 = obtenerTop3Entrenadores(entrenadores);
        for (int i = 0; i < top3.size(); i++) {
            Entrenador e = top3.get(i);
            long pcEntero = (long) e.calcularPoderTotalEquipo();
            String pcStr = (e.calcularPoderTotalEquipo() == pcEntero) ? String.valueOf(pcEntero)
                    : String.valueOf(e.calcularPoderTotalEquipo());
            System.out
                    .println("#" + (i + 1) + " " + e.getNombre() + " - " + e.getMedallas() + " medallas, PC: " + pcStr);
        }
    }
}
