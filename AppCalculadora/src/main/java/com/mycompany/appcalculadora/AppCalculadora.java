

package com.mycompany.appcalculadora;

import Controlador.CalculadoraControlador;
import Modelo.CalculadoraModelo;
import Vista.CalculadoraVista;



public class AppCalculadora {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);

        controlador.iniciar();
    }
}
