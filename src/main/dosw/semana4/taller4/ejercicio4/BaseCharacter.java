package main.dosw.semana4.taller4.ejercicio4;

public class BaseCharacter implements GameCharacter {
    private String nombre;
    private String armadura;
    private String arma;
    private String habilidad;

    public BaseCharacter(String nombre, String armadura, String arma, String habilidad) {
        this.nombre = nombre;
        this.armadura = armadura;
        this.arma = arma;
        this.habilidad = habilidad;
    }

    @Override
    public void attack() {
        System.out.println(nombre + " ataca con " + arma + " [Armadura: " + armadura + ", Habilidad: " + habilidad + "]");
    }
}
