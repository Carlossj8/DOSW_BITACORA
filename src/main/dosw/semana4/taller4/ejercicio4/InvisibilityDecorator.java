package main.dosw.semana4.taller4.ejercicio4;

public class InvisibilityDecorator extends CharacterDecorator {
    public InvisibilityDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("  -> [Efecto Activo] Invisibilidad: movimiento sigiloso y primer golpe critico.");
    }
}
