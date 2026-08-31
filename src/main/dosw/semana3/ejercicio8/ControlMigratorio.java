package main.dosw.semana3.ejercicio8;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}
