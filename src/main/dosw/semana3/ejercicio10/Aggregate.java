package main.dosw.semana3.ejercicio10;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
