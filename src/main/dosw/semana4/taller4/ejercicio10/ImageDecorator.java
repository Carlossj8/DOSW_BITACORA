package main.dosw.semana4.taller4.ejercicio10;

// Decorador abstracto: envuelve una Image y delega render() a ella.
// Todas las subclases solo necesitan agregar su propio comportamiento.
public abstract class ImageDecorator implements Image {
    protected final Image wrapped;

    public ImageDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }
}
