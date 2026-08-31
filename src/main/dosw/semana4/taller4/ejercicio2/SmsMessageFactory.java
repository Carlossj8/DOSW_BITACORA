package main.dosw.semana4.taller4.ejercicio2;

public class SmsMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("SMS: Pedido " + event.getOrderId() + " nuevo estado: " + event.getEstado());
    }
}
