import java.util.*;

public class GenreNotificationService implements Observable {
    private Map<String, List<Observer>> observersPorGenero = new HashMap<>();

    public GenreNotificationService() {
        for (String genero : Arrays.asList("Ação", "Comédia", "Terror", "Anime", "Ficção Científica")) {
            observersPorGenero.put(genero, new ArrayList<>());
        }
    }

    @Override
    public void registerObserver(String genero, Observer observer) {
        observersPorGenero.get(genero).add(observer);
    }

    @Override
    public void removeObserver(String genero, Observer observer) {
        observersPorGenero.get(genero).remove(observer);
    }

    @Override
    public void notifyObservers(String genero, String titulo) {
        System.out.println("\nNovo conteúdo adicionado: \"" + titulo + "\" (Gênero: " + genero + ")");
        List<Observer> lista = observersPorGenero.get(genero);
        if (lista.isEmpty()) {
            System.out.println("-> Nenhum usuário inscrito.");
        } else {
            System.out.print("-> Notificando: ");
            for (Observer obs : lista) {
                obs.update(genero, titulo);
            }
            System.out.println();
        }
    }

    public void addFilme(String genero, String titulo) {
        notifyObservers(genero, titulo);
    }
}