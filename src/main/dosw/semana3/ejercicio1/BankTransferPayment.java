package main.dosw.semana3.ejercicio1;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con Transferencia bancaria por $" + amount);
    }
}