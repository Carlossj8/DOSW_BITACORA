package main.dosw.semana4.taller4.ejercicio9;

public class CredentialValidator extends ValidationHandler {
    @Override
    protected boolean validate(AuthResult result) {
        return result.success; // credenciales validas si la autenticacion fue exitosa
    }
}
