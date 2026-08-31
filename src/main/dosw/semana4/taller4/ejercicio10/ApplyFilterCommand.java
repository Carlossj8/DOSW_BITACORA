package main.dosw.semana4.taller4.ejercicio10;

import java.util.function.Function;

// Comando concreto: aplica un Decorator a la imagen actual del editor.
// Guarda la imagen anterior para poder restaurarla en undo().
public class ApplyFilterCommand implements ImageCommand {
    private final ImageEditor editor;
    private final Function<Image, Image> filter; // p.ej. SepiaDecorator::new
    private final String filterName;
    private Image beforeImage;

    public ApplyFilterCommand(ImageEditor editor, Function<Image, Image> filter, String filterName) {
        this.editor     = editor;
        this.filter     = filter;
        this.filterName = filterName;
    }

    @Override
    public void execute() {
        beforeImage = editor.getCurrentImage();          // guarda estado anterior
        editor.setCurrentImage(filter.apply(beforeImage)); // envuelve con el Decorator
        System.out.println("[Command] Filtro aplicado: " + filterName);
    }

    @Override
    public void undo() {
        editor.setCurrentImage(beforeImage); // restaura la imagen sin el Decorator
        System.out.println("[Command] Undo del filtro: " + filterName);
    }
}
