public class Cliente {
    private String nome;
    private String nivel;

    public Cliente(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getQuantidadeItens() {
        return switch (nivel.toLowerCase()) {
            case "bronze" -> 3;
            case "prata" -> 5;
            case "ouro" -> 7;
            case "platina" -> 10;
            default -> 0;
        };
    }
}