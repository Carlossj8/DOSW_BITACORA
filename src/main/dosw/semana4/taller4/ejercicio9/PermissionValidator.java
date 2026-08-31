package main.dosw.semana4.taller4.ejercicio9;

public class PermissionValidator extends ValidationHandler {
    @Override
    protected boolean validate(AuthResult result) {
        return !result.username.isEmpty(); // el usuario tiene permisos asignados
    }
}
