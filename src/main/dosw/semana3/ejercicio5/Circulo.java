package main.dosw.semana3.ejercicio5;

public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo de color " + color.aplicarColor() + ".");
    }
}
