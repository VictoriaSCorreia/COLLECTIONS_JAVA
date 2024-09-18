package ordenacao.comparable;

// É usado na própria classe a ser ordenada
class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    Livro(String titulo, String autor, int ano){
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // ordernar por ano
    public int compareTo(Livro l) {
        return Integer.compare(this.ano, l.ano);
        }
    
    // ordenar por titulo ou autor
    /* 
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    } */
}