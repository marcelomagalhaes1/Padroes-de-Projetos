package DAO;

import java.util.List;
import model.Prato;

/**
 * Interface para operações de persistência de pratos culinários.
 */
public interface PratoDAO {
    void adicionarPrato(Prato prato);
    Prato buscarPratoPorId(int id);
    List<Prato> listarTodosPratos();
    void atualizarPrato(Prato prato);
    void removerPrato(int id);
    List<Prato> buscarPorTipo(String tipo);
}