package abstractfactory;

public class MesaModerna implements Mesa {
    @Override
    public void colocarObjetos() {
        System.out.println("Colocando objetos em uma mesa moderna de vidro e metal");
    }
}