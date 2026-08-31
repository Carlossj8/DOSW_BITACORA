package main.dosw.semana4.taller4.ejercicio10;

// Componente base del patron Decorator.
// Toda imagen (base o decorada) implementa esta interfaz.
public interface Image {
    String render(); // retorna descripcion del estado actual de la imagen
}
