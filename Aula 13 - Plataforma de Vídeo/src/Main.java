import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GenreNotificationService servico = new GenreNotificationService();
    private static Map<String, Usuario> usuarios = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("=== Plataforma VOD - Notificações por Gênero ===");

        while (true) {
            System.out.println("\n1. Cadastrar novo usuário");
            System.out.println("2. Adicionar novo filme/série");
            System.out.println("3. Listar usuários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> adicionarFilme();
                case 3 -> listarUsuarios();
                case 4 -> {
                    System.out.println("Encerrando...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        Usuario usuario = new Usuario(nome);
        usuarios.put(nome, usuario);

        List<String> generos = List.of("Ação", "Comédia", "Terror", "Anime", "Ficção Científica");

        System.out.println("Selecione os gêneros para receber notificações (digite o número separado por vírgula):");
        for (int i = 0; i < generos.size(); i++) {
            System.out.println((i + 1) + ". " + generos.get(i));
        }

        String[] escolhas = scanner.nextLine().split(",");
        for (String escolha : escolhas) {
            try {
                int index = Integer.parseInt(escolha.trim()) - 1;
                if (index >= 0 && index < generos.size()) {
                    usuario.inscrever(generos.get(index), servico);
                }
            } catch (NumberFormatException ignored) {}
        }

        System.out.println("Usuário " + nome + " cadastrado com sucesso.");
    }

    private static void adicionarFilme() {
        System.out.print("Título do filme/série: ");
        String titulo = scanner.nextLine();

        List<String> generos = List.of("Ação", "Comédia", "Terror", "Anime", "Ficção Científica");
        System.out.println("Escolha o gênero:");
        for (int i = 0; i < generos.size(); i++) {
            System.out.println((i + 1) + ". " + generos.get(i));
        }

        int generoIndex = Integer.parseInt(scanner.nextLine()) - 1;
        if (generoIndex >= 0 && generoIndex < generos.size()) {
            String genero = generos.get(generoIndex);
            servico.addFilme(genero, titulo);
        } else {
            System.out.println("Gênero inválido.");
        }
    }

    private static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        System.out.println("Usuários cadastrados:");
        for (String nome : usuarios.keySet()) {
            System.out.println("- " + nome);
        }
    }
}