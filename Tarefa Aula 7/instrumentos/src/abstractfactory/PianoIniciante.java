package abstractfactory;

public class PianoIniciante implements Piano {
    @Override
    public void tocar() {
        System.out.println("Tocando um piano elétrico básico");
    }
}