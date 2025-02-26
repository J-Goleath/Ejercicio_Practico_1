/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Menu extends javax.swing.JFrame {

    Cola c = new Cola();
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIngresarPaciente = new javax.swing.JButton();
        btnLlamarPaciente = new javax.swing.JButton();
        btnMostrarFilas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Pacientes");

        btnIngresarPaciente.setBackground(new java.awt.Color(255, 204, 153));
        btnIngresarPaciente.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        btnIngresarPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresarPaciente.setText("Ingresar Paciente");
        btnIngresarPaciente.setToolTipText("Ingresar Paciente");
        btnIngresarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPacienteActionPerformed(evt);
            }
        });

        btnLlamarPaciente.setBackground(new java.awt.Color(255, 204, 153));
        btnLlamarPaciente.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        btnLlamarPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnLlamarPaciente.setText("Llamar Paciente");
        btnLlamarPaciente.setToolTipText("Llamar Paciente");
        btnLlamarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarPacienteActionPerformed(evt);
            }
        });

        btnMostrarFilas.setBackground(new java.awt.Color(255, 204, 153));
        btnMostrarFilas.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        btnMostrarFilas.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarFilas.setText("Mostrar Filas");
        btnMostrarFilas.setToolTipText("Mostrar Filas");
        btnMostrarFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFilasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLlamarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarFilas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLlamarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarFilas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPacienteActionPerformed
        c.encolar();
    }//GEN-LAST:event_btnIngresarPacienteActionPerformed

    private void btnLlamarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarPacienteActionPerformed
        c.desencolar();
    }//GEN-LAST:event_btnLlamarPacienteActionPerformed

    private void btnMostrarFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFilasActionPerformed
        c.mostrar();
    }//GEN-LAST:event_btnMostrarFilasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarPaciente;
    private javax.swing.JButton btnLlamarPaciente;
    private javax.swing.JButton btnMostrarFilas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
