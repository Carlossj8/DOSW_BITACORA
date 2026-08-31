package main.dosw.semana4.taller4.ejercicio10;

public class NoiseReductionDecorator extends ImageDecorator {
    public NoiseReductionDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() { return "NoiseReduction(" + wrapped.render() + ")"; }
}
