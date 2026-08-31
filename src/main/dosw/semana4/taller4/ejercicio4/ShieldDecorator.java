package main.dosw.semana4.taller4.ejercicio4;

public class ShieldDecorator extends CharacterDecorator {
    public ShieldDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("  -> [Efecto Activo] Escudo de hielo: absorbe daño entrante.");
    }
}
