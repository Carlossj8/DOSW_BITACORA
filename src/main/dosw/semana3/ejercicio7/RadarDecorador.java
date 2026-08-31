package main.dosw.semana3.ejercicio7;

public class RadarDecorador extends BarcoBaseDecorador {
    public RadarDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Radar Avanzado";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 10;
    }
}
