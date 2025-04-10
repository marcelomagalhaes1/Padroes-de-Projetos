package Controller;

import BO.PratoBO;
import model.Prato;
import java.util.List;

/**
 * Controlador para gerenciar o fluxo entre a view e a camada de negócio.
 */
@SuppressWarnings("unused")
public class PratoController {
    private BO.PratoBO pratoBO;
    
    public PratoController() {
        this.pratoBO = new BO.PratoBO();
    }
    
    public void adicionarPrato(String nome, String ingredientes, String tipo, int tempoPreparo) {
        Prato prato = new Prato(0, nome, ingredientes, tipo, tempoPreparo);
        pratoBO.adicionarPrato(prato);
    }
    
    public Prato buscarPratoPorId(int id) {
        return pratoBO.buscarPratoPorId(id);
    }
    
    public List<Prato> listarTodosPratos() {
        return pratoBO.listarTodosPratos();
    }
    
    public void atualizarPrato(int id, String nome, String ingredientes, String tipo, int tempoPreparo) {
        Prato prato = new Prato(id, nome, ingredientes, tipo, tempoPreparo);
        pratoBO.atualizarPrato(prato);
    }
    
    public void removerPrato(int id) {
        pratoBO.removerPrato(id);
    }
    
    public List<Prato> buscarPorTipo(String tipo) {
        return pratoBO.buscarPratosPorTipo(tipo);
    }
    
    public List<Prato> buscarPratosRapidos(int tempoMaximo) {
        return pratoBO.buscarPratosRapidos(tempoMaximo);
    }
}