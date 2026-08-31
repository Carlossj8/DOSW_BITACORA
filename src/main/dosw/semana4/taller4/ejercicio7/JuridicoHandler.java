package main.dosw.semana4.taller4.ejercicio7;

public class JuridicoHandler extends DocumentHandler {
    @Override
    protected boolean process(Document doc) {
        System.out.println("[JuridicoHandler] Revision legal aprobada por el departamento juridico.");
        doc.approve();
        return true;
    }
}
