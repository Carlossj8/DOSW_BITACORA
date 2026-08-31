package main.dosw.semana4.taller4.ejercicio1;

public interface PaymentFactory {
    PaymentStrategy create(String type);
}
