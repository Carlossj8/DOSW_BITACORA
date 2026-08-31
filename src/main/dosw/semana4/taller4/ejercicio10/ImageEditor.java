package main.dosw.semana4.taller4.ejercicio10;

import java.util.ArrayDeque;
import java.util.Deque;

// Receptor del patron Command. Administra la imagen activa y los dos stacks
// de historial: uno para deshacer (executed) y otro para rehacer (undone).
public class ImageEditor {
    private Image currentImage;
    private final Deque<ImageCommand> executed = new ArrayDeque<>();
    private final Deque<ImageCommand> undone   = new ArrayDeque<>();

    public ImageEditor(Image base) {
        this.currentImage = base;
    }

    public void apply(ImageCommand command) {
        command.execute();
        executed.push(command);
        undone.clear(); // nuevo comando invalida el historial de rehacer
    }

    public void undo() {
        if (executed.isEmpty()) {
            System.out.println("[Editor] No hay nada que deshacer.");
            return;
        }
        ImageCommand command = executed.pop();
        command.undo();
        undone.push(command);
    }

    public void redo() {
        if (undone.isEmpty()) {
            System.out.println("[Editor] No hay nada que rehacer.");
            return;
        }
        ImageCommand command = undone.pop();
        command.execute();
        executed.push(command);
    }

    public Image getCurrentImage() { return currentImage; }

    public void setCurrentImage(Image image) { this.currentImage = image; }

    public void printState() {
        System.out.println("Estado actual: " + currentImage.render());
    }
}
