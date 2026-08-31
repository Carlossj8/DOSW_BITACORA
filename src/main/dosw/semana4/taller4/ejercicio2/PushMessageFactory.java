package main.dosw.semana4.taller4.ejercicio2;

public class PushMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("{\"orderId\": \"" + event.getOrderId() + "\", \"status\": \"" + event.getEstado() + "\"}");
    }
}
