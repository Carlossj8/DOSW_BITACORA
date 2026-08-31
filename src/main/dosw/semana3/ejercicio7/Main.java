package main.dosw.semana3.ejercicio7;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco, Barco>> mejoras = Map.of(
            "BLINDAJE", BlindajeDecorador::new,
            "RADAR", RadarDecorador::new,
            "MISILES", MisilesDecorador::new,
            "ANTITORPEDOS", AntiTorpedosDecorador::new
        );

        List<String> configuracion = List.of(
            "BLINDAJE",
            "RADAR",
            "MISILES"
        );

        Barco barcoFinal = configuracion.stream()
            .map(mejoras::get)
            .reduce(barcoBase,
                (barco, decorador) -> decorador.apply(barco),
                (b1, b2) -> b1
            );

        System.out.println(barcoFinal.getDescripcion());
        System.out.println("Ataque: " + barcoFinal.poderAtaque());
        System.out.println("Defensa: " + barcoFinal.defensa());
    }
}
