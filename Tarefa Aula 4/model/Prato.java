package model;

/**
 * Classe que representa um prato culinário no sistema.
 * Contém informações sobre nome, ingredientes, tipo e tempo de preparo.
 */
public class Prato {
    private int id;
    private String nome;
    private String ingredientes;
    private String tipo; // Entrada, Principal, Sobremesa, etc.
    private int tempoPreparo; // Em minutos
    
    public Prato() {}
    
    public Prato(int id, String nome, String ingredientes, String tipo, int tempoPreparo) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.tempoPreparo = tempoPreparo;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getTempoPreparo() {
        return tempoPreparo;
    }
    
    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
    
    @Override
    public String toString() {
        return "Prato [ID=" + id + ", Nome=" + nome + ", Tipo=" + tipo 
             + ", Tempo=" + tempoPreparo + "min]\nIngredientes: " + ingredientes;
    }
}