package Vista;

import Controlador.SesionActiva;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Reseñas_Productos extends javax.swing.JFrame {

    boolean flag = true;
    String cod = "";
    int sesion;
    public Reseñas_Productos() {
        initComponents();
        this.setTitle("Gestion de Inventario");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        refrescarLista();
        btnActualizar.setVisible(false);
        SesionActiva.getInstance(null).actualizarActividad(this);
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        lblReseñas = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList<>();
        btnActualizar = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(219, 210, 210));
        pnlPrincipal.setLayout(null);

        pnlSuperior.setBackground(new java.awt.Color(255, 255, 255));
        pnlSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 33, 33)));
        pnlSuperior.setLayout(null);

        lblReseñas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblReseñas.setForeground(new java.awt.Color(0, 0, 0));
        lblReseñas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReseñas.setText("Reseñas");
        pnlSuperior.add(lblReseñas);
        lblReseñas.setBounds(320, 5, 170, 90);

        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlSuperior.add(btnAtras);
        btnAtras.setBounds(10, 30, 76, 40);

        pnlPrincipal.add(pnlSuperior);
        pnlSuperior.setBounds(0, 0, 813, 100);

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        lstArticulos.setBackground(new java.awt.Color(255, 255, 255));
        lstArticulos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.orange, null, null));
        lstArticulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstArticulos.setForeground(new java.awt.Color(0, 0, 0));
        lstArticulos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "1", "2", "3", "4", "5", "6", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstArticulos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        lstArticulos.setSelectionForeground(new java.awt.Color(176, 33, 33));
        lstArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstArticulos);

        pnlPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 770, 440);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizar.setText("Atrás");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnActualizar);
        btnActualizar.setBounds(590, 130, 110, 40);

        txfBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarActionPerformed(evt);
            }
        });
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txfBuscar);
        txfBuscar.setBounds(20, 130, 510, 40);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAgregar);
        btnAgregar.setBounds(590, 130, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<String> getLstArticulos() {
        return lstArticulos;
    }
    
    public void refrescarLista(){
        Modelo.ReseñasAccess.getInventario(lstArticulos);
        flag = true;
        cod = "";
        btnAgregar.setVisible(true); 
        btnActualizar.setVisible(false);
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!cod.equals("")){
            System.out.println("test: " + cod);
            Agregar_Reseña agregar = new Agregar_Reseña();
            agregar.setReseñas(this);
            agregar.setVisible(true);
            agregar.setArticulo(Modelo.ReseñasAccess.getNombreArticulo(Integer.parseInt(cod)));
            this.setVisible(false);
        }else
            JOptionPane.showMessageDialog(null, "Escoge un artículo primero", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        refrescarLista();
    }//GEN-LAST:event_btnActualizarActionPerformed
     
    private void lstArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstArticulosMouseClicked
        if (evt.getClickCount() == 2 && flag){
            String art = lstArticulos.getSelectedValue().substring(5,lstArticulos.getSelectedValue().length());
            art = art.substring(0,art.indexOf(" "));
            Modelo.ReseñasAccess.getReseña(Integer.parseInt(art),lstArticulos);
            flag = false;
            btnAgregar.setVisible(false);
            btnActualizar.setVisible(true);
        }else {
            cod = lstArticulos.getSelectedValue().substring(5,lstArticulos.getSelectedValue().length());
            cod = cod.substring(0,cod.indexOf(" "));
           
        }
    }//GEN-LAST:event_lstArticulosMouseClicked

    private void txfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarActionPerformed

    private void txfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyPressed
        
    }//GEN-LAST:event_txfBuscarKeyPressed

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        Modelo.ReseñasAccess.buscarArticulo(txfBuscar.getText(), lstArticulos);
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped
        
    }//GEN-LAST:event_txfBuscarKeyTyped

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuCliente cliente = new MenuCliente();
        cliente.setVisible(true);
        cliente.setSesion(sesion);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    
    
    private void cambiarImagen(JLabel lbl, String imagePath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image image = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        lbl.setIcon(scaledIcon);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setVerticalAlignment(SwingConstants.CENTER);
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
            java.util.logging.Logger.getLogger(Reseñas_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reseñas_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reseñas_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reseñas_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reseñas_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReseñas;
    private javax.swing.JList<String> lstArticulos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
