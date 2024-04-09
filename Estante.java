public class Estante {
    private List<String> titulos;
    private List<Livro> livros;

    public Estante() {
        titulos = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        titulos.add(livro.getTitulo());
    }

    public static void main(String[] args) {
        Estante estante = new Estante();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("Harry potter", "J. K. Rowling");

        estante.adicionarLivro(livro1);
        estante.adicionarLivro(livro2);

        System.out.println("Títulos dos livros na estante:");
        for (String titulo : estante.getTitulos()) {
            System.out.println(titulo);
        }
    }
}

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
