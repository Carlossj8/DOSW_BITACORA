package main.dosw.semana3.ejercicio8;

public class MotivoViajeControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isMotivoValido()) {
            System.out.println("Revisión de Motivos del Viaje: RECHAZADO. Motivo de viaje no consistente o no justificado.");
            return;
        }
        System.out.println("Revisión de Motivos del Viaje: APROBADO.");
        super.procesar(request);
    }
}
