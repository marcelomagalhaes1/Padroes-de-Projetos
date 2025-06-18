// CatalogoIterator.java
class CatalogoIterator implements Iterator<Filme> {
    private Filme[] filmes;
    private int posicao = 0;

    public CatalogoIterator(Filme[] filmes) {
        this.filmes = filmes;
    }

    @Override
    public boolean hasNext() {
        return posicao < filmes.length && filmes[posicao] != null;
    }

    @Override
    public Filme next() {
        return filmes[posicao++];
    }
}