package main.dosw.semana3.ejercicio8;

public class PasaporteControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isPasaporteValido()) {
            System.out.println("Revisión de Pasaporte y Visa: RECHAZADO. Pasaporte o visa no válidos.");
            return;
        }
        System.out.println("Revisión de Pasaporte y Visa: APROBADO.");
        super.procesar(request);
    }
}
