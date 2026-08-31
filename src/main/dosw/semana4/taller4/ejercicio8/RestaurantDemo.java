package main.dosw.semana4.taller4.ejercicio8;

public class RestaurantDemo {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setSize(Size.LARGE)
                .setMeat(Meat.DOUBLE_BEEF)
                .addTopping("queso", "lechuga", "tomate")
                .addSide("papas", "gaseosa")
                .addObserver(new KitchenService())
                .addObserver(new BillingService())
                .addObserver(new DeliveryService())
                .build();

        order.confirm();
    }
}
