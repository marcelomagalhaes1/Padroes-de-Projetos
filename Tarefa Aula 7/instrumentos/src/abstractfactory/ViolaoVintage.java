package abstractfactory;

public class ViolaoVintage implements Violao {
    @Override
    public void tocar() {
        System.out.println("Tocando um violão vintage dos anos 1950");
    }
}