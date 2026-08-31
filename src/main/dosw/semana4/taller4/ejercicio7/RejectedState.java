package main.dosw.semana4.taller4.ejercicio7;

public class RejectedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("No se puede aprobar un documento RECHAZADO.");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("El documento ya se encuentra RECHAZADO.");
    }

    @Override
    public String getNombreEstado() {
        return "Rechazado";
    }
}
