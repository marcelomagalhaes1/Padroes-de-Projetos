import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assinatura assinatura = new AssinaturaBase();
        Set<Integer> pacotesAdicionados = new HashSet<>();

        System.out.println("Assinatura inicial criada: R$" + assinatura.getPreco());

        int opcao;
        do {
            System.out.println("\nEscolha um pacote adicional para adicionar:");
            System.out.println("1. Vários dispositivos (R$19,99)");
            System.out.println("2. Frete Grátis (R$9,99)");
            System.out.println("3. Caixa surpresa (R$29,99)");
            System.out.println("4. Cartão Platinum (R$49,99)");
            System.out.println("5. Cash Back (R$19,99)");
            System.out.println("0. Finalizar e exibir resumo");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (pacotesAdicionados.contains(opcao) && opcao != 0) {
                System.out.println("Pacote já adicionado! Escolha outro.");
                continue;
            }

            switch (opcao) {
                case 1:
                    assinatura = new Pacote1MultiplosDispositivos(assinatura);
                    pacotesAdicionados.add(1);
                    break;
                case 2:
                    assinatura = new Pacote2FreteGratis(assinatura);
                    pacotesAdicionados.add(2);
                    break;
                case 3:
                    assinatura = new Pacote3CaixaSurpresa(assinatura);
                    pacotesAdicionados.add(3);
                    break;
                case 4:
                    assinatura = new Pacote4CartaoPlatinum(assinatura);
                    pacotesAdicionados.add(4);
                    break;
                case 5:
                    assinatura = new Pacote5CashBack(assinatura);
                    pacotesAdicionados.add(5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        System.out.println("\nResumo da assinatura:");
        System.out.println(assinatura.getDescricao());
        System.out.printf("Preço total: R$%.2f\n", assinatura.getPreco());
        scanner.close();
    }
}
