public class Pacote4CartaoPlatinum extends AssinaturaDecorator {
    public Pacote4CartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote 4: Cartão Platinum";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 49.99;
    }
}
