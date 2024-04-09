public class Livro
{
  private String ISBN;


  private String titulo;

  private Autor autor; 

  public Livro (String ISBN, String titulo, Autor autor)
  {
this.ISBN = ISBN;

this.titulo = titulo;

this.autor = autor;

  }
  public String getISBN ()
  {
return this.ISBN;

  }

public void setISBN (String)
  {
this.ISBN = ISBN;

  }
  
  public String getTitulo ()
  {
return this.titulo = titulo;
