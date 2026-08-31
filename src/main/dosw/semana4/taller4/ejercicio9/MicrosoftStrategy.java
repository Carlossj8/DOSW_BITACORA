package main.dosw.semana4.taller4.ejercicio9;

public class MicrosoftStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("[MicrosoftStrategy] Validando cuenta Azure AD...");
        return new AuthResult(true, credentials.userId);
    }
}
