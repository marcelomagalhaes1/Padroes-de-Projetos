//Código Correto (Respeitando OCP)
public interface RelatorioCorreto {
    void gerar();
}

class RelatorioPDF implements RelatorioCorreto {
    public void gerar() {
        // Lógica para gerar relatório em PDF
    }
}

class RelatorioHTML implements RelatorioCorreto {
    public void gerar() {
        // Lógica para gerar relatório em HTML
    }
}
