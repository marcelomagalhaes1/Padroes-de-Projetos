import java.util.*;

abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String login, String senha);
}

class LoginHandler extends Handler {
    private Set<String> logins = new HashSet<>(Arrays.asList("admin", "valdir", "usuario"));

    @Override
    public boolean handle(String login, String senha) {
        if (!logins.contains(login)) {
            System.out.println("Erro: login não cadastrado.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class MaiusculaHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("Erro: senha deve conter ao menos uma letra maiúscula.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class MinusculaHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (!senha.matches(".*[a-z].*")) {
            System.out.println("Erro: senha deve conter ao menos uma letra minúscula.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class EspecialHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (!senha.matches(".*[@#$%&*].*")) {
            System.out.println("Erro: senha deve conter um caractere especial (@#$%&*).");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class NumeroHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (!senha.matches(".*\\d.*")) {
            System.out.println("Erro: senha deve conter ao menos um número.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class ConsecutivosHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        for (int i = 0; i < senha.length() - 2; i++) {
            if (Character.isDigit(senha.charAt(i)) &&
                Character.isDigit(senha.charAt(i + 1)) &&
                Character.isDigit(senha.charAt(i + 2))) {

                int a = senha.charAt(i) - '0';
                int b = senha.charAt(i + 1) - '0';
                int c = senha.charAt(i + 2) - '0';

                if (b == a + 1 && c == b + 1) {
                    System.out.println("Erro: senha não pode conter 3 números consecutivos.");
                    return false;
                }
            }
        }
        return next == null || next.handle(login, senha);
    }
}

class TamanhoMinimoHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (senha.length() < 8) {
            System.out.println("Erro: senha deve ter no mínimo 8 caracteres.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

class TamanhoMaximoHandler extends Handler {
    @Override
    public boolean handle(String login, String senha) {
        if (senha.length() > 16) {
            System.out.println("Erro: senha deve ter no máximo 16 caracteres.");
            return false;
        }
        return next == null || next.handle(login, senha);
    }
}

public class ValidadorLoginSenha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o login: ");
        String login = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        

        Handler chain = new LoginHandler();
        chain.setNext(new MaiusculaHandler())
             .setNext(new MinusculaHandler())
             .setNext(new EspecialHandler())
             .setNext(new NumeroHandler())
             .setNext(new ConsecutivosHandler())
             .setNext(new TamanhoMinimoHandler())
             .setNext(new TamanhoMaximoHandler());

        if (chain.handle(login, senha)) {
            System.out.println("Login e senha válidos!");
        } else {
            System.out.println("Falha na validação.");
        }
        }
    }
}