package main.dosw.semana3.ejercicio3;

public class ToyFactory {
    private ToyDollBuilder builder;

    public void constructDoll(ToyDollBuilder builder) {
        this.builder = builder;
        this.builder.buildHead();
        this.builder.buildBody();
        this.builder.buildArms();
        this.builder.buildLegs();
        this.builder.addAccessories();
    }
}
