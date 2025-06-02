public class ReservaHotel {
    private String tipoQuarto;
    private int quantidadePessoas;
    private double preco;

    public ReservaHotel(String tipoQuarto, int quantidadePessoas) {
        this.tipoQuarto = tipoQuarto;
        this.quantidadePessoas = quantidadePessoas;
        double base = 200;
        switch (tipoQuarto.toLowerCase()) {
            case "executivo" -> base *= 1.5;
            case "suíte presidencial" -> base *= 1.5 * 3;
        }
        this.preco = base * quantidadePessoas;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    @Override
    public String toString() {
        return "Quarto: " + tipoQuarto + " | Total: R$ " + String.format("%.2f", preco);
    }
}