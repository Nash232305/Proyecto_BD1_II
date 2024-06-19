package Vista;

import Controlador.SesionActiva;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionCitasC extends javax.swing.JFrame {
    int idUsuario;
    
    public GestionCitasC() {
        initComponents();
        setLocationRelativeTo(null);
        SesionActiva.getInstance(null).actualizarActividad(this);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
        actualizarCitas();
    }

    public void actualizarCitas(){
        Modelo.CitasAccess.getCitasPorCliente(idUsuario, lstCitas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCitas = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        Volver.setBorder(null);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mis citas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 280, 40));

        lstCitas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstCitas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 570, 370));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, 40));

        btnCancelarCita.setText("Cancelar");
        btnCancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        MenuCliente cliente = new MenuCliente();
        cliente.setIdUsuario(idUsuario);
        cliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.dispose();
        ArrayList<String> info = Modelo.CitasAccess.getMascotasPorClientes(idUsuario);
        Pedir_Cita pedir = new Pedir_Cita();
        pedir.setVisible(true);
        pedir.setIdUsuario(idUsuario);
        pedir.setMascotas(info);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lstCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCitasMouseClicked
        if(evt.getClickCount() == 2){
            String str = lstCitas.getSelectedValue().substring(5,lstCitas.getSelectedValue().length());
            str = str.substring(0,str.indexOf(" "));
        }
    }//GEN-LAST:event_lstCitasMouseClicked

    private void btnCancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCitaActionPerformed
        if(lstCitas.getSelectedIndex() != -1){
            String str = lstCitas.getSelectedValue().substring(5,lstCitas.getSelectedValue().length() );
            str = str.substring(0, str.indexOf(" "));
            int filas = Modelo.CitasAccess.cancelarCitaCod(Integer.parseInt(str));
            if (filas != 0){
                JOptionPane.showMessageDialog(null,"Cita cancelada con éxito.","Eso tilín.",JOptionPane.INFORMATION_MESSAGE);
                actualizarCitas();
            }else
                JOptionPane.showMessageDialog(null,"No se pudo cancelar la cita.","Error",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Seleccione una cita para cancelar.","Ojo al piojo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCancelarCitaActionPerformed

    
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
            java.util.logging.Logger.getLogger(GestionCitasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCitasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCitasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCitasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestionCitasC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstCitas;
    // End of variables declaration//GEN-END:variables
}
