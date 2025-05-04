package abstractfactory;

public class MesaClassica implements Mesa {
    @Override
    public void colocarObjetos() {
        System.out.println("Colocando objetos em uma mesa clássica de madeira entalhada");
    }
}