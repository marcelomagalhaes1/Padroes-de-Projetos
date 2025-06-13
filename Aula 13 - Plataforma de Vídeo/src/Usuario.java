import java.util.*;

public class Usuario implements Observer {
    private String nome;
    private Set<String> generosInscritos = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscrever(String genero, GenreNotificationService servico) {
        generosInscritos.add(genero);
        servico.registerObserver(genero, this);
    }

    public void desinscrever(String genero, GenreNotificationService servico) {
        generosInscritos.remove(genero);
        servico.removeObserver(genero, this);
    }

    @Override
    public void update(String genero, String titulo) {
        System.out.println("-> [" + nome + "] foi notificado sobre [" + titulo + "] (Gênero: " + genero + ")");
    }
}