package main.dosw.semana4.taller4.ejercicio9;

public class AuthDemo {
    public static void main(String[] args) {
        // --- Estrategia seleccionada segun el tipo de usuario ---
        AuthService authService = new AuthService();
        authService.setStrategy(new GoogleStrategy()); // usuario externo usa Google

        Credentials credentials = new Credentials("carlos.s", "oauth-token-xyz");
        AuthResult result = authService.login(credentials);

        // --- Cadena de validaciones post-autenticacion ---
        ValidationHandler chain = new CredentialValidator();
        chain.setNext(new PermissionValidator())
             .setNext(new LocationValidator())
             .setNext(new TimeValidator());

        chain.handle(result);
    }
}
