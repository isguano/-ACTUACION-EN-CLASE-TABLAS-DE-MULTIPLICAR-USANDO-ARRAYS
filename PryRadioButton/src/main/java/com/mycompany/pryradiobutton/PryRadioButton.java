package com.mycompany.pryradiobutton;

import java.awt.Color;
import view.OperacionesVista;


public class PryRadioButton {

    public static void main(String[] args) {
        
        OperacionesVista op = new OperacionesVista();
        
        op.setVisible(true);
        
        op.setLocationRelativeTo(null);
        op.setTitle("Calculadora" );
        op.setForeground(Color.MAGENTA);

    }
}
