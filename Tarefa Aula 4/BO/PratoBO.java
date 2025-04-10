package BO;

import DAO.PratoDAO;
import DAO.PratoDAOImpl;
import model.Prato;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Camada de negócio para gerenciamento de pratos culinários.
 */
public class PratoBO {
    private PratoDAO pratoDAO;
    
    public PratoBO() {
        this.pratoDAO = new PratoDAOImpl();
    }
    
    public void adicionarPrato(Prato prato) {
        if (prato.getNome() == null || prato.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do prato não pode ser vazio");
        }
        if (prato.getTempoPreparo() <= 0) {
            throw new IllegalArgumentException("Tempo de preparo deve ser positivo");
        }
        pratoDAO.adicionarPrato(prato);
    }
    
    public Prato buscarPratoPorId(int id) {
        return pratoDAO.buscarPratoPorId(id);
    }
    
    public List<Prato> listarTodosPratos() {
        return pratoDAO.listarTodosPratos();
    }
    
    public void atualizarPrato(Prato prato) {
        if (pratoDAO.buscarPratoPorId(prato.getId()) == null) {
            throw new IllegalArgumentException("Prato não encontrado");
        }
        pratoDAO.atualizarPrato(prato);
    }
    
    public void removerPrato(int id) {
        pratoDAO.removerPrato(id);
    }
    
    public List<Prato> buscarPratosPorTipo(String tipo) {
        return pratoDAO.buscarPorTipo(tipo);
    }
    
    public List<Prato> buscarPratosRapidos(int tempoMaximo) {
        return pratoDAO.listarTodosPratos().stream()
                      .filter(p -> p.getTempoPreparo() <= tempoMaximo)
                      .collect(Collectors.toList());
    }
}