package abstractfactory;

public class SofaClassico implements Sofa {
    @Override
    public void deitar() {
        System.out.println("Deitando em um sofá clássico de couro");
    }
}