package main.dosw.semana3.ejercicio5;

public class Cuadrado extends Forma {
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrado de color " + color.aplicarColor() + ".");
    }
}
