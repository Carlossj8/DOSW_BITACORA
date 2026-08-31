package main.dosw.semana4.taller4.ejercicio7;

public class InReviewState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("Revision exitosa. Documento APROBADO.");
        doc.setState(new ApprovedState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("Revision fallida. Documento RECHAZADO.");
        doc.setState(new RejectedState());
    }

    @Override
    public String getNombreEstado() {
        return "En Revision";
    }
}
