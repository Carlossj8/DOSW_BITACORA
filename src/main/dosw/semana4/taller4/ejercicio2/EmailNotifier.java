package main.dosw.semana4.taller4.ejercicio2;

public class EmailNotifier implements NotificationObserver {
    private MessageFactory messageFactory = new EmailMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message message = messageFactory.build(event);
        System.out.println("Notificacion enviada por Email: " + message.getContenido());
    }
}
