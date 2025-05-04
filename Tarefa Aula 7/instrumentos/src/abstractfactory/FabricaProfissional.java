package abstractfactory;

public class FabricaProfissional implements FabricaInstrumentos {
    @Override
    public Violao criarViolao() {
        return new ViolaoProfissional();
    }

    @Override
    public Piano criarPiano() {
        return new PianoProfissional();
    }
    
    @Override
    public Saxofone criarSaxofone() {
        return new SaxofoneProfissional();
    }
}