package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Usando el constructor por defecto
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println(); // Línea en blanco

        // Usando el constructor parametrizado
        Libro libro2 = new Libro(33012, "El gran gigante bonachon", "Roald Dalh", 272);
        libro2.mostrarDetalles();
    }
}
