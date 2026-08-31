package main.dosw.semana2.pokemon;

import java.util.List;

public class Entrenador {
    private Long id;
    private String nombre;
    private int medallas;
    private List<Pokemon> equipo;

    public Entrenador() {
    }

    public Entrenador(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public Entrenador(String nombre, List<Pokemon> equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public Entrenador(Long id, String nombre, int medallas, List<Pokemon> equipo) {
        this.id = id;
        this.nombre = nombre;
        this.medallas = medallas;
        this.equipo = equipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public boolean esExperimentado() {
        return this.medallas > 5;
    }

    public double calcularPoderTotalEquipo() {
        if (equipo == null) {
            return 0.0;
        }
        return equipo.stream()
                .mapToDouble(p -> p.getPoderCombate())
                .sum();
    }

    @Override
    public String toString() {
        return nombre + "(" + medallas + ")";
    }
}
