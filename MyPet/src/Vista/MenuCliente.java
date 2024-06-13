package Vista;

/**
 *
 * @author henge
 */
public class MenuCliente extends javax.swing.JFrame {

    /** Creates new form Menu */
    public MenuCliente() {
        initComponents();
        setLocationRelativeTo(null);  // Esta línea centra la ventana en la pantalla
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TituloLabel = new javax.swing.JLabel();
        btnCitaRevisión = new javax.swing.JButton();
        btnReseñas = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        btnSolicitarCita = new javax.swing.JButton();
        btnCompraProductos = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLabel.setText("MENU CLIENTE");
        jPanel1.add(TituloLabel);
        TituloLabel.setBounds(60, 0, 170, 50);

        btnCitaRevisión.setBackground(new java.awt.Color(51, 153, 255));
        btnCitaRevisión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        btnCitaRevisión.setText("Solicitar cita de revisión");
        btnCitaRevisión.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCitaRevisión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitaRevisión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaRevisiónActionPerformed(evt);
            }
        });
        jPanel1.add(btnCitaRevisión);
        btnCitaRevisión.setBounds(60, 110, 170, 22);

        btnReseñas.setBackground(new java.awt.Color(51, 153, 255));
        btnReseñas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        btnReseñas.setText("Reseña de productos");
        btnReseñas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReseñas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReseñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseñasActionPerformed(evt);
            }
        });
        jPanel1.add(btnReseñas);
        btnReseñas.setBounds(60, 190, 170, 22);

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver);
        Volver.setBounds(0, 0, 40, 40);

        btnSolicitarCita.setBackground(new java.awt.Color(51, 153, 255));
        btnSolicitarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        btnSolicitarCita.setText("Solicitar Cita");
        btnSolicitarCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSolicitarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarCita);
        btnSolicitarCita.setBounds(60, 70, 170, 22);

        btnCompraProductos.setBackground(new java.awt.Color(51, 153, 255));
        btnCompraProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        btnCompraProductos.setText("Comprar productos");
        btnCompraProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompraProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompraProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompraProductos);
        btnCompraProductos.setBounds(60, 150, 170, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitaRevisiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaRevisiónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitaRevisiónActionPerformed

    private void btnSolicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarCitaActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void btnReseñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseñasActionPerformed
        Reseñas_Productos res = new Reseñas_Productos();
        res.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_btnReseñasActionPerformed

    private void btnCompraProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraProductosActionPerformed
        this.dispose();
        Venta_Articulos venta = new Venta_Articulos();
        venta.setVisible(true);
    }//GEN-LAST:event_btnCompraProductosActionPerformed


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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnCitaRevisión;
    private javax.swing.JButton btnCompraProductos;
    private javax.swing.JButton btnReseñas;
    private javax.swing.JButton btnSolicitarCita;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
