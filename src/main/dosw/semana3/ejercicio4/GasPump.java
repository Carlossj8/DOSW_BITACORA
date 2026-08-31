package main.dosw.semana3.ejercicio4;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        System.out.println("Suministrando " + liters + " litros de gasolina.");
    }
}
