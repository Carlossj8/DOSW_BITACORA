package main.dosw.semana4.taller4.ejercicio9;

public class BiometricStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("[BiometricStrategy] Verificando huella dactilar...");
        return new AuthResult(true, credentials.userId);
    }
}
