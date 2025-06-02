import java.util.List;

public class PacoteViagemFacade {
    private List<Cliente> clientes;
    private PassagemAerea passagem;
    private ReservaHotel hotel;
    private AluguelCarro carro;
    private String formaPagamento;
    private int parcelas;

    public PacoteViagemFacade(List<Cliente> clientes, String assento, String tipoQuarto, String tipoCarro, String formaPagamento, int parcelas) {
        this.clientes = clientes;
        this.passagem = new PassagemAerea(assento);
        this.hotel = new ReservaHotel(tipoQuarto, clientes.size());
        this.carro = new AluguelCarro(tipoCarro);
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
    }

    public void resumoPacote() {
        System.out.println("=== Clientes ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("=== Detalhes da Compra ===");
        System.out.println(passagem);
        System.out.println(hotel);
        System.out.println(carro);

        double total = passagem.getPreco() * clientes.size() + hotel.getPreco() + carro.getPreco();
        double totalFinal = Pagamento.calcularTotal(total, formaPagamento, parcelas);

        System.out.printf("Forma de Pagamento: %s", formaPagamento);
        if (formaPagamento.equalsIgnoreCase("crédito")) {
            System.out.printf(" (%d parcelas)%n", parcelas);
        } else {
            System.out.println();
        }
        System.out.printf("Valor bruto: R$ %.2f%n", total);
        System.out.printf("Valor final: R$ %.2f%n", totalFinal);
    }
}