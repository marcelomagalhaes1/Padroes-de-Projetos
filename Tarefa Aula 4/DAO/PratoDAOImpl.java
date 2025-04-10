package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Prato;

/**
 * Implementação em memória do DAO de pratos culinários.
 */
public class PratoDAOImpl implements PratoDAO {
    private static int proximoId = 1;
    private List<Prato> pratos = new ArrayList<>();
    
    @Override
    public void adicionarPrato(Prato prato) {
        prato.setId(proximoId++);
        pratos.add(prato);
    }
    
    @Override
    public Prato buscarPratoPorId(int id) {
        return pratos.stream()
                     .filter(p -> p.getId() == id)
                     .findFirst()
                     .orElse(null);
    }
    
    @Override
    public List<Prato> listarTodosPratos() {
        return new ArrayList<>(pratos);
    }
    
    @Override
    public void atualizarPrato(Prato pratoAtualizado) {
        for (int i = 0; i < pratos.size(); i++) {
            Prato prato = pratos.get(i);
            if (prato.getId() == pratoAtualizado.getId()) {
                pratos.set(i, pratoAtualizado);
                return;
            }
        }
    }
    
    @Override
    public void removerPrato(int id) {
        pratos.removeIf(prato -> prato.getId() == id);
    }
    
    @Override
    public List<Prato> buscarPorTipo(String tipo) {
        return pratos.stream()
                    .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                    .collect(Collectors.toList());
    }
}