package Vista;

import Controlador.SesionActiva;

public class MenuAdministracion extends javax.swing.JFrame {

    int idUsuario;
    
    public MenuAdministracion() {
        initComponents();
        setLocationRelativeTo(null);
        SesionActiva.getInstance(this).actualizarActividad(this);
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCitas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        GestionarUsuarios = new javax.swing.JButton();
        btnExpediente = new javax.swing.JButton();
        btnCobroCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCitas.setBackground(new java.awt.Color(51, 153, 255));
        btnCitas.setText("Citas");
        btnCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setBorderPainted(false);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu administrativo");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        GestionarUsuarios.setBackground(new java.awt.Color(51, 153, 255));
        GestionarUsuarios.setText("Gestionar usuarios");
        GestionarUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GestionarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        btnExpediente.setBackground(new java.awt.Color(51, 153, 255));
        btnExpediente.setText("Expedientes");
        btnExpediente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpedienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        btnCobroCita.setBackground(new java.awt.Color(51, 153, 255));
        btnCobroCita.setText("Cobro de citas");
        btnCobroCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCobroCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobroCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobroCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCobroCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        GestionarCitas citas = new GestionarCitas();
        citas.setIdUsuario(idUsuario);
        citas.setVisible(true);
        citas.setFlag(true);
        this.dispose();
    }//GEN-LAST:event_btnCitasActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // Cuando se presiona el botón de volver, se cierra la ventana actual y se abre la ventana de login
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_VolverActionPerformed

    private void btnExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpedienteActionPerformed
        GestionExpedientesV exp = new GestionExpedientesV();
        exp.setIdUsuario(idUsuario);
        exp.setPermiso(false);
        exp.setVisible(true);
        this.dispose();
            
    }//GEN-LAST:event_btnExpedienteActionPerformed

    private void btnCobroCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobroCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCobroCitaActionPerformed

    private void GestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        GestionClientes cliente = new GestionClientes();
        cliente.setIdUsuario(idUsuario);
        cliente.setVisible(true);
        this.dispose();

    }

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
            java.util.logging.Logger.getLogger(MenuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionarUsuarios;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnCobroCita;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
