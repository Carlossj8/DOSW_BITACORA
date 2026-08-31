package main.dosw.semana4.taller4.ejercicio4;

public abstract class CharacterDecorator implements GameCharacter {
    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }
}
