
package vista;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
       configurarTabla();
    }
    ArrayList<String>votaciones=new ArrayList<>();
    
    private void configurarBotones() {
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(noboa);
        grupo.add(luisa);
        grupo.add(andrea);
    }

    private void configurarTabla() {
        DefaultTableModel mt=new DefaultTableModel();

        mt.addColumn("Candidato");
        mt.addColumn("Partido");
        mt.addColumn("Lista");
        mt.addColumn("Votos");
        
        
        // Agregamos los candidatos iniciales a la tabla
        mt.addRow(new Object[]{"Daniel Noboa", "ADN", "7", 0});
        mt.addRow(new Object[]{"Luisa González", "RC", "5", 0});
        mt.addRow(new Object[]{"Andrea González", "PSC", "3", 0});
        tabla.setModel(mt);

    }    

    
    private void determinarGanador() {
        int votosNoboa = (int) tabla.getValueAt(0, 3);
        int votosLuisa = (int) tabla.getValueAt(1, 3);
        int votosAndrea = (int) tabla.getValueAt(2, 3);

        String ganador = "Empate";
        if (votosNoboa > votosLuisa && votosNoboa > votosAndrea) {
            ganador = "Daniel Noboa";
        } else if (votosLuisa > votosNoboa && votosLuisa > votosAndrea) {
            ganador = "Luisa González";
        } else if (votosAndrea > votosNoboa && votosAndrea > votosLuisa) {
            ganador = "Andrea González";
        }
        
        Resultado.setText(ganador);
    } 
    
    private void actualizarTabla() {
        int votosNoboa = 0, votosLuisa = 0, votosAndrea = 0;
        for (String voto : votaciones) {
            if (voto.equals("Daniel Noboa")) votosNoboa++;
            if (voto.equals("Luisa González")) votosLuisa++;
            if (voto.equals("Andrea González")) votosAndrea++;
        }
        
        tabla.setValueAt(votosNoboa, 0, 3);
        tabla.setValueAt(votosLuisa, 1, 3);
        tabla.setValueAt(votosAndrea, 2, 3);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        noboa = new javax.swing.JRadioButton();
        luisa = new javax.swing.JRadioButton();
        andrea = new javax.swing.JRadioButton();
        Votar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CNE");

        jLabel2.setText("Ingrese su nombre:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese su cedula");

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel4.setText("ELIGA SU CANDIDATO DE PREFERENCIA");

        noboa.setText("DANIEL NOBOA - AND-LISTA 7");
        noboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noboaActionPerformed(evt);
            }
        });

        luisa.setText("LUISA GONZALEZ - RC-LISTA 5");
        luisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luisaActionPerformed(evt);
            }
        });

        andrea.setText("ANDREA GONZALEZ -PSC-LISTA 3");
        andrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andreaActionPerformed(evt);
            }
        });

        Votar.setText("Registra Voto");
        Votar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotarActionPerformed(evt);
            }
        });

        jLabel5.setText("El Presidente del Ecuador es:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(377, 377, 377)
                                    .addComponent(jLabel1))
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(noboa)
                                                .addComponent(luisa))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(andrea)
                                            .addGap(136, 136, 136)))
                                    .addComponent(Votar)
                                    .addGap(188, 188, 188))))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noboa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andrea)
                    .addComponent(Votar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void luisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luisaActionPerformed

    private void andreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andreaActionPerformed

    private void noboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noboaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noboaActionPerformed

    private void VotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotarActionPerformed
        String nombre = txt_nombre.getText().trim();
        String cedula = txt_cedula.getText().trim();
        
        if (nombre.isEmpty() || cedula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar su nombre y cédula.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String candidato = "";
        if (noboa.isSelected()) {
            candidato = "Daniel Noboa";
        } else if (luisa.isSelected()) {
            candidato = "Luisa González";
        } else if (andrea.isSelected()) {
            candidato = "Andrea González";
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un candidato.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregamos el voto a la lista
        votaciones.add(candidato);
        actualizarTabla();
        determinarGanador();
        
        // Limpiar campos y selección
        txt_nombre.setText("");
        txt_cedula.setText("");
        noboa.setSelected(false);
        luisa.setSelected(false);
        andrea.setSelected(false);
      

    
        // TODO add your handling code here:
    }//GEN-LAST:event_VotarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton Votar;
    private javax.swing.JRadioButton andrea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton luisa;
    private javax.swing.JRadioButton noboa;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}






   

