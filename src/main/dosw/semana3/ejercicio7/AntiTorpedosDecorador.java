package main.dosw.semana3.ejercicio7;

public class AntiTorpedosDecorador extends BarcoBaseDecorador {
    public AntiTorpedosDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Sistema Antitorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 20;
    }
}
