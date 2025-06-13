public interface Observable {
    void registerObserver(String genero, Observer observer);
    void removeObserver(String genero, Observer observer);
    void notifyObservers(String genero, String titulo);
}