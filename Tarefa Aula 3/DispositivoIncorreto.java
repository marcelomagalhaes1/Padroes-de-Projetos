//Código Incorreto (Violando ISP)
public interface DispositivoIncorreto {
    void ligar();
    void desligar();
    void reproduzirMusica();
    void exibirVideo();
}

class Smartphone implements DispositivoIncorreto {
    public void ligar() { /* Implementação */ }
    public void desligar() { /* Implementação */ }
    public void reproduzirMusica() { /* Implementação */ }
    public void exibirVideo() { /* Implementação */ }
}

class Radio implements DispositivoIncorreto {
    public void ligar() { /* Implementação */ }
    public void desligar() { /* Implementação */ }
    public void reproduzirMusica() { /* Implementação */ }
    public void exibirVideo() {
        throw new UnsupportedOperationException("Rádio não exibe vídeo");
    }
}
