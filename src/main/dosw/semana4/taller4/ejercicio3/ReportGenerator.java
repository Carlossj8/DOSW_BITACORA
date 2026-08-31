package main.dosw.semana4.taller4.ejercicio3;

public abstract class ReportGenerator {

    public final void generate() {
        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    private void fetchData() {
        System.out.println("Obteniendo datos de la base de datos...");
    }

    private void processData() {
        System.out.println("Procesando y calculando informacion del reporte...");
    }

    protected abstract void applyFormat();
    protected abstract void exportFile();
}
