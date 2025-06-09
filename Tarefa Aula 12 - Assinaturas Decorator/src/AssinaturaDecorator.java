public abstract class AssinaturaDecorator implements Assinatura {
    protected Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao();
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco();
    }
}
