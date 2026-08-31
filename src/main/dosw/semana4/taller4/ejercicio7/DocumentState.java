package main.dosw.semana4.taller4.ejercicio7;

public interface DocumentState {
    void approve(Document doc);
    void reject(Document doc);
    String getNombreEstado();
}
