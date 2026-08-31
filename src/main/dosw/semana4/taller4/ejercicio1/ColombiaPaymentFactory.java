package main.dosw.semana4.taller4.ejercicio1;

public class ColombiaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toLowerCase()) {
            case "pse":    return new PseStrategy();
            case "nequi":  return new NequiStrategy();
            default:       return new TarjetaStrategy();
        }
    }
}
