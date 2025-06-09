public class Pacote2FreteGratis extends AssinaturaDecorator {
    public Pacote2FreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote 2: Frete Grátis";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 9.99;
    }
}
