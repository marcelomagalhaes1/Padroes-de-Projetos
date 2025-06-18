// CatalogoFilmes.java
class CatalogoFilmes {
    private Filme[] filmes;
    private int tamanho = 0;

    public CatalogoFilmes(int capacidade) {
        filmes = new Filme[capacidade];
    }

    public void adicionarFilme(Filme filme) {
        if (tamanho < filmes.length) {
            filmes[tamanho++] = filme;
        }
    }

    public CatalogoIterator criarIterator() {
        return new CatalogoIterator(filmes);
    }
}