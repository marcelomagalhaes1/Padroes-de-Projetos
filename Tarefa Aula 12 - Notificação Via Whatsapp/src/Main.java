import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Executar Sistema de Notificações");
            System.out.println("2. Executar Cafeteria");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    executarNotificacoes(scanner);
                    break;
                case 2:
                    executarCafeteria();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Chamada ao código de notificações
    private static void executarNotificacoes(Scanner scanner) {
        System.out.print("Digite a prioridade (urgente/normal): ");
        String prioridade = scanner.nextLine();
        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        SistemaNotificacao.configurarNotificacao(prioridade, mensagem);
    }

    // Chamada ao código da cafeteria
    private static void executarCafeteria() {
        Cafeteria.main(new String[]{});
    }
}

