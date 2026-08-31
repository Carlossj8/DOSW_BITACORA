package main.dosw.semana4.taller4.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private String username;
    private RecommendationAlgorithm algorithm;
    private List<PreferenceObserver> observadores = new ArrayList<>();

    public UserProfile(String username, RecommendationAlgorithm initialAlgorithm) {
        this.username = username;
        this.algorithm = initialAlgorithm;
    }

    public void agregarObservador(PreferenceObserver observer) {
        observadores.add(observer);
    }

    public void removerObservador(PreferenceObserver observer) {
        observadores.remove(observer);
    }

    public void cambiarEstrategiaRecomendacion(RecommendationAlgorithm newAlgorithm) {
        this.algorithm = newAlgorithm;
        notificarObservadores();
    }

    public List<Content> obtenerRecomendaciones() {
        return algorithm.recommend(username);
    }

    private void notificarObservadores() {
        for (PreferenceObserver observer : observadores) {
            observer.onPreferenceChanged(this);
        }
    }

    public static void main(String[] args) {
        UserProfile usuario = new UserProfile("Carlos123", new PopularityStrategy());

        usuario.agregarObservador(new HomePageComponent());
        usuario.agregarObservador(new NotificationService());
        usuario.agregarObservador(new SuggestedListComponent());

        System.out.println("--- Cambiando algoritmo a recomendaciones por Genero ---");
        usuario.cambiarEstrategiaRecomendacion(new GenreStrategy());

        System.out.println("\n--- Cambiando algoritmo a recomendaciones por Historial ---");
        usuario.cambiarEstrategiaRecomendacion(new HistoryStrategy());
    }
}
