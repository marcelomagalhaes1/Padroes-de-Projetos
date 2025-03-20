//Código Correto (Respeitando LSP)
public class RetanguloCorreto {
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

class Quadrado {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }
}
