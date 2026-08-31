package main.dosw.semana4.taller4.ejercicio8;

import java.util.List;

public class Order {
    private final Size size;
    private final Meat meat;
    private final List<String> toppings;
    private final List<String> sides;
    private final List<OrderObserver> observers;

    Order(Size size, Meat meat, List<String> toppings,
          List<String> sides, List<OrderObserver> observers) {
        this.size      = size;
        this.meat      = meat;
        this.toppings  = List.copyOf(toppings);
        this.sides     = List.copyOf(sides);
        this.observers = List.copyOf(observers); 
    }

    public void confirm() {
        System.out.println("--- Confirmando pedido ---");
        for (OrderObserver observer : observers) {
            observer.onOrderConfirmed(this);
        }
    }

    public String getSummary() {
        return "Hamburguesa " + size + " de " + meat
             + " | Toppings: " + toppings
             + " | Acompañamientos: " + sides;
    }
}
