package main.dosw.semana4.taller4.ejercicio10;

// Imagen original. Nunca se modifica; los filtros la envuelven por encima.
public class BaseImage implements Image {
    private final String filename;

    public BaseImage(String filename) {
        this.filename = filename;
    }

    @Override
    public String render() {
        return "[" + filename + "]";
    }
}
