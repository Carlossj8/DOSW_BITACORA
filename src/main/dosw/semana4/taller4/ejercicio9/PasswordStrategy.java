package main.dosw.semana4.taller4.ejercicio9;

public class PasswordStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("[PasswordStrategy] Verificando usuario y contraseña...");
        return new AuthResult(true, credentials.userId);
    }
}
