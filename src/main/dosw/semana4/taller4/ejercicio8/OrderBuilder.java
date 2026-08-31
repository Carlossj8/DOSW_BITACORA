package main.dosw.semana4.taller4.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private Size size = Size.MEDIUM;
    private Meat meat = Meat.SINGLE_BEEF;
    private final List<String> toppings  = new ArrayList<>();
    private final List<String> sides     = new ArrayList<>();
    private final List<OrderObserver> observers = new ArrayList<>();

    public OrderBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(Meat meat) {
        this.meat = meat;
        return this;
    }

    public OrderBuilder addTopping(String... toppings) {
        this.toppings.addAll(List.of(toppings));
        return this;
    }

    public OrderBuilder addSide(String... sides) {
        this.sides.addAll(List.of(sides));
        return this;
    }

    public OrderBuilder addObserver(OrderObserver observer) {
        this.observers.add(observer);
        return this;
    }

    public Order build() {
        if (size == null || meat == null) {
            throw new IllegalStateException("El pedido requiere tamaño y tipo de carne.");
        }
        return new Order(size, meat, toppings, sides, observers);
    }
}
