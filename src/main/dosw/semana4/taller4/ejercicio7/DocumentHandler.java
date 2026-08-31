package main.dosw.semana4.taller4.ejercicio7;

public abstract class DocumentHandler {
    protected DocumentHandler next;

    public DocumentHandler setNext(DocumentHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Document doc) {
        if (process(doc) && next != null) {
            next.handle(doc);
        }
    }

    protected abstract boolean process(Document doc);
}
