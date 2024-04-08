import java.time.LocalDate;

public class ItemEmprestimo {
    private String titulo;
    private LocalDate dataDevolucao;

    public ItemEmprestimo(String titulo, LocalDate dataDevolucao) {
        this.titulo = titulo;
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public static void main(String[] args) {

        ItemEmprestimo item = new ItemEmprestimo("Dom Casmurro", LocalDate.of(2024, 4, 15));

        System.out.println("Título: " + item.getTitulo());
        System.out.println("Data de Devolução: " + item.getDataDevolucao());
    }
}
