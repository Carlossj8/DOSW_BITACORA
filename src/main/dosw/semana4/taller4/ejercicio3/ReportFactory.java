package main.dosw.semana4.taller4.ejercicio3;

public class ReportFactory {

    public static ReportGenerator createReport(String type) {
        switch (type.toLowerCase()) {
            case "pdf":   return new PdfReport();
            case "excel": return new ExcelReport();
            case "csv":   return new CsvReport();
            default:      throw new IllegalArgumentException("Tipo de reporte no soportado: " + type);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Generando Reporte PDF ---");
        ReportGenerator pdf = ReportFactory.createReport("pdf");
        pdf.generate();

        System.out.println("\n--- Generando Reporte Excel ---");
        ReportGenerator excel = ReportFactory.createReport("excel");
        excel.generate();

        System.out.println("\n--- Generando Reporte CSV ---");
        ReportGenerator csv = ReportFactory.createReport("csv");
        csv.generate();
    }
}
