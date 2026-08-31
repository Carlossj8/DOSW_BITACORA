package main.dosw.semana4.taller4.ejercicio6;

import java.util.List;

public class NotificationService implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(UserProfile profile) {
        List<Content> recomendaciones = profile.obtenerRecomendaciones();
        System.out.println("[NotificationService] Enviando correo con recomendaciones: " + recomendaciones);
    }
}
