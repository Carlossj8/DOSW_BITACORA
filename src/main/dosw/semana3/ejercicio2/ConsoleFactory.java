package main.dosw.semana3.ejercicio2;

// Fabrica abstracta: define los metodos para crear la familia completa
// de componentes de una consola sin exponer implementaciones concretas.
public interface ConsoleFactory {
    Controller createController();
    Game       createGame();
    UI         createUI();
}
