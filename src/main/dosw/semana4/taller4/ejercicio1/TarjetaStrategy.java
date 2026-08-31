package main.dosw.semana4.taller4.ejercicio1;

public class TarjetaStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con Tarjeta: $" + amount);
    }
}
