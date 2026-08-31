package main.dosw.semana3.ejercicio3;

public class ActionDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ActionDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza de Acción con Casco");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo de Acción Musculoso");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos de Acción Articulados");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas de Acción con Botas");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getResult() {
        return doll;
    }
}
