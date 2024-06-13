package Vista;

public class MenuVeterinario extends javax.swing.JFrame {
    
    public MenuVeterinario() {
        initComponents();
        setLocationRelativeTo(null);
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AsignaciónCitas = new javax.swing.JButton();
        RCitas = new javax.swing.JButton();
        GestionarMedicamentos = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AsignaciónCitas.setBackground(new java.awt.Color(51, 153, 255));
        AsignaciónCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        AsignaciónCitas.setText("Asignaciones de citas");
        AsignaciónCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AsignaciónCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(AsignaciónCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        RCitas.setBackground(new java.awt.Color(51, 153, 255));
        RCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario (1).png"))); // NOI18N
        RCitas.setText("Registrar citas");
        RCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCitasActionPerformed(evt);
            }
        });
        jPanel1.add(RCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        GestionarMedicamentos.setBackground(new java.awt.Color(51, 153, 255));
        GestionarMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N
        GestionarMedicamentos.setText("Gestionar medicamentos");
        GestionarMedicamentos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GestionarMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(GestionarMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        LabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo (1).png"))); // NOI18N
        jPanel1.add(LabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 200, 170));

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
        Titulo.setText("Menu Veterinario");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

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

    private void RCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCitasActionPerformed
        
    }//GEN-LAST:event_RCitasActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

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
    private javax.swing.JButton AsignaciónCitas;
    private javax.swing.JButton GestionarMedicamentos;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JButton RCitas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
