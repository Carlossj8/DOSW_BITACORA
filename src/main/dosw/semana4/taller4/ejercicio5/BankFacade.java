package main.dosw.semana4.taller4.ejercicio5;

public class BankFacade {
    private LegacyBankService legacyService;
    private PaymentProcessor adapter;

    public BankFacade(String cuentaDestino) {
        this.legacyService = new LegacyBankService();
        this.adapter = new LegacyBankAdapter(legacyService, cuentaDestino);
    }

    public void procesarPago(double monto) {
        System.out.println("--- Iniciando proceso simplificado mediante Facade ---");
        legacyService.openConnection();
        legacyService.authenticate("KEY-8839-LEGACY");
        legacyService.initializeSession();

        int centavos = (int) (monto * 100);
        if (legacyService.verifyBalance("ACC-COL-990", centavos)) {
            adapter.pay(monto);
        }

        legacyService.closeConnection();
        System.out.println("--- Transaccion completada con exito ---\n");
    }

    public static void main(String[] args) {
        BankFacade facade = new BankFacade("ACC-COL-990");
        facade.procesarPago(250.75);
    }
}
