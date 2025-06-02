import java.util.*;

public class Caixa {
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private static final List<Item> CATALOGO = Arrays.asList(
        new Item("Quadrinho", 15.0),
        new Item("Chaveiro", 5.0),
        new Item("Busto", 10.0),
        new Item("Adesivo", 1.0),
        new Item("Poster", 25.0),
        new Item("Camiseta", 25.0),
        new Item("Caneta", 3.0),
        new Item("Miniatura", 20.0)
    );

    public Caixa(Cliente cliente) {
        this.cliente = cliente;
        preencherCaixa();
    }

    private void preencherCaixa() {
        Random rand = new Random();
        int quantidade = cliente.getQuantidadeItens();
        for (int i = 0; i < quantidade; i++) {
            itens.add(CATALOGO.get(rand.nextInt(CATALOGO.size())));
        }
    }

    public void mostrarConteudo() {
        System.out.println("Cliente: " + cliente.getNome() + " (" + cliente.getNivel() + ")");
        System.out.println("Itens da Caixa:");
        double total = 0;
        for (Item item : itens) {
            System.out.println("- " + item);
            total += item.getPreco();
        }
        System.out.printf("Valor total da caixa: R$ %.2f%n", total);
    }
}