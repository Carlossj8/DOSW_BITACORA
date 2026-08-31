package main.dosw.semana4.taller4.ejercicio2;

public interface MessageFactory {
    Message build(OrderEvent event);
}
