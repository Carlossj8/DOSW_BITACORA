package main.dosw.semana4.taller4.ejercicio10;

public class SepiaDecorator extends ImageDecorator {
    public SepiaDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() { return "Sepia(" + wrapped.render() + ")"; }
}
