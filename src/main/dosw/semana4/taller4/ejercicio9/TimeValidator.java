package main.dosw.semana4.taller4.ejercicio9;

import java.time.LocalTime;

public class TimeValidator extends ValidationHandler {
    @Override
    protected boolean validate(AuthResult result) {
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(7, 0);
        LocalTime end   = LocalTime.of(20, 0);
        return !now.isBefore(start) && !now.isAfter(end); // horario laboral 07:00-20:00
    }
}
