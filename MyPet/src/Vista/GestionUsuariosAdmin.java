package Vista;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class GestionUsuariosAdmin extends javax.swing.JFrame {
    int idUsuario;
    public GestionUsuariosAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarClientes();
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
        actualizarClientes();
    }
    
    public void actualizarClientes(){
        Modelo.ClientesAccess.getUsuarios(lstUsuarios);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();

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
        jLabel1.setText("Gestión Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 280, 40));

        lstUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 570, 370));

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
        MenuGerente adm = new MenuGerente();
        adm.setIdUsuario(idUsuario);
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
        if ( evt.getClickCount() == 2 ){
            String str = lstUsuarios.getSelectedValue().substring(5,lstUsuarios.getSelectedValue().length() );
            str = str.substring(0, str.indexOf(" "));
            
            String[] opciones = {"Veterinario", "Cliente", "Administrador"};

            JComboBox<String> comboBox = new JComboBox<>(opciones);

            int seleccion = JOptionPane.showConfirmDialog(null, comboBox, "Elije el permiso por asignar", JOptionPane.OK_CANCEL_OPTION);
            
            if (seleccion == JOptionPane.OK_OPTION) {
                int res = comboBox.getSelectedIndex()+1;
                if (res==3)
                    res+=1;
                int filas = Modelo.ClientesAccess.setUserType(Integer.parseInt(str), res);
                if(filas!=0){
                    JOptionPane.showMessageDialog(null, "Se ha acutalizado los permisos del usuario.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                    actualizarClientes();
                }else
                    JOptionPane.showMessageDialog(null,"No se pudo cambiar los permisos del usuario.","Error",JOptionPane.ERROR_MESSAGE);
            } else 
                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.");
        }
    }//GEN-LAST:event_lstUsuariosMouseClicked

    
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
            java.util.logging.Logger.getLogger(GestionUsuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuariosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstUsuarios;
    // End of variables declaration//GEN-END:variables
}
