package main.dosw.semana4.taller4.ejercicio9;

// Contexto del patron Strategy.
// Recibe cualquier AuthStrategy y delega la autenticacion a ella.
public class AuthService {
    private AuthStrategy strategy;

    public void setStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public AuthResult login(Credentials credentials) {
        if (strategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de autenticacion.");
        }
        return strategy.authenticate(credentials);
    }
}
