package main.dosw.semana4.taller4.ejercicio7;

public class Document {
    private String titulo;
    private DocumentState state;

    public Document(String titulo) {
        this.titulo = titulo;
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public DocumentState getState() {
        return state;
    }

    public String getTitulo() {
        return titulo;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }
}
