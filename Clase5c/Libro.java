package Clase5;

public class Libro {


    private int isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro(){
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
    }

    public Libro(int unIsbn, String unTitulo, String unAutor, int nroPaginas ){
        this.isbn = unIsbn;
        this.titulo = unTitulo;
        this.autor = unAutor;
        this.nroPaginas = nroPaginas;

    }

    public void setIsbn (int unIsbn){ this.isbn = unIsbn;}
    public int getIsbn() {return this.isbn;}

    public void setTitulo(String unTitulo){ this.titulo= unTitulo;}
    public String getTitulo() {return this.titulo;}

    public void setAutor(String unAutor){ this.autor= unAutor;}
    public String getAutor() {return this.autor;}

    public void setNroPaginas (int nroPaginas){ this.nroPaginas = nroPaginas;}
    public int getNroPaginas (){return this.nroPaginas;}

    public String toString() {

        return "El libro con ISBN " + this.isbn + " creado por el autor " + this.autor +
               " tine "+ this.nroPaginas + " paginas.";

    }

}
