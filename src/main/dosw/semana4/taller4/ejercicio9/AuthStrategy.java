package main.dosw.semana4.taller4.ejercicio9;

// Strategy: contrato que deben cumplir todos los mecanismos de autenticacion.
public interface AuthStrategy {
    AuthResult authenticate(Credentials credentials);
}
