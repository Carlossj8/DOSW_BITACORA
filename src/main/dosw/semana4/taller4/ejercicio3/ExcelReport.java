package main.dosw.semana4.taller4.ejercicio3;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato de hoja de calculo Excel con celdas y formulas.");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo .xlsx a la carpeta de descargas.");
    }
}
