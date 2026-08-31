package main.dosw.semana4.taller4.ejercicio7;

public class LiderHandler extends DocumentHandler {
    @Override
    protected boolean process(Document doc) {
        System.out.println("[LiderHandler] Revision tecnica aprobada por el lider de equipo.");
        return true;
    }
}
