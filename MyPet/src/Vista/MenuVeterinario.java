package Vista;

public class MenuVeterinario extends javax.swing.JFrame {
    int idUsuario;
    public MenuVeterinario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAsignacionCitas = new javax.swing.JButton();
        btnExpediente = new javax.swing.JButton();
        btnCita = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsignacionCitas.setBackground(new java.awt.Color(51, 153, 255));
        btnAsignacionCitas.setText("Asignaciones de citas");
        btnAsignacionCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignacionCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignacionCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionCitasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacionCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, -1));

        btnExpediente.setBackground(new java.awt.Color(51, 153, 255));
        btnExpediente.setText("Expedientes");
        btnExpediente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpedienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        btnCita.setBackground(new java.awt.Color(51, 153, 255));
        btnCita.setText("Citas");
        btnCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setBackground(new java.awt.Color(153, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu Veterinario");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpedienteActionPerformed
        GestionExpedientesV exp = new GestionExpedientesV();
        exp.setIdUsuario(idUsuario);
        exp.setVisible(true);
        exp.setPermiso(true);
        this.dispose();
    }//GEN-LAST:event_btnExpedienteActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    public void setIdUsuario(int usuario) {
        this.idUsuario = usuario;
    }

    
    
    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        this.dispose();
        GestionCitasV citas = new GestionCitasV();
        citas.setVisible(true);
        citas.setIdUsuario(idUsuario);
    }//GEN-LAST:event_btnCitaActionPerformed

    private void btnAsignacionCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionCitasActionPerformed
        GestionarCitas citas = new GestionarCitas();
        citas.setIdUsuario(idUsuario);
        citas.setVisible(true);
        citas.setFlag(false);
        this.dispose();
    }//GEN-LAST:event_btnAsignacionCitasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVeterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnAsignacionCitas;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
