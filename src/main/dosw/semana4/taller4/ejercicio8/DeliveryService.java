package main.dosw.semana4.taller4.ejercicio8;

public class DeliveryService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Domicilios] Asignando repartidor y optimizando ruta de entrega.");
    }
}
