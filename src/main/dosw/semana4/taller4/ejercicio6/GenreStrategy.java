package main.dosw.semana4.taller4.ejercicio6;

import java.util.List;

public class GenreStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(String username) {
        return List.of(new Content("Stranger Things [Genero: Sci-Fi]"), new Content("Inception [Genero: Sci-Fi]"));
    }
}
