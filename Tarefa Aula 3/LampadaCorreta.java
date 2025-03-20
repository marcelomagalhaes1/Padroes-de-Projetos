//Código Correto (Respeitando DIP)
interface Dispositivo {
    void ligar();
    void desligar();
}

public class LampadaCorreta implements Dispositivo {
    public void ligar() {
        // Lógica para ligar a lâmpada
    }

    public void desligar() {
        // Lógica para desligar a lâmpada
    }
}

class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @SuppressWarnings("unused") //anotação para suprimir avisos específicos
    public void acionar() {
        if (/* condição */ true) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }
}