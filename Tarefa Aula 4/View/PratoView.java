package View;

import Controller.PratoController;
import model.Prato;
import java.util.List;
import java.util.Scanner;

public class PratoView {
    private PratoController controller;
    private Scanner scanner;
    
    public PratoView() {
        this.controller = new PratoController();
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Método principal que inicia a aplicação
     */
    public static void main(String[] args) {
        PratoView view = new PratoView();
        view.exibirMenu();
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1. Cadastrar Novo Prato");
            System.out.println("2. Listar Todos os Pratos");
            System.out.println("3. Buscar Prato por ID");
            System.out.println("4. Atualizar Prato");
            System.out.println("5. Remover Prato");
            System.out.println("6. Buscar por Tipo");
            System.out.println("7. Buscar Pratos Rápidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    cadastrarPrato();
                    break;
                case 2:
                    listarPratos();
                    break;
                case 3:
                    buscarPratoPorId();
                    break;
                case 4:
                    atualizarPrato();
                    break;
                case 5:
                    removerPrato();
                    break;
                case 6:
                    buscarPorTipo();
                    break;
                case 7:
                    buscarPratosRapidos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private void cadastrarPrato() {
        System.out.println("\n--- CADASTRAR NOVO PRATO ---");
        
        System.out.print("Nome do Prato: ");
        String nome = scanner.nextLine();
        
        System.out.print("Ingredientes (separados por vírgula): ");
        String ingredientes = scanner.nextLine();
        
        System.out.print("Tipo (Entrada/Principal/Sobremesa): ");
        String tipo = scanner.nextLine();
        
        System.out.print("Tempo de Preparo (minutos): ");
        int tempo = scanner.nextInt();
        scanner.nextLine();
        
        try {
            controller.adicionarPrato(nome, ingredientes, tipo, tempo);
            System.out.println("Prato cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void listarPratos() {
        System.out.println("\n--- LISTA DE PRATOS ---");
        List<Prato> pratos = controller.listarTodosPratos();
        
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato cadastrado.");
        } else {
            pratos.forEach(System.out::println);
        }
    }
    
    private void buscarPratoPorId() {
        System.out.println("\n--- BUSCAR PRATO POR ID ---");
        System.out.print("ID do Prato: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Prato prato = controller.buscarPratoPorId(id);
        if (prato != null) {
            System.out.println(prato);
        } else {
            System.out.println("Prato não encontrado.");
        }
    }
    
    private void atualizarPrato() {
        System.out.println("\n--- ATUALIZAR PRATO ---");
        System.out.print("ID do Prato a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Novo Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Novos Ingredientes: ");
        String ingredientes = scanner.nextLine();
        
        System.out.print("Novo Tipo: ");
        String tipo = scanner.nextLine();
        
        System.out.print("Novo Tempo de Preparo: ");
        int tempo = scanner.nextInt();
        scanner.nextLine();
        
        try {
            controller.atualizarPrato(id, nome, ingredientes, tipo, tempo);
            System.out.println("Prato atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void removerPrato() {
        System.out.println("\n--- REMOVER PRATO ---");
        System.out.print("ID do Prato a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        try {
            controller.removerPrato(id);
            System.out.println("Prato removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void buscarPorTipo() {
        System.out.println("\n--- BUSCAR POR TIPO ---");
        System.out.print("Tipo (Entrada/Principal/Sobremesa): ");
        String tipo = scanner.nextLine();
        
        List<Prato> pratos = controller.buscarPorTipo(tipo);
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato encontrado deste tipo.");
        } else {
            pratos.forEach(System.out::println);
        }
    }
    
    private void buscarPratosRapidos() {
        System.out.println("\n--- PRATOS RÁPIDOS ---");
        System.out.print("Tempo máximo de preparo (minutos): ");
        int tempo = scanner.nextInt();
        scanner.nextLine();
        
        List<Prato> pratos = controller.buscarPratosRapidos(tempo);
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato encontrado dentro do tempo especificado.");
        } else {
            System.out.println("Pratos com preparo até " + tempo + " minutos:");
            pratos.forEach(System.out::println);
        }
    }
}