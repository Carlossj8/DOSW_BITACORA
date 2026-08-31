package main.dosw.semana4.taller4.ejercicio6;

import java.util.List;

public class PopularityStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(String username) {
        return List.of(new Content("Squid Game [Popular]"), new Content("Wednesday [Popular]"));
    }
}
