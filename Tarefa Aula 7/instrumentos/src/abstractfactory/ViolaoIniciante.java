package abstractfactory;

public class ViolaoIniciante implements Violao {
    @Override
    public void tocar() {
        System.out.println("Tocando um violão básico para iniciantes");
    }
}