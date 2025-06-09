public class Pacote5CashBack extends AssinaturaDecorator {
    public Pacote5CashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote 5: Cash Back";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}
