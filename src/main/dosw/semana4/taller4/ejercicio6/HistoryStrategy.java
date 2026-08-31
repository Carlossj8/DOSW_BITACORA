package main.dosw.semana4.taller4.ejercicio6;

import java.util.List;

public class HistoryStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(String username) {
        return List.of(new Content("Breaking Bad [Historial]"), new Content("Better Call Saul [Historial]"));
    }
}
