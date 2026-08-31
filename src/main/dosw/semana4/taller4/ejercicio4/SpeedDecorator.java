package main.dosw.semana4.taller4.ejercicio4;

public class SpeedDecorator extends CharacterDecorator {
    public SpeedDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("  -> [Efecto Activo] Velocidad extra: aumenta la velocidad de movimiento y ataque.");
    }
}
