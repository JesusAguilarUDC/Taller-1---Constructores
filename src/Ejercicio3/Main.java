package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Maria Lurde", 20);
        estudiante2.mostrarDetalles();

        System.out.println();

        Estudiante estudiante3 = new Estudiante("Gabriela Castro", 22, "Física");
        estudiante3.mostrarDetalles();
    }
}
