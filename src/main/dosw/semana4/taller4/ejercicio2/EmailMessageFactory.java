package main.dosw.semana4.taller4.ejercicio2;

public class EmailMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("<html><body>Pedido " + event.getOrderId() + " cambio a " + event.getEstado() + "</body></html>");
    }
}
