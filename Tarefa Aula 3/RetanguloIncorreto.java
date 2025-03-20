//Código Incorreto (Violando LSP)
public class RetanguloIncorreto {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea() {
        return largura * altura;
    }
}

class Quadrado extends RetanguloIncorreto {
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura;
    }
}
