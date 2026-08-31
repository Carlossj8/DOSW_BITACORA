package main.dosw.semana4.taller4.ejercicio10;

public class ImageEditorDemo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor(new BaseImage("foto.jpg"));
        editor.printState();

        // Aplicar filtros (cada uno crea un Command que envuelve con un Decorator)
        editor.apply(new ApplyFilterCommand(editor, GrayscaleDecorator::new, "Grayscale"));
        editor.printState();

        editor.apply(new ApplyFilterCommand(editor, SepiaDecorator::new, "Sepia"));
        editor.printState();

        editor.apply(new ApplyFilterCommand(editor, BrightnessDecorator::new, "Brightness"));
        editor.printState();

        // Deshacer el ultimo filtro (Brightness)
        editor.undo();
        editor.printState();

        // Deshacer otro (Sepia)
        editor.undo();
        editor.printState();

        // Rehacer (Sepia vuelve)
        editor.redo();
        editor.printState();
    }
}
