package Ejercicio1;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto (valores predeterminados)
    public Libro() {
        this.id = 0;
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado (permite asignar valores específicos)
    public Libro(int id, String titulo, String autor, int numeroPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Identificacion: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de Páginas: " + this.numeroPaginas);
    }
}

