package Vista;

import javax.swing.*;



public class Agregar_Usuario extends javax.swing.JFrame {

    public Agregar_Usuario() {
        initComponents();
        this.setSize(416, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundAA = new javax.swing.JPanel();
        pnlAgregarArticulo = new javax.swing.JPanel();
        lblCodProv = new javax.swing.JLabel();
        btnSaveAA = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        lblTittleAA = new javax.swing.JLabel();
        lblCodRef = new javax.swing.JLabel();
        txfPass = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfCorreo = new javax.swing.JTextField();
        btnCancelarAA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundAA.setBackground(new java.awt.Color(255, 120, 120));
        pnlBackgroundAA.setLayout(null);

        pnlAgregarArticulo.setBackground(new java.awt.Color(219, 210, 210));
        pnlAgregarArticulo.setLayout(null);

        lblCodProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodProv.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProv.setText("Contraseña");
        pnlAgregarArticulo.add(lblCodProv);
        lblCodProv.setBounds(30, 190, 220, 25);

        btnSaveAA.setBackground(new java.awt.Color(176, 33, 33));
        btnSaveAA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveAA.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAA.setText("Guardar");
        btnSaveAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAAActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(btnSaveAA);
        btnSaveAA.setBounds(180, 260, 110, 40);

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(0, 0, 0));
        lblDesc.setText("Nombre");
        pnlAgregarArticulo.add(lblDesc);
        lblDesc.setBounds(30, 70, 110, 25);

        lblTittleAA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleAA.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleAA.setText("Agregar Usuario");
        pnlAgregarArticulo.add(lblTittleAA);
        lblTittleAA.setBounds(90, 20, 180, 40);

        lblCodRef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodRef.setForeground(new java.awt.Color(0, 0, 0));
        lblCodRef.setText("Correo");
        pnlAgregarArticulo.add(lblCodRef);
        lblCodRef.setBounds(30, 130, 210, 25);

        txfPass.setBackground(new java.awt.Color(255, 255, 255));
        txfPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfPass.setForeground(new java.awt.Color(0, 0, 0));
        pnlAgregarArticulo.add(txfPass);
        txfPass.setBounds(30, 210, 300, 30);

        txfNombre.setBackground(new java.awt.Color(255, 255, 255));
        txfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNombre.setForeground(new java.awt.Color(0, 0, 0));
        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(txfNombre);
        txfNombre.setBounds(30, 90, 300, 30);

        txfCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txfCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfCorreo.setForeground(new java.awt.Color(0, 0, 0));
        pnlAgregarArticulo.add(txfCorreo);
        txfCorreo.setBounds(30, 150, 300, 30);

        btnCancelarAA.setBackground(new java.awt.Color(176, 33, 33));
        btnCancelarAA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarAA.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAA.setText("Cancelar");
        btnCancelarAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAAActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(btnCancelarAA);
        btnCancelarAA.setBounds(60, 260, 110, 40);

        pnlBackgroundAA.add(pnlAgregarArticulo);
        pnlAgregarArticulo.setBounds(20, 20, 360, 320);

        getContentPane().add(pnlBackgroundAA);
        pnlBackgroundAA.setBounds(0, 0, 400, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnCancelarAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAAActionPerformed
        
    }//GEN-LAST:event_btnCancelarAAActionPerformed

    private void btnSaveAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAAActionPerformed
        if(verificarEntradas()){
            int filas = Modelo.ClientesAccess.agregarUsuario(txfNombre.getText(), txfCorreo.getText(), txfPass.getText());
            if ( filas != 0 ){
                JOptionPane.showMessageDialog(null,"Usuario agregado con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                GestionClientes clientes = new GestionClientes();
                clientes.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSaveAAActionPerformed

    
    
    
    
    public boolean verificarEntradas(){
        if (txfNombre.getText().length() <= 300 && txfNombre.getText().length() > 0){
            if(txfCorreo.getText().length() <= 150 && txfCorreo.getText().length() > 0){
                if(txfPass.getText().length() <= 15 && txfPass.getText().length() > 0){
                    return true;
                }else
                    JOptionPane.showMessageDialog(null,"Error, la contraseña debe ser menor a 15 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
            }else
                JOptionPane.showMessageDialog(null,"Error, el correo debe ser menor a 150 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Error, el nombre debe ser menor a 300 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    
    public boolean isInt(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch(Exception ex){
            return false;
        }
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
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAA;
    private javax.swing.JButton btnSaveAA;
    private javax.swing.JLabel lblCodProv;
    private javax.swing.JLabel lblCodRef;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblTittleAA;
    private javax.swing.JPanel pnlAgregarArticulo;
    private javax.swing.JPanel pnlBackgroundAA;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPass;
    // End of variables declaration//GEN-END:variables

    
}