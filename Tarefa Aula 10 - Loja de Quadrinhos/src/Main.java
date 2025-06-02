public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcelo", "Ouro");
        Caixa caixa1 = new Caixa(cliente1);
        caixa1.mostrarConteudo();

        System.out.println();

        Cliente cliente2 = new Cliente("Fernando", "Platina");
        Caixa caixa2 = new Caixa(cliente2);
        caixa2.mostrarConteudo();
    }
}