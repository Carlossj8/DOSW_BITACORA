package main.dosw.semana4.taller4.ejercicio8;

public class KitchenService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Cocina] Preparando pedido: " + order.getSummary());
    }
}
