package main.dosw.semana4.taller4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private String estado;
    private List<NotificationObserver> observadores = new ArrayList<>();

    public Pedido(String id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public void agregarObservador(NotificationObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(NotificationObserver observador) {
        observadores.remove(observador);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        OrderEvent event = new OrderEvent(id, estado);
        notificarObservadores(event);
    }

    private void notificarObservadores(OrderEvent event) {
        for (NotificationObserver observador : observadores) {
            observador.notify(event);
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido("PED-1001", "Pendiente");

        pedido.agregarObservador(new EmailNotifier());
        pedido.agregarObservador(new SmsNotifier());
        pedido.agregarObservador(new PushNotifier());

        System.out.println("--- Cambiando estado a ENVIADO ---");
        pedido.cambiarEstado("Enviado");

        System.out.println("\n--- Cambiando estado a ENTREGADO ---");
        pedido.cambiarEstado("Entregado");
    }
}
