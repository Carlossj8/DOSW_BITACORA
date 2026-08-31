package main.dosw.semana4.taller4.ejercicio8;

public class BillingService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Facturacion] Generando cuenta electronica para el pedido.");
    }
}
