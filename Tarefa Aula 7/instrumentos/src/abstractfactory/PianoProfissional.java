package abstractfactory;

public class PianoProfissional implements Piano {
    @Override
    public void tocar() {
        System.out.println("Tocando um piano de cauda profissional");
    }
}