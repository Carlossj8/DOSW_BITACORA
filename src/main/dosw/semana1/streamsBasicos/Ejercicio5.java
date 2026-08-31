package main.dosw.semana1.streamsBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    public static boolean existeTransaccionNoAprobada(List<Transaction> transacciones) {
        return transacciones.stream()
                .peek(t -> System.out.println("Procesando transaccion: " + t))
                .anyMatch(t -> !t.isApproved());
    }

    public static boolean esLoteValido(List<Transaction> transacciones) {
        return !existeTransaccionNoAprobada(transacciones);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas transacciones desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<Transaction> transacciones = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Transacción " + i + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();

            System.out.print("Monto: ");
            double amount = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("¿Aprobada? (true/false): ");
            boolean approved = Boolean.parseBoolean(scanner.nextLine().trim());

            transacciones.add(new Transaction(id, amount, approved));
        }

        boolean loteValido = esLoteValido(transacciones);
        System.out.println("¿El lote es válido?: " + loteValido);
    }
}
