package main.dosw.semana4.taller4.ejercicio1;

public class UsaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toLowerCase()) {
            case "stripe":  return new StripeStrategy();
            default:        return new PaypalStrategy();
        }
    }
}
