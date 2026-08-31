package main.dosw.semana4.taller4.ejercicio5;

public class LegacyBankAdapter implements PaymentProcessor {
    private LegacyBankService legacyService;
    private String cuentaDestino;

    public LegacyBankAdapter(LegacyBankService legacyService, String cuentaDestino) {
        this.legacyService = legacyService;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void pay(double amount) {
        int centavos = (int) (amount * 100);
        legacyService.executeTransaction(cuentaDestino, centavos);
    }
}
