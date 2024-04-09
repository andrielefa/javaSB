public class Livro
{
  private String ISBN;


  private String titulo;

  private Autor autor; //-> Referencia para o autor.

  public Livro (String ISBN, String titulo, Autor autor)
  {
this.ISBN = ISBN;

this.titulo = titulo;

this.autor = autor;

  }
  //Getter/Setter ISBN
  public String getISBN ()
  {
return this.ISBN;

  }


  public void setISBN (String)
  {
this.ISBN = ISBN;

  }
  //Getter/Setter Titulo
  public String getTitulo ()
  {
return this.titulo = titulo;
