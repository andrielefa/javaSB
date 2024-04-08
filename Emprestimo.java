import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private List<Livro> livrosEmprestados;

    public Emprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.livrosEmprestados = new ArrayList<>();
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }


    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo(LocalDate.of(2024, 4, 10));

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("Harry potter", "j.K rowling");

        emprestimo.adicionarLivro(livro1);
        emprestimo.adicionarLivro(livro2);

        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Livros Emprestados:");
        for (Livro livro : emprestimo.getLivrosEmprestados()) {
            System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor());
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
