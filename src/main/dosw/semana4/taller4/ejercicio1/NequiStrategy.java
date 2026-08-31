package main.dosw.semana4.taller4.ejercicio1;

public class NequiStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con Nequi: $" + amount);
    }
}
