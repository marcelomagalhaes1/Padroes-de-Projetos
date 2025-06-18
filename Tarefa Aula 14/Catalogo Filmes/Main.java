import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos filmes você deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        CatalogoFilmes catalogo = new CatalogoFilmes(quantidade);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Filme " + (i + 1));
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Gênero: ");
            String genero = scanner.nextLine();
            catalogo.adicionarFilme(new Filme(titulo, genero));
        }

        System.out.println("\n=== Catálogo de Filmes ===");
        Iterator<Filme> iterator = catalogo.criarIterator();
        while (iterator.hasNext()) {
            Filme f = iterator.next();
            System.out.println(f);
        }

        scanner.close();
    }
}