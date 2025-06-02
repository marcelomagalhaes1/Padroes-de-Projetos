public class PassagemAerea {
    private String assento;
    private String classe;
    private double preco;

    public PassagemAerea(String assento) {
        this.assento = assento;
        int fileira = Integer.parseInt(assento.substring(0, assento.length() - 1));
        if (fileira >= 1 && fileira <= 3) {
            this.classe = "1ª Classe";
            this.preco = 500 * 2.5 * 1.5;
        } else if (fileira >= 4 && fileira <= 8) {
            this.classe = "Executiva";
            this.preco = 500 * 2.5;
        } else {
            this.classe = "Econômica";
            this.preco = 500;
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getAssento() {
        return assento;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "Assento: " + assento + " | Classe: " + classe + " | Preço: R$ " + String.format("%.2f", preco);
    }
}