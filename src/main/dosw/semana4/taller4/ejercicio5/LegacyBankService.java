package main.dosw.semana4.taller4.ejercicio5;

public class LegacyBankService {
    public void openConnection() {
        System.out.println("Paso 1: Abriendo conexion socket segura con el banco antiguo...");
    }

    public void authenticate(String apiKey) {
        System.out.println("Paso 2: Autenticando llave de acceso del sistema antiguo...");
    }

    public void initializeSession() {
        System.out.println("Paso 3: Inicializando sesion de transaccion bancaria...");
    }

    public boolean verifyBalance(String account, int cents) {
        System.out.println("Paso 4: Verificando saldo en centavos (" + cents + " centavos) para cuenta: " + account);
        return true;
    }

    public void executeTransaction(String account, int cents) {
        System.out.println("Paso 5: Ejecutando transaccion en sistema antiguo: " + cents + " centavos en cuenta " + account);
    }

    public void closeConnection() {
        System.out.println("Paso 6: Cerrando conexion con el banco antiguo.");
    }
}
