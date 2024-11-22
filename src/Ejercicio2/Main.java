package Ejercicio2;

public class Main {
public static void main(String[] args) {
    // Usando el constructor por defecto
    CuentaBancaria cuenta1 = new CuentaBancaria();
    cuenta1.mostrarDetalles();

    System.out.println(); // Línea en blanco

    // Usando el constructor parametrizado (numeroCuenta y tipoCuenta)
    CuentaBancaria cuenta2 = new CuentaBancaria("123456789", "Corriente");
    cuenta2.mostrarDetalles();

    System.out.println(); // Línea en blanco

    // Usando el constructor sobrecargado (numeroCuenta, saldo, tipoCuenta)
    CuentaBancaria cuenta3 = new CuentaBancaria("987654321", 1500.75, "Ahorros");
    cuenta3.mostrarDetalles();
    }
}
