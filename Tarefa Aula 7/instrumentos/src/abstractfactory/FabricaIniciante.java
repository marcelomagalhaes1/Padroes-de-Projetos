package abstractfactory;

public class FabricaIniciante implements FabricaInstrumentos {
    @Override
    public Violao criarViolao() {
        return new ViolaoIniciante();
    }

    @Override
    public Piano criarPiano() {
        return new PianoIniciante();
    }
    
    @Override
    public Saxofone criarSaxofone() {
        return new SaxofoneIniciante();
    }
}