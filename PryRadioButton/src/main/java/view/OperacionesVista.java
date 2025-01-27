/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.OperacionesControlador;

/**
 *
 * @author hp
 */
public class OperacionesVista extends javax.swing.JFrame {
    
    public OperacionesControlador opcon = new OperacionesControlador();
    public double n1,n2;
    public OperacionesVista() {
        initComponents();   
    } 
    public void ObtenerNumeros(){
         
        n1=Integer.parseInt(txt_numeroUno.getText());
        n2=Integer.parseInt(txt_numeroDos.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_numeroUno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_numeroDos = new javax.swing.JTextField();
        op_sumar = new javax.swing.JRadioButton();
        op_restar = new javax.swing.JRadioButton();
        op_multiplicar = new javax.swing.JRadioButton();
        op_dividir = new javax.swing.JRadioButton();
        resultado = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        cbx_opciones = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setText("INGRESE NUMERO 1:");

        txt_numeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeroUnoActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE NUMERO 2");

        op_sumar.setText("SUMAR");
        op_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumar(evt);
            }
        });

        op_restar.setText("RESTAR");
        op_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restar(evt);
            }
        });

        op_multiplicar.setText("MULTIPLICAR");
        op_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar(evt);
            }
        });

        op_dividir.setText("DIVIDIR");
        op_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividir(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        resultado.setForeground(new java.awt.Color(153, 0, 153));
        resultado.setText("RESULTADO:");

        result.setText("0.00");

        jLabel3.setText("BIENVENIDO AL SISTEMA ");

        jCheckBox1.setText("SUMAR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarCheckBok(evt);
            }
        });

        jCheckBox2.setText("RESTAR");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarCheckBok(evt);
            }
        });

        jCheckBox3.setText("MULTIPLICAR");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarCheckBok(evt);
            }
        });

        jCheckBox4.setText("DIVIDIR");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirCheckBok(evt);
            }
        });

        cbx_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR" }));
        cbx_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionComboBok(evt);
            }
        });

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(txt_numeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_numeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op_sumar)
                            .addComponent(op_restar)
                            .addComponent(op_multiplicar)
                            .addComponent(op_dividir))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox2))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(cbx_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_numeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(txt_numeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_sumar)
                    .addComponent(jCheckBox1)
                    .addComponent(cbx_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_restar)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_multiplicar)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_dividir)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeroUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numeroUnoActionPerformed

    private void sumar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumar

        ObtenerNumeros(); 
        double resultado1 = opcon.sumar(n1, n2);
        result.setText(String.valueOf(resultado1));
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_sumar

    private void dividir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividir
        // TODO add your handling code here:
        ObtenerNumeros();
        double resultado1 = opcon.dividir(n1, n2);
        result.setText(String.valueOf(resultado1));
        
    }//GEN-LAST:event_dividir

    private void restar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restar
        ObtenerNumeros();
        double resultado1 = opcon.restar(n1, n2);
        result.setText(String.valueOf(resultado1));

    }//GEN-LAST:event_restar

    private void multiplicar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar
        // TODO add your handling code here:
        ObtenerNumeros();
        double resultado1 = opcon.multiplicar(n1, n2);
        result.setText(String.valueOf(resultado1));
       
    }//GEN-LAST:event_multiplicar

    private void sumarCheckBok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarCheckBok

        sumar(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_sumarCheckBok

    private void restarCheckBok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarCheckBok
 
        restar(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_restarCheckBok

    private void multiplicarCheckBok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarCheckBok
        

        multiplicar(evt);
// TODO add your handling code here:
    }//GEN-LAST:event_multiplicarCheckBok

    private void dividirCheckBok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirCheckBok
       dividir(evt);        

// TODO add your handling code here:
    }//GEN-LAST:event_dividirCheckBok

    private void OpcionComboBok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionComboBok

        String nombreOpcion=(String) cbx_opciones.getSelectedItem();

        switch (nombreOpcion){
            case "SUMAR":
                sumar(evt);
                break;
            case "RESTAR":
                restar(evt);
                break;
            case "MULTIPLICAR":
                multiplicar(evt);
                break;
            case "DIVIDIR":
                dividir(evt);
                break;    
    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionComboBok

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_opciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op_dividir;
    private javax.swing.JRadioButton op_multiplicar;
    private javax.swing.JRadioButton op_restar;
    private javax.swing.JRadioButton op_sumar;
    private javax.swing.JLabel result;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txt_numeroDos;
    private javax.swing.JTextField txt_numeroUno;
    // End of variables declaration//GEN-END:variables
}
