//Código Incorreto (Violando DIP)
public class LampadaIncorreta {
    public void ligar() {
        System.out.println("Lâmpada ligada");
    }

    public void desligar() {
        System.out.println("Lâmpada desligada");
    }
}

class Interruptor {
    private LampadaIncorreta lampada;

    public Interruptor(LampadaIncorreta lampada) {
        this.lampada = lampada;
    }

    @SuppressWarnings("unused") //anotação para suprimir avisos específicos
    public void acionar() {
        if (/* condição */ true) {
            lampada.ligar();
        } else {
            lampada.desligar();
        }
    }
}
