package main.dosw.semana4.taller4.ejercicio10;

public class GrayscaleDecorator extends ImageDecorator {
    public GrayscaleDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() { return "Grayscale(" + wrapped.render() + ")"; }
}
