package main.dosw.semana3.ejercicio8;

public class AprobacionFinalControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        request.setAprobado(true);
        System.out.println("Aprobación Final por Migración: APROBADO. Bienvenido a Estados Unidos.");
        super.procesar(request);
    }
}
