package main.dosw.semana4.taller4.ejercicio9;

public class LocationValidator extends ValidationHandler {
    @Override
    protected boolean validate(AuthResult result) {
        return true; // simula que el usuario esta en una ubicacion permitida
    }
}
