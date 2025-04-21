import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

// Interface para o gerador de códigos aleatórios
interface CodeGenerator {
    String generateCode();
}

// Gera códigos aleatórios com letras, números e símbolos
class RandomCodeGenerator implements CodeGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
    private final Random random = new Random();
    private final int codeLength;

    public RandomCodeGenerator(int codeLength) {
        this.codeLength = codeLength;
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            code.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return code.toString();
    }
}

// Classe Singleton que representa o sistema de login
class LoginSystem {
    private static LoginSystem instance;
    private final Scanner scanner;
    private final CodeGenerator codeGenerator;

    private static final String VALID_USERNAME = "marcelo";
    private static final String VALID_PASSWORD = "1234";

    private LoginSystem(CodeGenerator codeGenerator) {
        this.scanner = new Scanner(System.in);
        this.codeGenerator = codeGenerator;
    }

    public static synchronized LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem(new RandomCodeGenerator(8));
        }
        return instance;
    }

    // Exibe o menu principal
    public void showMenu() {
        int option;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    attemptLogin();
                    break;
                case 2:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("\n" + "=".repeat(40) + "\n");

        } while (option != 2);
    }

    // Processa tentativa de login
    public void attemptLogin() {
        System.out.println("\n=== SISTEMA DE LOGIN ===");

        System.out.print("Usuário: ");
        String username = scanner.nextLine().trim();

        System.out.print("Senha: ");
        String password = scanner.nextLine().trim();

        // Registro da tentativa com data e hora
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("📅 Tentativa registrada em: " + timestamp);

        // Validações básicas
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Erro: Usuário e senha não podem estar vazios.");
            return;
        }

        if (username.length() < 4 || password.length() < 4) {
            System.out.println("Erro: Usuário e senha devem conter no mínimo 4 caracteres.");
            return;
        }

        // Verificação anti-bot
        String verificationCode = codeGenerator.generateCode();
        if (verifyHuman(verificationCode)) {
            if (authenticate(username, password)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + username + "!");
            } else {
                System.out.println("Credenciais inválidas. Acesso negado!");
            }
        } else {
            System.out.println("Falha na verificação. Acesso negado!");
        }
    }

    // Verifica se usuário e senha estão corretos
    private boolean authenticate(String username, String password) {
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

    // Código para verificação anti-bot
    private boolean verifyHuman(String verificationCode) {
        System.out.println("\n[VERIFICAÇÃO DE SEGURANÇA]");
        System.out.println("Digite o seguinte código para continuar: " + verificationCode);
        System.out.print("Código: ");
        String userInput = scanner.nextLine();

        return userInput.trim().equals(verificationCode);
    }

    public void closeScanner() {
        scanner.close();
    }
}

// Classe principal que executa o programa
public class Login {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();
        loginSystem.showMenu();
        loginSystem.closeScanner();
    }
}
