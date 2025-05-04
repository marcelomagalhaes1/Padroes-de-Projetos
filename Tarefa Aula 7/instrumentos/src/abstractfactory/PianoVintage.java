package abstractfactory;

public class PianoVintage implements Piano {
    @Override
    public void tocar() {
        System.out.println("Tocando um piano vintage de 1890");
    }
}