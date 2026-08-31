package main.dosw.semana4.taller4.ejercicio6;

public class Content {
    private String titulo;

    public Content(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
