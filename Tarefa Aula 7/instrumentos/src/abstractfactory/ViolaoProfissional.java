package abstractfactory;

public class ViolaoProfissional implements Violao {
    @Override
    public void tocar() {
        System.out.println("Tocando um violão profissional de alta qualidade");
    }
}