package main.dosw.semana4.taller4.ejercicio2;

public class OrderEvent {
    private String orderId;
    private String estado;

    public OrderEvent(String orderId, String estado) {
        this.orderId = orderId;
        this.estado = estado;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getEstado() {
        return estado;
    }
}
