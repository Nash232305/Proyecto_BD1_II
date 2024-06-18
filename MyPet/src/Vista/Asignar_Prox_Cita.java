package Vista;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;


public class Asignar_Prox_Cita extends javax.swing.JFrame {

    ArrayList<String> lstArticulo = new ArrayList<>();
    int doc, pet;
    public Asignar_Prox_Cita() {
        initComponents();
        this.setSize(416, 360);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        agregarAnno(cmbAnnoCita);
        System.out.println(getNewDate());
    }

    private void agregarAnno(JComboBox cmb){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int year = 10+currentYear; year >= currentYear; year--) 
            cmb.addItem(String.valueOf(year));
        cmb.setSelectedItem("2024");
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public void setPet(int pet) {
        this.pet = pet;
    }
    
   

    public ArrayList<String> getLstArticulo() {
        return lstArticulo;
    }

   
    public boolean isInt(String num){
        try{
            Integer.parseInt(num);
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
        btnSaveAA = new javax.swing.JButton();
        lblTittleEA = new javax.swing.JLabel();
        lblCodRef = new javax.swing.JLabel();
        btnCancelarAA = new javax.swing.JButton();
        cmbHoraCita = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        lblDiaCita = new javax.swing.JLabel();
        cmbDiaCita = new javax.swing.JComboBox<>();
        lblMesCita = new javax.swing.JLabel();
        cmbMesCita = new javax.swing.JComboBox<>();
        lblAnnoCita = new javax.swing.JLabel();
        cmbAnnoCita = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundEA.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroundEA.setLayout(null);

        pnlEditarArticulo.setBackground(new java.awt.Color(219, 210, 210));
        pnlEditarArticulo.setLayout(null);

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
        btnSaveAA.setBounds(190, 200, 110, 40);

        lblTittleEA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleEA.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleEA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleEA.setText("Agregar Cita");
        pnlEditarArticulo.add(lblTittleEA);
        lblTittleEA.setBounds(90, 20, 180, 40);

        lblCodRef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodRef.setForeground(new java.awt.Color(0, 0, 0));
        lblCodRef.setText("Fecha");
        pnlEditarArticulo.add(lblCodRef);
        lblCodRef.setBounds(30, 80, 220, 25);

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
        btnCancelarAA.setBounds(60, 200, 110, 40);

        cmbHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08", "09", "10", "11", "12", "13", "14", "15", "16", "17" }));
        cmbHoraCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHoraCitaActionPerformed(evt);
            }
        });
        pnlEditarArticulo.add(cmbHoraCita);
        cmbHoraCita.setBounds(30, 140, 70, 26);

        lblHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("Hora");
        pnlEditarArticulo.add(lblHora);
        lblHora.setBounds(30, 110, 40, 25);

        lblDiaCita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDiaCita.setForeground(new java.awt.Color(0, 0, 0));
        lblDiaCita.setText("Día");
        pnlEditarArticulo.add(lblDiaCita);
        lblDiaCita.setBounds(120, 110, 50, 25);

        cmbDiaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        pnlEditarArticulo.add(cmbDiaCita);
        cmbDiaCita.setBounds(120, 140, 60, 26);

        lblMesCita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMesCita.setForeground(new java.awt.Color(0, 0, 0));
        lblMesCita.setText("Mes");
        pnlEditarArticulo.add(lblMesCita);
        lblMesCita.setBounds(190, 110, 50, 25);

        cmbMesCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        pnlEditarArticulo.add(cmbMesCita);
        cmbMesCita.setBounds(190, 140, 60, 26);

        lblAnnoCita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAnnoCita.setForeground(new java.awt.Color(0, 0, 0));
        lblAnnoCita.setText("Año");
        pnlEditarArticulo.add(lblAnnoCita);
        lblAnnoCita.setBounds(260, 110, 50, 25);

        pnlEditarArticulo.add(cmbAnnoCita);
        cmbAnnoCita.setBounds(260, 140, 70, 26);

        pnlBackgroundEA.add(pnlEditarArticulo);
        pnlEditarArticulo.setBounds(20, 20, 360, 280);

        getContentPane().add(pnlBackgroundEA);
        pnlBackgroundEA.setBounds(0, 0, 400, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAAActionPerformed
       this.dispose();
       GestionarCitas citas = new GestionarCitas();
       citas.setVisible(true);
    }//GEN-LAST:event_btnCancelarAAActionPerformed

    public String getNewDate(){
        return (String) cmbAnnoCita.getSelectedItem() +"-"+ (String) cmbMesCita.getSelectedItem() +"-"+ (String) cmbDiaCita.getSelectedItem() + " " + (String)cmbHoraCita.getSelectedItem()+":00:00.000";
    }
   
    
    private void btnSaveAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAAActionPerformed
        if(Modelo.CitasAccess.comprobarCita(getNewDate()) == -1){
            int filas = Modelo.CitasAccess.agregarCita(getNewDate(),pet, doc, 1);
            if (filas != 0){
                JOptionPane.showMessageDialog(null,"Cita agregada con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                GestionCitasV citas = new GestionCitasV();
                citas.setVisible(true);
                citas.setIdUsuario(doc);
            }else{
                JOptionPane.showMessageDialog(null,"La cita no se pudo agregar.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null,"La fecha ingresada no está disponible, ingrese otra fecha","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSaveAAActionPerformed

    private void cmbHoraCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHoraCitaActionPerformed

    }//GEN-LAST:event_cmbHoraCitaActionPerformed

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
            java.util.logging.Logger.getLogger(Asignar_Prox_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asignar_Prox_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asignar_Prox_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asignar_Prox_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Asignar_Prox_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAA;
    private javax.swing.JButton btnSaveAA;
    private javax.swing.JComboBox<String> cmbAnnoCita;
    private javax.swing.JComboBox<String> cmbDiaCita;
    private javax.swing.JComboBox<String> cmbHoraCita;
    private javax.swing.JComboBox<String> cmbMesCita;
    private javax.swing.JLabel lblAnnoCita;
    private javax.swing.JLabel lblCodRef;
    private javax.swing.JLabel lblDiaCita;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMesCita;
    private javax.swing.JLabel lblTittleEA;
    private javax.swing.JPanel pnlBackgroundEA;
    private javax.swing.JPanel pnlEditarArticulo;
    // End of variables declaration//GEN-END:variables
}
