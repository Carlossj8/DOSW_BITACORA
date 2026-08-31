package main.dosw.semana4.taller4.ejercicio4;

public class GameCharacterDemo {
    public static void main(String[] args) {
        System.out.println("--- Construyendo Personaje Base con Builder ---");
        GameCharacter warrior = new CharacterBuilder()
                .setNombre("Guerrero Élite")
                .setArmor("Acero Rúnico")
                .setWeapon("Espada de dos manos")
                .setSkill("Ataque de Furia")
                .build();

        System.out.println("\n--- Ataque del Personaje Base ---");
        warrior.attack();

        System.out.println("\n--- Aplicando Mejoras Temporales con Decorator ---");
        GameCharacter poweredWarrior = new ShieldDecorator(
                new SpeedDecorator(
                        new InvisibilityDecorator(warrior)
                )
        );

        System.out.println("\n--- Ataque del Personaje Potenciado ---");
        poweredWarrior.attack();
    }
}
