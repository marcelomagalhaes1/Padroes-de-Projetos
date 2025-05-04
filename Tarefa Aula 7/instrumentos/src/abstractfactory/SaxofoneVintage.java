package abstractfactory;

public class SaxofoneVintage implements Saxofone {
    @Override
    public void tocar() {
        System.out.println("Tocando um saxofone vintage dos anos 1920");
    }
}