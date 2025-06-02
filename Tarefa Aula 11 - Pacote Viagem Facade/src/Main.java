import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas", "123.456.789-00");
        Cliente c2 = new Cliente("Ana", "987.654.321-00");

        PacoteViagemFacade pacote = new PacoteViagemFacade(
            Arrays.asList(c1, c2),
            "2A",                      // assento
            "Executivo",              // tipo de quarto
            "Luxo",                   // tipo de carro
            "Crédito",                // forma de pagamento
            4                         // parcelas
        );

        pacote.resumoPacote();
    }
}