package main.dosw.semana4.taller4.ejercicio10;

// Contrato del patron Command.
// Cada operacion del usuario se encapsula como un objeto con execute y undo.
public interface ImageCommand {
    void execute();
    void undo();
}
