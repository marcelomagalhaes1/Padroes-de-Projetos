package abstractfactory;

public class ClienteMoveis {
    private Cadeira cadeira;
    private Mesa mesa;
    private Sofa sofa;
    
    public ClienteMoveis(FabricaMoveis fabrica) {
        cadeira = fabrica.criarCadeira();
        mesa = fabrica.criarMesa();
        sofa = fabrica.criarSofa();
    }
    
    public void usarMoveis() {
        cadeira.sentar();
        mesa.colocarObjetos();
        sofa.deitar();
    }
}