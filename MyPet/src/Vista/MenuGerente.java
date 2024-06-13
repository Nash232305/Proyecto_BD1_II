package Vista;

public class MenuGerente extends javax.swing.JFrame {

    public MenuGerente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AsignaciónCitas = new javax.swing.JButton();
        AdminCitasUsuarios = new javax.swing.JButton();
        GestionarProductos = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        GestionarUsuarios2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AsignaciónCitas.setBackground(new java.awt.Color(51, 153, 255));
        AsignaciónCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        AsignaciónCitas.setText("Asignaciones de citas");
        AsignaciónCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AsignaciónCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(AsignaciónCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        AdminCitasUsuarios.setBackground(new java.awt.Color(51, 153, 255));
        AdminCitasUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario (1).png"))); // NOI18N
        AdminCitasUsuarios.setText(" Administrar citas de usuarios");
        AdminCitasUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminCitasUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminCitasUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCitasUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(AdminCitasUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        GestionarProductos.setBackground(new java.awt.Color(51, 153, 255));
        GestionarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N
        GestionarProductos.setText("Gestionar productos");
        GestionarProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GestionarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(GestionarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        LabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo (1).png"))); // NOI18N
        jPanel1.add(LabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 200, 170));

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
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu Gerente");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        GestionarUsuarios2.setBackground(new java.awt.Color(51, 153, 255));
        GestionarUsuarios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/expediente.png"))); // NOI18N
        GestionarUsuarios2.setText("Gestionar usuarios");
        GestionarUsuarios2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GestionarUsuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GestionarUsuarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarUsuarios2ActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminCitasUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCitasUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminCitasUsuariosActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void GestionarUsuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarUsuarios2ActionPerformed
        GestionarUsuariosG gestionarUsuarios = new GestionarUsuariosG();
        gestionarUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GestionarUsuarios2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminCitasUsuarios;
    private javax.swing.JButton AsignaciónCitas;
    private javax.swing.JButton GestionarProductos;
    private javax.swing.JButton GestionarUsuarios2;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
