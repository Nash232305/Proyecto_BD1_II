package Vista;


import Controlador.SesionActiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;


public class Agregar_Cita extends javax.swing.JFrame {

    ArrayList<String> lstArticulo = new ArrayList<>();
    
    public Agregar_Cita() {
        initComponents();
        this.setSize(416, 530);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        agregarAnno(cmbAnnoCita);
        System.out.println(getNewDate());
        SesionActiva.getInstance(null).actualizarActividad(this);
    }

    private void agregarAnno(JComboBox cmb){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int year = 10+currentYear; year >= currentYear; year--) 
            cmb.addItem(String.valueOf(year));
        cmb.setSelectedItem("2024");
    }
    
    public ArrayList<String> getLstArticulo() {
        return lstArticulo;
    }

    public void setLstArticulo(ArrayList<String> lstArticulo) {
        this.lstArticulo = lstArticulo;
        llenarCampos();
    }
    
    private void llenarCampos(){
        if (!lstArticulo.isEmpty()){
            setFecha(lstArticulo.get(0));
            cmbEstado.setSelectedIndex(Integer.parseInt(lstArticulo.get(1)));
        }
    }
    public void setMascotas(ArrayList<String> mascotas){
        for (int i = 0; i < mascotas.size(); i++) 
            cmbMascotas.addItem(mascotas.get(i));
    }
    
    public void setDoctores(ArrayList<String> doctores){
        for (int i = 0; i < doctores.size(); i++) 
            cmbDoctores.addItem(doctores.get(i));
    }
    
    public void setFecha(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            Date date = dateFormat.parse(dateString);

            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
            SimpleDateFormat hourFormat = new SimpleDateFormat("HH");

            String year = yearFormat.format(date);
            String month = monthFormat.format(date);
            String day = dayFormat.format(date);
            String hour = hourFormat.format(date);
            
            System.out.println("Horaaaaa: " + hour);
            
            cmbAnnoCita.setSelectedItem(year);
            cmbMesCita.setSelectedItem(month);
            cmbDiaCita.setSelectedItem(day);
            cmbHoraCita.setSelectedItem(hour.toLowerCase());

        } catch (ParseException e) {
            e.printStackTrace();
        }
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
        lblCodProv = new javax.swing.JLabel();
        btnSaveAA = new javax.swing.JButton();
        lblTittleEA = new javax.swing.JLabel();
        lblCodRef = new javax.swing.JLabel();
        btnCancelarAA = new javax.swing.JButton();
        lblCodProv1 = new javax.swing.JLabel();
        cmbHoraCita = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        lblDiaCita = new javax.swing.JLabel();
        cmbDiaCita = new javax.swing.JComboBox<>();
        lblMesCita = new javax.swing.JLabel();
        cmbMesCita = new javax.swing.JComboBox<>();
        lblAnnoCita = new javax.swing.JLabel();
        cmbAnnoCita = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbDoctores = new javax.swing.JComboBox<>();
        lblCodProv2 = new javax.swing.JLabel();
        cmbMascotas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundEA.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroundEA.setLayout(null);

        pnlEditarArticulo.setBackground(new java.awt.Color(219, 210, 210));
        pnlEditarArticulo.setLayout(null);

        lblCodProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodProv.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProv.setText("Estado");
        pnlEditarArticulo.add(lblCodProv);
        lblCodProv.setBounds(30, 290, 250, 25);

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
        btnCancelarAA.setBounds(60, 380, 110, 40);

        lblCodProv1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodProv1.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProv1.setText("Doctor");
        pnlEditarArticulo.add(lblCodProv1);
        lblCodProv1.setBounds(30, 170, 250, 25);

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

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendada", "Cancelada", "Completada" }));
        pnlEditarArticulo.add(cmbEstado);
        cmbEstado.setBounds(30, 320, 300, 26);

        pnlEditarArticulo.add(cmbDoctores);
        cmbDoctores.setBounds(30, 200, 300, 26);

        lblCodProv2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodProv2.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProv2.setText("Mascota");
        pnlEditarArticulo.add(lblCodProv2);
        lblCodProv2.setBounds(30, 230, 250, 25);

        pnlEditarArticulo.add(cmbMascotas);
        cmbMascotas.setBounds(30, 260, 300, 26);

        pnlBackgroundEA.add(pnlEditarArticulo);
        pnlEditarArticulo.setBounds(20, 20, 360, 450);

        getContentPane().add(pnlBackgroundEA);
        pnlBackgroundEA.setBounds(0, 0, 400, 500);

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
            String doc = (String)cmbDoctores.getSelectedItem();
            doc = doc.substring(4,doc.indexOf('-')-1);
            String pet = (String)cmbMascotas.getSelectedItem();
            pet = pet.substring(5,pet.indexOf('-')-1);
            int filas = Modelo.CitasAccess.agregarCita(getNewDate(),Integer.parseInt(pet), Integer.parseInt(doc), cmbEstado.getSelectedIndex()+1);
            if (filas != 0){
                JOptionPane.showMessageDialog(null,"Cita agregada con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                GestionarCitas citas = new GestionarCitas();
                citas.setVisible(true);
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
            java.util.logging.Logger.getLogger(Agregar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAA;
    private javax.swing.JButton btnSaveAA;
    private javax.swing.JComboBox<String> cmbAnnoCita;
    private javax.swing.JComboBox<String> cmbDiaCita;
    private javax.swing.JComboBox<String> cmbDoctores;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbHoraCita;
    private javax.swing.JComboBox<String> cmbMascotas;
    private javax.swing.JComboBox<String> cmbMesCita;
    private javax.swing.JLabel lblAnnoCita;
    private javax.swing.JLabel lblCodProv;
    private javax.swing.JLabel lblCodProv1;
    private javax.swing.JLabel lblCodProv2;
    private javax.swing.JLabel lblCodRef;
    private javax.swing.JLabel lblDiaCita;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMesCita;
    private javax.swing.JLabel lblTittleEA;
    private javax.swing.JPanel pnlBackgroundEA;
    private javax.swing.JPanel pnlEditarArticulo;
    // End of variables declaration//GEN-END:variables
}
