package main.dosw.semana4.taller4.ejercicio3;

public class CsvReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato CSV con separacion por comas.");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo .csv a la carpeta de descargas.");
    }
}
