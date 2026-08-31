package main.dosw.semana4.taller4.ejercicio9;

public class GoogleStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("[GoogleStrategy] Validando token OAuth de Google...");
        return new AuthResult(true, credentials.userId);
    }
}
