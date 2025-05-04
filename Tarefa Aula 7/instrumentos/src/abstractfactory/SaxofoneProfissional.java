package abstractfactory;

public class SaxofoneProfissional implements Saxofone {
    @Override
    public void tocar() {
        System.out.println("Tocando um saxofone profissional Selmer");
    }
}