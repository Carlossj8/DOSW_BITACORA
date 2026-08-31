package main.dosw.semana3.ejercicio3;

public class ToyDoll {
    private String head;
    private String body;
    private String arms;
    private String legs;
    private boolean hasAccessories;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void setHasAccessories(boolean hasAccessories) {
        this.hasAccessories = hasAccessories;
    }

    public void showInfo() {
        System.out.println("Muñeco compuesto por: Cabeza=" + head + ", Cuerpo=" + body + 
                           ", Brazos=" + arms + ", Piernas=" + legs + 
                           ", Tiene Accesorios=" + hasAccessories);
    }
}
