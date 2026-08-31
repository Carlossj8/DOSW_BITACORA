package main.dosw.semana4.taller4.ejercicio7;

public class ApprovedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("El documento ya se encuentra APROBADO.");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("No se puede rechazar un documento ya APROBADO.");
    }

    @Override
    public String getNombreEstado() {
        return "Aprobado";
    }
}
