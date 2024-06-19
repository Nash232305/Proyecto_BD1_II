package Vista;

import Controlador.SesionActiva;

public class MenuCliente extends javax.swing.JFrame {

    int sesion, idUsuario;
    public MenuCliente() {
        initComponents();
        setLocationRelativeTo(null);
        SesionActiva.getInstance(this).actualizarActividad(this);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
        if(sesion == 6){
            sinSesion();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TituloLabel = new javax.swing.JLabel();
        btnMascotas = new javax.swing.JButton();
        btnReseñas = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        btnCita = new javax.swing.JButton();
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

        btnMascotas.setBackground(new java.awt.Color(51, 153, 255));
        btnMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        btnMascotas.setText("Mis Mascotas");
        btnMascotas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMascotas);
        btnMascotas.setBounds(60, 110, 170, 22);

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
        btnReseñas.setBounds(60, 170, 170, 22);

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

        btnCita.setBackground(new java.awt.Color(51, 153, 255));
        btnCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        btnCita.setText("Mis citas");
        btnCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCita);
        btnCita.setBounds(60, 140, 170, 22);

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
        btnCompraProductos.setBounds(60, 80, 170, 22);

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

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        Vista.GestionMascotasClientes masc = new Vista.GestionMascotasClientes();
        masc.setIdUsuario(idUsuario);
        masc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        this.dispose();
        GestionCitasC citas = new GestionCitasC();
        citas.setVisible(true);
        citas.setIdUsuario(idUsuario);
        
    }//GEN-LAST:event_btnCitaActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void btnReseñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseñasActionPerformed
        Reseñas_Productos res = new Reseñas_Productos();
        res.setVisible(true);
        res.setSesion(this.sesion);
        this.setVisible(false);
                
    }//GEN-LAST:event_btnReseñasActionPerformed

    private void btnCompraProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraProductosActionPerformed
        this.dispose();
        Venta_Articulos venta = new Venta_Articulos();
        venta.setVisible(true);
        venta.setSesion(this.sesion);
        venta.setIdUsuario(idUsuario);
    }//GEN-LAST:event_btnCompraProductosActionPerformed
    
    public void sinSesion(){
        btnMascotas.setVisible(false);
        btnCita.setVisible(false);
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
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnCompraProductos;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnReseñas;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
