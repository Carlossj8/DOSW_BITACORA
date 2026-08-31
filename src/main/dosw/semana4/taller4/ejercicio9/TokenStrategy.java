package main.dosw.semana4.taller4.ejercicio9;

public class TokenStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("[TokenStrategy] Verificando token empresarial...");
        return new AuthResult(true, credentials.userId);
    }
}
