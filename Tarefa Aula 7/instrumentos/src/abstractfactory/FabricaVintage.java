package abstractfactory;

public class FabricaVintage implements FabricaInstrumentos {
    @Override
    public Violao criarViolao() {
        return new ViolaoVintage();
    }

    @Override
    public Piano criarPiano() {
        return new PianoVintage();
    }
    
    @Override
    public Saxofone criarSaxofone() {
        return new SaxofoneVintage();
    }
}