package main.dosw.semana4.taller4.ejercicio9;

public class AuthResult {
    public final boolean success;
    public final String  username;

    public AuthResult(boolean success, String username) {
        this.success  = success;
        this.username = username;
    }
}
