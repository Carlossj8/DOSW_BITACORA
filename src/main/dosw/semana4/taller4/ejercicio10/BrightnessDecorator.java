package main.dosw.semana4.taller4.ejercicio10;

public class BrightnessDecorator extends ImageDecorator {
    public BrightnessDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() { return "Brightness(" + wrapped.render() + ")"; }
}
