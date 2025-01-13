package Vista;

import java.util.Scanner;

public class CalculadoraVista {
    
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor ingresa un número.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public String solicitarOperacion() {
        System.out.print("Selecciona una operación (suma, resta, multiplicación, división, potencia, raiz): ");
        return scanner.next().toLowerCase();
    }

    public String solicitarTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.next().toLowerCase();
    }
}

