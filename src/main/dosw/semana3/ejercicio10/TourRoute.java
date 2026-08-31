package main.dosw.semana3.ejercicio10;

public class TourRoute implements Aggregate<Place> {
    private final Place[] places;

    public TourRoute() {
        places = new Place[] {
            new Place("Colosseum"),
            new Place("Roman Forum"),
            new Place("Trevi Fountain"),
            new Place("Pantheon"),
            new Place("Spanish Steps")
        };
    }

    @Override
    public Iterator<Place> createIterator() {
        return new RomeIterator();
    }

    private class RomeIterator implements Iterator<Place> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < places.length;
        }

        @Override
        public Place next() {
            return places[currentIndex++];
        }
    }
}
