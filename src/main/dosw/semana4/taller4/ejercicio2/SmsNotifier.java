package main.dosw.semana4.taller4.ejercicio2;

public class SmsNotifier implements NotificationObserver {
    private MessageFactory messageFactory = new SmsMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message message = messageFactory.build(event);
        System.out.println("Notificacion enviada por SMS: " + message.getContenido());
    }
}
