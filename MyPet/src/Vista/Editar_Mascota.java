package Vista;

import java.util.ArrayList;
import javax.swing.*;

public class Editar_Mascota extends javax.swing.JFrame {
    
    int idUsuario,idMascota;
    ArrayList<String> info = new ArrayList<>();
    public Editar_Mascota() {
        initComponents();
        this.setSize(416, 460);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;
        txfNombre.setText(info.get(0));
        txaDesc.setText(info.get(1));
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundAA = new javax.swing.JPanel();
        pnlAgregarArticulo = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        lblTittleAA = new javax.swing.JLabel();
        lblCodRef = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDesc = new javax.swing.JTextArea();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundAA.setBackground(new java.awt.Color(255, 120, 120));
        pnlBackgroundAA.setLayout(null);

        pnlAgregarArticulo.setBackground(new java.awt.Color(219, 210, 210));
        pnlAgregarArticulo.setLayout(null);

        btnSave.setBackground(new java.awt.Color(176, 33, 33));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(btnSave);
        btnSave.setBounds(240, 310, 100, 40);

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(0, 0, 0));
        lblDesc.setText("Nombre");
        pnlAgregarArticulo.add(lblDesc);
        lblDesc.setBounds(30, 70, 110, 25);

        lblTittleAA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleAA.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleAA.setText("Editar Mascota");
        pnlAgregarArticulo.add(lblTittleAA);
        lblTittleAA.setBounds(90, 20, 190, 40);

        lblCodRef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodRef.setForeground(new java.awt.Color(0, 0, 0));
        lblCodRef.setText("Descripción");
        pnlAgregarArticulo.add(lblCodRef);
        lblCodRef.setBounds(30, 130, 210, 25);

        txfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(txfNombre);
        txfNombre.setBounds(30, 90, 300, 30);

        btnCancelar.setBackground(new java.awt.Color(176, 33, 33));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(btnCancelar);
        btnCancelar.setBounds(20, 310, 100, 40);

        txaDesc.setColumns(20);
        txaDesc.setRows(5);
        jScrollPane1.setViewportView(txaDesc);

        pnlAgregarArticulo.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 300, 130);

        btnBorrar.setBackground(new java.awt.Color(176, 33, 33));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        pnlAgregarArticulo.add(btnBorrar);
        btnBorrar.setBounds(130, 310, 100, 40);

        pnlBackgroundAA.add(pnlAgregarArticulo);
        pnlAgregarArticulo.setBounds(20, 20, 360, 380);

        getContentPane().add(pnlBackgroundAA);
        pnlBackgroundAA.setBounds(0, 0, 400, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        GestionMascotasClientes masc = new GestionMascotasClientes();
        masc.setVisible(true);
        masc.setIdUsuario(idUsuario);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(verificarEntradas()){
            int filas = Modelo.MascotasAccess.actualizarMascota(idMascota, txfNombre.getText(), txaDesc.getText());
            if ( filas != 0 ){
                JOptionPane.showMessageDialog(null,"Mascota actualizada con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                GestionMascotasClientes masc = new GestionMascotasClientes();
                masc.setVisible(true);
                masc.setIdUsuario(idUsuario);

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int filas = Modelo.MascotasAccess.borrarMascota(idMascota);
        if ( filas != 0 ){
            JOptionPane.showMessageDialog(null,"Mascota borrado con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            GestionMascotasClientes masc = new GestionMascotasClientes();
            masc.setVisible(true);
            masc.setIdUsuario(idUsuario);

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    
    
    
    public boolean verificarEntradas(){
        if (txfNombre.getText().length() <= 200 && txfNombre.getText().length() > 0){
            if(txaDesc.getText().length() <= 300 && txaDesc.getText().length() > 0){
                return true;
            }else
                JOptionPane.showMessageDialog(null,"Error, la descripcion debe ser menor a 300 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Error, el nombre debe ser menor a 200 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Editar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Editar_Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodRef;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblTittleAA;
    private javax.swing.JPanel pnlAgregarArticulo;
    private javax.swing.JPanel pnlBackgroundAA;
    private javax.swing.JTextArea txaDesc;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables

    
}
