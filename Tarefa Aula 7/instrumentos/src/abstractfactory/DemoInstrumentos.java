package abstractfactory;

public class DemoInstrumentos {
    public static void main(String[] args) {
        System.out.println("Criando instrumentos profissionais:");
        ClienteInstrumentos clienteProfissional = new ClienteInstrumentos(new FabricaProfissional());
        clienteProfissional.tocarInstrumentos();
        
        System.out.println("\nCriando instrumentos para iniciantes:");
        ClienteInstrumentos clienteIniciante = new ClienteInstrumentos(new FabricaIniciante());
        clienteIniciante.tocarInstrumentos();
        
        System.out.println("\nCriando instrumentos vintage:");
        ClienteInstrumentos clienteVintage = new ClienteInstrumentos(new FabricaVintage());
        clienteVintage.tocarInstrumentos();
    }
}