package main.dosw.semana4.taller4.ejercicio4;

public class CharacterBuilder {
    private String nombre = "Guerrero";
    private String armadura = "Cuero";
    private String arma = "Espada de madera";
    private String habilidad = "Golpe basico";

    public CharacterBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CharacterBuilder setArmor(String armadura) {
        this.armadura = armadura;
        return this;
    }

    public CharacterBuilder setWeapon(String arma) {
        this.arma = arma;
        return this;
    }

    public CharacterBuilder setSkill(String habilidad) {
        this.habilidad = habilidad;
        return this;
    }

    public GameCharacter build() {
        return new BaseCharacter(nombre, armadura, arma, habilidad);
    }
}
