package main.dosw.semana3.ejercicio3;

public class ClassicDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ClassicDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza Clásica de Porcelana");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo Clásico con Vestido");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos Clásicos Suaves");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas Clásicas con Zapato de Tela");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(false);
    }

    public ToyDoll getResult() {
        return doll;
    }
}
