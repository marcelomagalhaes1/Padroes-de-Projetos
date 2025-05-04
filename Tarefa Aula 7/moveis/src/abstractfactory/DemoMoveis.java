package abstractfactory;

public class DemoMoveis {
    public static void main(String[] args) {
        System.out.println("Criando móveis modernos:");
        ClienteMoveis clienteModerno = new ClienteMoveis(new FabricaModerna());
        clienteModerno.usarMoveis();
        
        System.out.println("\nCriando móveis clássicos:");
        ClienteMoveis clienteClassico = new ClienteMoveis(new FabricaClassica());
        clienteClassico.usarMoveis();
    }
}