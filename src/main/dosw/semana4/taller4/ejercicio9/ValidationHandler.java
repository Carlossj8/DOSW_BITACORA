package main.dosw.semana4.taller4.ejercicio9;

// Manejador abstracto de la cadena de responsabilidad.
// Cada validador conoce al siguiente y decide si pasa o detiene la cadena.
public abstract class ValidationHandler {
    private ValidationHandler next;

    public ValidationHandler setNext(ValidationHandler next) {
        this.next = next;
        return next; // permite encadenar: a.setNext(b).setNext(c)
    }

    public final void handle(AuthResult result) {
        if (validate(result)) {
            System.out.println("[" + getClass().getSimpleName() + "] OK");
            if (next != null) {
                next.handle(result);
            } else {
                System.out.println("Acceso concedido a: " + result.username);
            }
        } else {
            System.out.println("[" + getClass().getSimpleName() + "] DENEGADO - Acceso bloqueado.");
        }
    }

    protected abstract boolean validate(AuthResult result);
}
