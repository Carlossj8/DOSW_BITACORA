package main.dosw.semana1.streamsBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    public static List<String> obtenerNombresMayoresDeEdad(List<User> usuarios) {
        return usuarios.stream()
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos usuarios desea ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine().trim());

        List<User> users = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Usuario " + i + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();

            System.out.print("Nombre: ");
            String name = scanner.nextLine().trim();

            System.out.print("Edad: ");
            int age = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("¿Está activo? (true/false): ");
            boolean active = Boolean.parseBoolean(scanner.nextLine().trim());

            users.add(new User(id, name, age, active));
        }

        List<String> mayoresDeEdad = obtenerNombresMayoresDeEdad(users);
        System.out.println(mayoresDeEdad);
    }
}
