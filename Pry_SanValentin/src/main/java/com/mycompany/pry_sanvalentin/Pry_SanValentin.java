//Main principal 
package com.mycompany.pry_sanvalentin;

import Vista.Principal;
import java.awt.Color;

public class Pry_SanValentin {

    public static void main(String[] args) {
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("BUZON DE CARTAS");
        p.setBackground(Color.yellow);
    }
}
