package main.dosw.semana3.ejercicio8;

public class AntecedentesControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isAntecedentesLimpios()) {
            System.out.println("Control de Antecedentes: RECHAZADO. Se encontraron antecedentes penales.");
            return;
        }
        System.out.println("Control de Antecedentes: APROBADO.");
        super.procesar(request);
    }
}
