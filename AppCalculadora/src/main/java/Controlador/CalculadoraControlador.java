package Controlador;

import Modelo.CalculadoraModelo;
import Vista.CalculadoraVista;

public class CalculadoraControlador {
    private final CalculadoraModelo modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        vista.mostrarMensaje("=== Calculadora Avanzada ===");
        while (continuar) {
            String opcion = vista.solicitarTexto("\nMenú de opciones:\n1. Realizar una operación\n2. Salir\nSelecciona una opción: ");

         switch (opcion) {
             
             case "1" :
                 realizarOperacion();
                 break;

             case "2":
             continuar = false;
             vista.mostrarMensaje("Gracias por usar la calculadora. ¡Adiós!");
             break;

         default:
             vista.mostrarMensaje("Opción no válida. Intenta de nuevo.");
             break; // Aunque no es obligatorio, es una buena práctica incluirlo.
        }

        }
    }

    private void realizarOperacion() {
        try {
            String operacion = vista.solicitarOperacion();

            double resultado = 0;
            if (operacion.equals("raiz")) {
                double numero = vista.solicitarNumero("Ingresa el número para calcular la raíz cuadrada: ");
                resultado = modelo.raizCuadrada(numero);
                vista.mostrarMensaje("Resultado: √" + numero + " = " + resultado);
            } else {
                double numero1 = vista.solicitarNumero("Ingresa el primer número: ");
                double numero2 = vista.solicitarNumero("Ingresa el segundo número: ");


                
                switch (operacion) {
                    case "suma":
                        resultado = modelo.sumar(numero1, numero2);
                        break;

                    case "resta":
                        resultado = modelo.restar(numero1, numero2);
                        break;

                    case "multiplicación":
                        resultado = modelo.multiplicar(numero1, numero2);
                        break;

                    case "división":
                        if (numero2 == 0) {
                            vista.mostrarMensaje("Error: No se puede dividir entre cero.");
                            return;
                        }
                        resultado = modelo.dividir(numero1, numero2);
                        break;

                    case "potencia":
                        resultado = modelo.potencia(numero1, numero2);
                        break;

                    default:
                        vista.mostrarMensaje("Operación no válida. Intenta de nuevo.");
                        return;
                }

                
                
                vista.mostrarMensaje("Resultado: " + resultado);
            }
        } catch (ArithmeticException e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }
}

