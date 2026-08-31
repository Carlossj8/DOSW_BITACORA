package main.dosw.semana4.taller4.ejercicio6;

import java.util.List;

public class HomePageComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(UserProfile profile) {
        List<Content> recomendaciones = profile.obtenerRecomendaciones();
        System.out.println("[UI HomePageComponent] Actualizando carrusel principal con: " + recomendaciones);
    }
}
