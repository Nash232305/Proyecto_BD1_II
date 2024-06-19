package Vista;

import Controlador.SesionActiva;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GestionExpedientesV extends javax.swing.JFrame {
    int idUsuario;
    boolean flag = false,permiso;
    String pet;
    public GestionExpedientesV() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarCitas();
        txaObservaciones.setVisible(false);
        txaObservaciones.setEditable(false);
        this.setSize(628, 560);
        SesionActiva.getInstance(null).actualizarActividad(this);
    }

    public void actualizarCitas(){
        ArrayList<String> pets = Modelo.CitasAccess.getMascotas();
        DefaultListModel<String> model = new DefaultListModel<>();
        lstExpedientes.setModel(model);
        for (int i = 0; i < pets.size(); i++) 
            model.addElement(pets.get(i));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstExpedientes = new javax.swing.JList<>();
        btnAtrasLst = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaObservaciones = new javax.swing.JTextArea();
        txfBuscar = new javax.swing.JTextField();

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
        jLabel1.setText("Expedientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 280, 40));

        lstExpedientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstExpedientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstExpedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstExpedientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstExpedientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 570, 370));

        btnAtrasLst.setBackground(new java.awt.Color(176, 33, 33));
        btnAtrasLst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtrasLst.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasLst.setText("Atrás");
        btnAtrasLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasLstActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtrasLst, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, -1));

        txaObservaciones.setEditable(false);
        txaObservaciones.setColumns(20);
        txaObservaciones.setRows(5);
        jScrollPane2.setViewportView(txaObservaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 570, 90));

        txfBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 570, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
        actualizarCitas();
    }

    public void setPermiso(boolean permiso) {
        this.permiso = permiso;
    }
    
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        if(permiso){
            MenuVeterinario vet = new MenuVeterinario();
            vet.setIdUsuario(idUsuario);
            vet.setVisible(true);
            this.dispose();
        }else{
            MenuAdministracion adm = new MenuAdministracion();
            adm.setIdUsuario(idUsuario);
            adm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_VolverActionPerformed

    public boolean isInt(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    private void lstExpedientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstExpedientesMouseClicked
        if(lstExpedientes.getSelectedIndex()!=-1){
            String cita = lstExpedientes.getSelectedValue();
            cita = cita.substring(4,cita.indexOf('-'));
            
            txaObservaciones.setText(Modelo.VeterinarioAccess.getDetalleCita(Integer.parseInt(cita.trim())));
            if (evt.getClickCount() == 2 && flag && permiso){
                
                String line = lstExpedientes.getSelectedValue();
                line = line.substring(line.indexOf('-')+1,line.indexOf(' '));
                String input = JOptionPane.showInputDialog(null, Modelo.VeterinarioAccess.getProductoDetalleCita(Integer.parseInt(cita), Integer.parseInt(line)), "Ingresa la cantidad de "+Modelo.VeterinarioAccess.getProductoDetalleCita(Integer.parseInt(cita), Integer.parseInt(line))+" .", JOptionPane.QUESTION_MESSAGE);
                if (input != null && !input.trim().isEmpty()) {
                    if (isInt(input)) {
                        int filas = 0;
                        if (Integer.parseInt(input)==0){
                            filas = Modelo.VeterinarioAccess.deleteLineCita(Integer.parseInt(cita), Integer.parseInt(line));
                        }else
                            filas = Modelo.VeterinarioAccess.setCantLineCita(Integer.parseInt(cita), Integer.parseInt(line), Integer.parseInt(input));
                        if (filas != 0) {
                            JOptionPane.showMessageDialog(null,"Se ha actualizado el expediente.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                            Modelo.VeterinarioAccess.getExpediente(lstExpedientes, Integer.parseInt(pet));
                        }else
                            JOptionPane.showMessageDialog(null,"No se pudo actualizar el expediente.","Error",JOptionPane.ERROR_MESSAGE);
                        txaObservaciones.setText("");
                    }else
                        JOptionPane.showMessageDialog(null,"Ingrese un valor númerico","Error",JOptionPane.ERROR_MESSAGE);
                   
                } else {
                    System.out.println("No se ingresó ningún dato.");
                }
            }
            if (evt.getClickCount() == 2 && !flag){
                txfBuscar.setText("");
                txfBuscar.setEditable(true);
                pet = lstExpedientes.getSelectedValue();
                pet = pet.substring(5,pet.indexOf('-')-1);
            
                flag = true;
                Modelo.VeterinarioAccess.getExpediente(lstExpedientes, Integer.parseInt(pet));
                txaObservaciones.setVisible(true);
                txaObservaciones.setText("");
                this.setSize(628, 670);
            }
            
        }
        
                
    }//GEN-LAST:event_lstExpedientesMouseClicked

    private void btnAtrasLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasLstActionPerformed
        if(flag){
            actualizarCitas();
            flag=false;
            txaObservaciones.setVisible(false);
            this.setSize(630, 560);
        }
    }//GEN-LAST:event_btnAtrasLstActionPerformed

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        if(!flag){
            txfBuscar.setEditable(true);
            Modelo.CitasAccess.getExpedientesPorFiltro(lstExpedientes,txfBuscar.getText());
        }else{
            txfBuscar.setText("");
            txfBuscar.setEditable(false);
        }
            
    }//GEN-LAST:event_txfBuscarKeyReleased

    
    
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
            java.util.logging.Logger.getLogger(GestionExpedientesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionExpedientesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionExpedientesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionExpedientesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestionExpedientesV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnAtrasLst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstExpedientes;
    private javax.swing.JTextArea txaObservaciones;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
