package main.dosw.semana3.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    private String name;
    private List<Item> items = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
