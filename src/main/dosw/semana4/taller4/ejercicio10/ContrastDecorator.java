package main.dosw.semana4.taller4.ejercicio10;

public class ContrastDecorator extends ImageDecorator {
    public ContrastDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() { return "Contrast(" + wrapped.render() + ")"; }
}
