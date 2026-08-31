package main.dosw.semana3.ejercicio7;

public class BlindajeDecorador extends BarcoBaseDecorador {
    public BlindajeDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Blindaje Reforzado";
    }

    @Override
    public int defensa() {
        return barco.defensa() + 30;
    }
}
