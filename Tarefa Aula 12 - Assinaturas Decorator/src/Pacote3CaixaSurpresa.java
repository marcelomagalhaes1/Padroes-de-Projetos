public class Pacote3CaixaSurpresa extends AssinaturaDecorator {
    public Pacote3CaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote 3: Caixa surpresa";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 29.99;
    }
}
