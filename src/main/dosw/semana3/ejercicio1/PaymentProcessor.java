package main.dosw.semana3.ejercicio1;

public abstract class PaymentProcessor {
    protected abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}