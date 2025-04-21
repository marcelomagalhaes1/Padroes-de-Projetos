import java.util.Scanner;

// Enum com dados do time e do fabricante
enum TimeEnum {
    BRASIL("Brasil", "Nike"),
    FLAMENGO("Flamengo", "Adidas"),
    BOTAFOGO("Botafogo", "Puma"),
    FLUMINENSE("Fluminense", "Umbro"),
    VASCO("Vasco", "Kappa");

    private final String nomeTime;
    private final String fabricante;

    TimeEnum(String nomeTime, String fabricante) {
        this.nomeTime = nomeTime;
        this.fabricante = fabricante;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getFabricante() {
        return fabricante;
    }
}

// Interface do produto
interface CamisaEsportiva {
    void exibirTime();
    void exibirFabrica();
}

// Implementação genérica da camisa
class CamisaPadrao implements CamisaEsportiva {
    private final TimeEnum time;

    public CamisaPadrao(TimeEnum time) {
        this.time = time;
    }

    @Override
    public void exibirTime() {
        System.out.println("Time: " + time.getNomeTime());
    }

    @Override
    public void exibirFabrica() {
        System.out.println("Fabricante: " + time.getFabricante());
    }
}

// Interface da fábrica
interface FabricaEsportiva {
    CamisaEsportiva criarCamisa();
}

// Fábricas concretas
class Nike implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaPadrao(TimeEnum.BRASIL);
    }
}

class Adidas implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaPadrao(TimeEnum.FLAMENGO);
    }
}

class Puma implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaPadrao(TimeEnum.BOTAFOGO);
    }
}

class Umbro implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaPadrao(TimeEnum.FLUMINENSE);
    }
}

class Kappa implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaPadrao(TimeEnum.VASCO);
    }
}

// Fornecedor de fábricas
class FabricaProvider {
    public static FabricaEsportiva getFabrica(String nomeTime) {
        switch (nomeTime.toLowerCase()) {
            case "brasil":
                return new Nike();
            case "flamengo":
                return new Adidas();
            case "botafogo":
                return new Puma();
            case "fluminense":
                return new Umbro();
            case "vasco":
                return new Kappa();
            default:
                throw new IllegalArgumentException("Time não encontrado!");
        }
    }
}

// Cliente
public class LojaCamisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um time para ver sua camisa:");
        for (TimeEnum time : TimeEnum.values()) {
            System.out.println("- " + time.getNomeTime());
        }

        System.out.print("Digite o nome do time: ");
        String timeEscolhido = scanner.nextLine();

        try {
            FabricaEsportiva fabrica = FabricaProvider.getFabrica(timeEscolhido);
            CamisaEsportiva camisa = fabrica.criarCamisa();

            System.out.println("\nDetalhes da Camisa:");
            camisa.exibirTime();
            camisa.exibirFabrica();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
