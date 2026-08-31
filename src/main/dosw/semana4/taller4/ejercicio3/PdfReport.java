package main.dosw.semana4.taller4.ejercicio3;

public class PdfReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato PDF con diseño corporativo.");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo .pdf a la carpeta de descargas.");
    }
}
