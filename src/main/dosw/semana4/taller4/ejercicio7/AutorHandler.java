package main.dosw.semana4.taller4.ejercicio7;

public class AutorHandler extends DocumentHandler {
    @Override
    protected boolean process(Document doc) {
        System.out.println("[AutorHandler] Verificando borrador del autor...");
        doc.approve();
        return true;
    }
}
