package main.dosw.semana4.taller4.ejercicio2;

public class PushNotifier implements NotificationObserver {
    private MessageFactory messageFactory = new PushMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message message = messageFactory.build(event);
        System.out.println("Notificacion enviada por Push: " + message.getContenido());
    }
}
