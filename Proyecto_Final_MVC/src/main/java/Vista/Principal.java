package Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    private List<Object[]> tareas;
    
    public Principal() {
        initComponents();
        tareas = new ArrayList<>();
        actualizarTabla();
    }

    private void actualizarTabla() {
        DefaultTableModel mt = new DefaultTableModel();
        
        mt.addColumn("Nombre");
        mt.addColumn("Descripcion");
        mt.addColumn("Estado");
        
        for (Object[] tarea : tareas ) {
            mt.addRow(tarea);
        }
        Tabla1.setModel(mt);
    }
    
    private void agregarTarea() {
        String nombre = txt_Nombre.getText();
        String descripcion = txt_Descripcion.getText();

        if(!nombre.isEmpty() && !descripcion.isEmpty()){
            tareas.add(new Object[]{nombre, descripcion});
            JOptionPane.showMessageDialog(Panel_Principal, "Tarea agregada exitosamente.");    
        }else{ 
            JOptionPane.showMessageDialog(Panel_Principal, "Complete todos los campos.");
        }
        
    }  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        bot_Guardar = new javax.swing.JButton();
        bot_listar = new javax.swing.JButton();
        bot_actualizar = new javax.swing.JButton();
        bot_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Descripcion = new javax.swing.JTextArea();
        Panel_Secundario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel_Principal.setBackground(new java.awt.Color(204, 255, 255));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jLabel1.setText("AGREGA NUEVA TAREA");

        jLabel2.setText("Nombre de la tarea");

        jLabel3.setText("Descripcion");

        bot_Guardar.setText("Guardar tareas");
        bot_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_GuardarActionPerformed(evt);
            }
        });

        bot_listar.setText("Listar tareas");
        bot_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_listarActionPerformed(evt);
            }
        });

        bot_actualizar.setText("Actualizar Tareas");
        bot_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_actualizarActionPerformed(evt);
            }
        });

        bot_eliminar.setText("Eliminar completadas");

        txt_Descripcion.setColumns(20);
        txt_Descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_Descripcion);

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot_eliminar)
                    .addComponent(bot_actualizar)
                    .addComponent(bot_listar)
                    .addComponent(bot_Guardar))
                .addGap(255, 255, 255))
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PrincipalLayout.createSequentialGroup()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(bot_Guardar)
                .addGap(38, 38, 38)
                .addComponent(bot_listar)
                .addGap(34, 34, 34)
                .addComponent(bot_actualizar)
                .addGap(29, 29, 29)
                .addComponent(bot_eliminar)
                .addGap(47, 47, 47))
        );

        Panel_Secundario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secundario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla1);

        javax.swing.GroupLayout Panel_SecundarioLayout = new javax.swing.GroupLayout(Panel_Secundario);
        Panel_Secundario.setLayout(Panel_SecundarioLayout);
        Panel_SecundarioLayout.setHorizontalGroup(
            Panel_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_SecundarioLayout.setVerticalGroup(
            Panel_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SecundarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Panel_Secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_listarActionPerformed
        //Mostrar la tabla
        actualizarTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_listarActionPerformed

    private void bot_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_actualizarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_bot_actualizarActionPerformed

    private void bot_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_GuardarActionPerformed
        agregarTarea();
        txt_Descripcion.setText(" ");
        txt_Nombre.setText(" ");
        // TODO add your handling code here: 
    }//GEN-LAST:event_bot_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Secundario;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton bot_Guardar;
    private javax.swing.JButton bot_actualizar;
    private javax.swing.JButton bot_eliminar;
    private javax.swing.JButton bot_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_Descripcion;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
