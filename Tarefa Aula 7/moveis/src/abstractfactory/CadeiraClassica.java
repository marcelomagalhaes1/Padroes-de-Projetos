package abstractfactory;

public class CadeiraClassica implements Cadeira {
    @Override
    public void sentar() {
        System.out.println("Sentando em uma cadeira clássica de madeira maciça");
    }
}