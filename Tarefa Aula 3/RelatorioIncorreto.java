//Código Incorreto (Violando OCP)
public class RelatorioIncorreto {
    public void gerarRelatorio(String tipo) {
        if (tipo.equals("PDF")) {
            // Lógica para gerar relatório em PDF

        } else if (tipo.equals("HTML")) {
            // Lógica para gerar relatório em HTML
        }
    }
}