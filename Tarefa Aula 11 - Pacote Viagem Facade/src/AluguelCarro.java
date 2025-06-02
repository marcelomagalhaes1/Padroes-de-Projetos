public class AluguelCarro {
    private String tipo;
    private double preco;

    public AluguelCarro(String tipo) {
        this.tipo = tipo;
        double base = 150;
        if (tipo.equalsIgnoreCase("executivo")) {
            base *= 2;
        } else if (tipo.equalsIgnoreCase("luxo")) {
            base *= 4;
        }
        this.preco = base;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Carro: " + tipo + " | Preço: R$ " + String.format("%.2f", preco);
    }
}