// Filme.java
class Filme {
    private String titulo;
    private String genero;

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ")";
    }
}