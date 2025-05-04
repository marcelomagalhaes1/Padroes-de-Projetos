package abstractfactory;

public class ClienteInstrumentos {
    private Violao violao;
    private Piano piano;
    private Saxofone saxofone;
    
    public ClienteInstrumentos(FabricaInstrumentos fabrica) {
        violao = fabrica.criarViolao();
        piano = fabrica.criarPiano();
        saxofone = fabrica.criarSaxofone();
    }
    
    public void tocarInstrumentos() {
        violao.tocar();
        piano.tocar();
        saxofone.tocar();
    }
}