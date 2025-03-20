//Código Correto (Respeitando ISP)
public interface DispositivoCorreto {
    void ligar();
    void desligar();
}

interface ReprodutorMusica {
    void reproduzirMusica();
}

interface ReprodutorVideo {
    void exibirVideo();
}

class Smartphone implements DispositivoCorreto, ReprodutorMusica, ReprodutorVideo {
    public void ligar() { /* Implementação */ }
    public void desligar() { /* Implementação */ }
    public void reproduzirMusica() { /* Implementação */ }
    public void exibirVideo() { /* Implementação */ }
}

class Radio implements DispositivoCorreto, ReprodutorMusica {
    public void ligar() { /* Implementação */ }
    public void desligar() { /* Implementação */ }
    public void reproduzirMusica() { /* Implementação */ }
}