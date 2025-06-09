public class Pacote1MultiplosDispositivos extends AssinaturaDecorator {
    public Pacote1MultiplosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote 1: Vários dispositivos";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}
