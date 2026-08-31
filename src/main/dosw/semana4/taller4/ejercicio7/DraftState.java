package main.dosw.semana4.taller4.ejercicio7;

public class DraftState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("Documento enviado a revision.");
        doc.setState(new InReviewState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("El borrador fue descartado.");
        doc.setState(new RejectedState());
    }

    @Override
    public String getNombreEstado() {
        return "Borrador";
    }
}
