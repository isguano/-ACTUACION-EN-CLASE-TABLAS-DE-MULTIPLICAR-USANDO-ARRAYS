package Vista;

import Controlador.Buzon_SanValentin_Singleton;
import Modelo.Contenido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        configurarTabla();
    }
    DefaultTableModel mt=new DefaultTableModel();
    
    private void configurarTabla() {
        mt.addColumn("Remitente");
        mt.addColumn("Destinatario");
        mt.addColumn("Mensaje");
        tabla.setModel(mt);
    }    
    //mandara al controlador los mensajes
    public void actualizarMensaje() {
        mt.setRowCount(0);
        for (Contenido mc : Buzon_SanValentin_Singleton.getInstancia().ObtenerMensajes()) {
            mt.addRow(new Object[]{mc.remitario,mc.destinario,mc.contenido});
        }
    }
    //captura de datos y anañade al controlador en un arrayList
    public void Agregrar(){

        String remitente = txt_remitente.getText();
        String destinario = txt_destinario.getText();
        String mensaje = txt_mensaje.getText();
        if (remitente.isEmpty() || destinario.isEmpty() || mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese datos en los campos vacios  ");
            return;
        }
        Buzon_SanValentin_Singleton.getInstancia().agregar(remitente, destinario, mensaje); 
        actualizarMensaje();
        limpiarCampos();
    }
    //Limpieza de campos de entrada
    public void limpiarCampos(){
        txt_remitente.setText("");
        txt_destinario.setText("");
        txt_mensaje.setText("");        
    }
    //metodo para borrar 
    public void borrarMensaje(){
        int filaSeleccionada  = tabla.getSelectedRow();    
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un mensaje para borrar.");
            return;
        }
        Buzon_SanValentin_Singleton.getInstancia().borrar(filaSeleccionada);
        actualizarMensaje();
    } 
    
    //metodo para editar mensaje 
    public void editarMensaje() {                                           
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            String nuevoRemitente = JOptionPane.showInputDialog(this, "Nuevo remitente:", mt.getValueAt(filaSeleccionada, 0));
            String nuevoDestinario = JOptionPane.showInputDialog(this, "Nuevo destinatario:", mt.getValueAt(filaSeleccionada, 1));
            String nuevoMensaje = JOptionPane.showInputDialog(this, "Nuevo mensaje:", mt.getValueAt(filaSeleccionada, 2));

            if (nuevoRemitente != null && nuevoDestinario != null && nuevoMensaje != null) {
                mt.setValueAt(nuevoRemitente, filaSeleccionada, 0);
                mt.setValueAt(nuevoDestinario, filaSeleccionada, 1);
                mt.setValueAt(nuevoMensaje, filaSeleccionada, 2);
                Buzon_SanValentin_Singleton.getInstancia().editar(nuevoRemitente, nuevoDestinario, nuevoMensaje);
                actualizarMensaje();
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para editar");
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_remitente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_destinario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mensaje = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bot_enviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bot_borrar = new javax.swing.JButton();
        bot_editar = new javax.swing.JButton();
        bot_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DE:");

        jLabel2.setText("PARA");

        txt_mensaje.setColumns(20);
        txt_mensaje.setRows(5);
        jScrollPane2.setViewportView(txt_mensaje);

        jLabel3.setText("Ingrese el mensaje");

        bot_enviar.setText("Enviar carta");
        bot_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_enviarActionPerformed(evt);
            }
        });

        jLabel4.setText("Buzon de cartas aplicando Singleton");

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
        jScrollPane3.setViewportView(tabla);

        bot_borrar.setText("Borrar Mensaje");
        bot_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_borrarActionPerformed(evt);
            }
        });

        bot_editar.setText("Editar carta");
        bot_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_editarActionPerformed(evt);
            }
        });

        bot_salir.setText("Salir");
        bot_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_remitente)
                                    .addComponent(txt_destinario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bot_enviar)
                        .addGap(41, 41, 41)))
                .addComponent(jLabel4)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot_editar)
                            .addComponent(bot_borrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bot_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_destinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bot_enviar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(bot_borrar)
                                .addGap(18, 18, 18)
                                .addComponent(bot_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bot_salir)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_enviarActionPerformed

        Agregrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_enviarActionPerformed

    private void bot_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_borrarActionPerformed

        borrarMensaje();
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_borrarActionPerformed

    private void bot_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_editarActionPerformed

        editarMensaje();
        // TODO add your handling code here:        
    }//GEN-LAST:event_bot_editarActionPerformed

    private void bot_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_salirActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_borrar;
    private javax.swing.JButton bot_editar;
    private javax.swing.JButton bot_enviar;
    private javax.swing.JButton bot_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_destinario;
    private javax.swing.JTextArea txt_mensaje;
    private javax.swing.JTextField txt_remitente;
    // End of variables declaration//GEN-END:variables
}
/*
// Vista: Principal.java
package Vista;

import Controlador.Buzon_SanValentin_Singleton;
import Modelo.Contenido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Principal extends javax.swing.JFrame {

    private final DefaultTableModel mt = new DefaultTableModel();
    
    public Principal() {
        initComponents();
        configurarTabla();
        actualizarTabla();
    }
    
    private void configurarTabla() {
        mt.addColumn("Remitente");
        mt.addColumn("Destinatario");
        mt.addColumn("Mensaje");
        tabla.setModel(mt);
    }
    
    private void actualizarTabla() {
        mt.setRowCount(0);
        for (Contenido mensaje : Buzon_SanValentin_Singleton.getInstancia().ObtenerMensajes()) {
            mt.addRow(new Object[]{mensaje.getRemitario(), mensaje.getDestinario(), mensaje.getContenido()});
        }
    }
    
    private void agregarMensaje() {
        String remitente = txt_remitente.getText().trim();
        String destinatario = txt_destinario.getText().trim();
        String mensaje = txt_mensaje.getText().trim();
        
        if (remitente.isEmpty() || destinatario.isEmpty() || mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese datos en los campos vacíos.");
            return;
        }
        
        Buzon_SanValentin_Singleton.getInstancia().agregar(remitente, destinatario, mensaje);
        actualizarTabla();
        limpiarCampos();
    }
    
    private void limpiarCampos() {
        txt_remitente.setText("");
        txt_destinario.setText("");
        txt_mensaje.setText("");
    }
    
    private void borrarMensaje() {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un mensaje para borrar.");
            return;
        }
        Buzon_SanValentin_Singleton.getInstancia().borrar(filaSeleccionada);
        actualizarTabla();
    }
    
    private void editarMensaje() {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un mensaje para editar.");
            return;
        }
        String remitente = txt_remitente.getText().trim();
        String destinatario = txt_destinario.getText().trim();
        String mensaje = txt_mensaje.getText().trim();
        
        if (remitente.isEmpty() || destinatario.isEmpty() || mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese datos en los campos vacíos.");
            return;
        }
        
        Buzon_SanValentin_Singleton.getInstancia().editar(filaSeleccionada, remitente, destinatario, mensaje);
        actualizarTabla();
        limpiarCampos();
    }
    
    private void seleccionarMensaje() {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            Contenido mensaje = Buzon_SanValentin_Singleton.getInstancia().ObtenerMensajes().get(filaSeleccionada);
            txt_remitente.setText(mensaje.getRemitario());
            txt_destinario.setText(mensaje.getDestinario());
            txt_mensaje.setText(mensaje.getContenido());
        }
    }
}*/

