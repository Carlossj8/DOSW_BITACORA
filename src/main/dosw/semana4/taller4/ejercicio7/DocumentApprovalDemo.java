package main.dosw.semana4.taller4.ejercicio7;

public class DocumentApprovalDemo {
    public static void main(String[] args) {
        Document doc = new Document("Contrato de Prestacion de Servicios 2026");
        System.out.println("Estado inicial: " + doc.getState().getNombreEstado());

        DocumentHandler autor = new AutorHandler();
        DocumentHandler lider = new LiderHandler();
        DocumentHandler juridico = new JuridicoHandler();

        autor.setNext(lider).setNext(juridico);

        System.out.println("\n--- Iniciando flujo de aprobacion en cadena ---");
        autor.handle(doc);

        System.out.println("\nEstado final del documento: " + doc.getState().getNombreEstado());
    }
}
