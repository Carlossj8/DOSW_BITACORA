package main.dosw.semana4.taller4.ejercicio1;

public class Checkout {
    private PaymentStrategy strategy;

    public Checkout(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.process(amount);
    }

    public static void main(String[] args) {
        String pais = "colombia";
        String tipo = "nequi";
        double monto = 150000;

        PaymentFactory factory = pais.equals("colombia")
                ? new ColombiaPaymentFactory()
                : new UsaPaymentFactory();

        PaymentStrategy strategy = factory.create(tipo);
        Checkout checkout = new Checkout(strategy);
        checkout.pay(monto);
    }
}
