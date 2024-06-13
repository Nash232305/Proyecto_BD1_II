package Vista;

import java.util.*;
import javax.swing.*;


public class Agregar_Reseña extends javax.swing.JFrame {

    Reseñas_Productos reseñas;
    public Agregar_Reseña() {
        initComponents();
        this.setSize(416, 509);
        txfArticulo.setEditable(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    public Reseñas_Productos getReseñas() {
        return reseñas;
    }

    public void setReseñas(Reseñas_Productos reseñas) {
        this.reseñas = reseñas;
    }
    
    public void setArticulo(String desc){
        txfArticulo.setText(desc);
    }
    
    
    
    private boolean verificarEntradas(){
        if(isFloat(txfCalificacion.getText()))
            if(txaResena.getText().length() <= 300 && txaResena.getText().length() > 0)
                return true;
            else
                JOptionPane.showMessageDialog(null,"Error, la reseña debe ser menor a 300 caractéres y mayor a 0.","Error",JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Error, la calificación tiene que ser un número en formato flotante.","Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    
    private boolean isFloat(String num){
        try{
            Float.parseFloat(num);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundEA = new javax.swing.JPanel();
        pnlEditarArticulo = new javax.swing.JPanel();
        lblResena = new javax.swing.JLabel();
        btnSaveAA = new javax.swing.JButton();
        lblArticulo = new javax.swing.JLabel();
        lblTittleEA = new javax.swing.JLabel();
        lblCalificacion = new javax.swing.JLabel();
        txfArticulo = new javax.swing.JTextField();
        txfCalificacion = new javax.swing.JTextField();
        btnCancelarAA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResena = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundEA.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroundEA.setLayout(null);

        pnlEditarArticulo.setBackground(new java.awt.Color(219, 210, 210));
        pnlEditarArticulo.setLayout(null);

        lblResena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResena.setForeground(new java.awt.Color(0, 0, 0));
        lblResena.setText("Reseña");
        pnlEditarArticulo.add(lblResena);
        lblResena.setBounds(30, 197, 250, 25);

        btnSaveAA.setBackground(new java.awt.Color(176, 33, 33));
        btnSaveAA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveAA.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAA.setText("Guardar");
        btnSaveAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAAActionPerformed(evt);
            }
        });
        pnlEditarArticulo.add(btnSaveAA);
        btnSaveAA.setBounds(190, 380, 110, 40);

        lblArticulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblArticulo.setForeground(new java.awt.Color(0, 0, 0));
        lblArticulo.setText("Artículo");
        pnlEditarArticulo.add(lblArticulo);
        lblArticulo.setBounds(30, 77, 150, 25);

        lblTittleEA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleEA.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleEA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleEA.setText("Agregar Reseña");
        pnlEditarArticulo.add(lblTittleEA);
        lblTittleEA.setBounds(90, 20, 180, 40);

        lblCalificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCalificacion.setForeground(new java.awt.Color(0, 0, 0));
        lblCalificacion.setText("Calificación");
        pnlEditarArticulo.add(lblCalificacion);
        lblCalificacion.setBounds(30, 137, 220, 25);

        txfArticulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfArticuloActionPerformed(evt);
            }
        });
        pnlEditarArticulo.add(txfArticulo);
        txfArticulo.setBounds(30, 100, 300, 30);

        txfCalificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlEditarArticulo.add(txfCalificacion);
        txfCalificacion.setBounds(30, 160, 300, 30);

        btnCancelarAA.setBackground(new java.awt.Color(176, 33, 33));
        btnCancelarAA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarAA.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAA.setText("Cancelar");
        btnCancelarAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAAActionPerformed(evt);
            }
        });
        pnlEditarArticulo.add(btnCancelarAA);
        btnCancelarAA.setBounds(60, 380, 110, 40);

        txaResena.setColumns(20);
        txaResena.setRows(5);
        jScrollPane1.setViewportView(txaResena);

        pnlEditarArticulo.add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 300, 140);

        pnlBackgroundEA.add(pnlEditarArticulo);
        pnlEditarArticulo.setBounds(20, 20, 360, 430);

        getContentPane().add(pnlBackgroundEA);
        pnlBackgroundEA.setBounds(0, 0, 400, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfArticuloActionPerformed
        
    }//GEN-LAST:event_txfArticuloActionPerformed

    private void btnCancelarAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAAActionPerformed
        reseñas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarAAActionPerformed

    private void btnSaveAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAAActionPerformed
        if(verificarEntradas()){
            int filas = Modelo.ReseñasAccess.agregarReseña(txfArticulo.getText(), txaResena.getText(),Float.parseFloat(txfCalificacion.getText()) );
            if (filas != 0){
               JOptionPane.showMessageDialog(null,"Reseña agregada con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
               reseñas.setVisible(true);
               this.dispose();
            }
        }
    }//GEN-LAST:event_btnSaveAAActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Reseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAA;
    private javax.swing.JButton btnSaveAA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblCalificacion;
    private javax.swing.JLabel lblResena;
    private javax.swing.JLabel lblTittleEA;
    private javax.swing.JPanel pnlBackgroundEA;
    private javax.swing.JPanel pnlEditarArticulo;
    private javax.swing.JTextArea txaResena;
    private javax.swing.JTextField txfArticulo;
    private javax.swing.JTextField txfCalificacion;
    // End of variables declaration//GEN-END:variables
}
