package Vista;

import Modelo.ItemVenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Informacion_Pago extends javax.swing.JFrame {
    
    ArrayList<ItemVenta> articulos = new ArrayList<>();
    int idUsuario;
    public Informacion_Pago() {
        initComponents();
        txtNumTarjeta.setEditable(true);
        this.setTitle("Información de Pago");
        this.setSize(416, 509);
        tarjeta();
        rbtnTarjeta.setSelected(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<ItemVenta> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<ItemVenta> articulos) {
        this.articulos = articulos;
    }
    
    private int getTipo(){
        if ( rbtnContrapedido.isSelected())
            return 10;
        else
            return 9;
    }
    
    private boolean validarEntradasTarjeta(){
        
        if (isInt(txtNumTarjeta.getText()))
            if (isInt(txtCodExp.getText()))
                if (valDate())
                    return true; 
                else 
                    JOptionPane.showMessageDialog(null,"Mal formato de fecha, el formato debe ser MM/YY.","Error",JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"Mal formato de código de expiración.","Error",JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Mal formato de número de tarjeta.","Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    private boolean validarEntradasContrapedido(){
        if(txtNombre.getText().length() <= 100 && txtNombre.getText().length() > 0)
            if (txtDirecc.getText().length() <= 500 && txtDirecc.getText().length() > 0)
                return true;
            else
                JOptionPane.showMessageDialog(null,"La dirección debe ser menor a 500 caracteres.","Error",JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"El nombre debe ser menor a 100 caracteres.","Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    private boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
    
    private boolean valDate(){
        String str = txtFecExp.getText();
        if ( str.length() == 5){
            if (str.indexOf("/") == 2){
                if (str.substring(0, str.indexOf("/")).length() == 2 && isInt(str.substring(0, str.indexOf("/")))&&isInt(str.substring(str.indexOf("/")+1, str.length())) && str.substring(str.indexOf("/")+1, str.length()).length() == 2){
                    return true;
                }else
                    return false;
            }else
                return false;
        }else
            return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundRP = new javax.swing.JPanel();
        pnlInformacionPago = new javax.swing.JPanel();
        lblNumTarjeta = new javax.swing.JLabel();
        btnSaveIP = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblTittleIP = new javax.swing.JLabel();
        lblDirecc = new javax.swing.JLabel();
        txtNumTarjeta = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDirecc = new javax.swing.JTextField();
        btnCancelarIP = new javax.swing.JButton();
        txtFecExp = new javax.swing.JTextField();
        lblFecExp = new javax.swing.JLabel();
        rbtnContrapedido = new javax.swing.JRadioButton();
        rbtnTarjeta = new javax.swing.JRadioButton();
        txtCodExp = new javax.swing.JTextField();
        lblCodExp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBackgroundRP.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroundRP.setLayout(null);

        pnlInformacionPago.setBackground(new java.awt.Color(219, 210, 210));
        pnlInformacionPago.setLayout(null);

        lblNumTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        lblNumTarjeta.setText("Número de Tarjeta");
        pnlInformacionPago.add(lblNumTarjeta);
        lblNumTarjeta.setBounds(30, 77, 250, 25);

        btnSaveIP.setBackground(new java.awt.Color(176, 33, 33));
        btnSaveIP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveIP.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveIP.setText("Guardar");
        btnSaveIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveIPActionPerformed(evt);
            }
        });
        pnlInformacionPago.add(btnSaveIP);
        btnSaveIP.setBounds(180, 260, 110, 40);

        lblNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNom.setForeground(new java.awt.Color(0, 0, 0));
        lblNom.setText("Nombre");
        pnlInformacionPago.add(lblNom);
        lblNom.setBounds(30, 77, 150, 25);

        lblTittleIP.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleIP.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleIP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleIP.setText("Información de Pago");
        pnlInformacionPago.add(lblTittleIP);
        lblTittleIP.setBounds(65, 20, 230, 40);

        lblDirecc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDirecc.setForeground(new java.awt.Color(0, 0, 0));
        lblDirecc.setText("Dirección de Entrega");
        pnlInformacionPago.add(lblDirecc);
        lblDirecc.setBounds(30, 137, 220, 25);

        txtNumTarjeta.setEditable(false);
        txtNumTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        txtNumTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        pnlInformacionPago.add(txtNumTarjeta);
        txtNumTarjeta.setBounds(30, 100, 300, 30);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlInformacionPago.add(txtNombre);
        txtNombre.setBounds(30, 100, 300, 30);

        txtDirecc.setBackground(new java.awt.Color(255, 255, 255));
        txtDirecc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDirecc.setForeground(new java.awt.Color(0, 0, 0));
        pnlInformacionPago.add(txtDirecc);
        txtDirecc.setBounds(30, 160, 300, 30);

        btnCancelarIP.setBackground(new java.awt.Color(176, 33, 33));
        btnCancelarIP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarIP.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarIP.setText("Cancelar");
        btnCancelarIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarIPActionPerformed(evt);
            }
        });
        pnlInformacionPago.add(btnCancelarIP);
        btnCancelarIP.setBounds(60, 260, 110, 40);

        txtFecExp.setBackground(new java.awt.Color(255, 255, 255));
        txtFecExp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecExp.setForeground(new java.awt.Color(0, 0, 0));
        pnlInformacionPago.add(txtFecExp);
        txtFecExp.setBounds(30, 160, 300, 30);

        lblFecExp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFecExp.setForeground(new java.awt.Color(0, 0, 0));
        lblFecExp.setText("Fecha de Expiración");
        pnlInformacionPago.add(lblFecExp);
        lblFecExp.setBounds(30, 137, 250, 25);

        rbtnContrapedido.setForeground(new java.awt.Color(0, 0, 0));
        rbtnContrapedido.setText("Envío");
        rbtnContrapedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnContrapedidoActionPerformed(evt);
            }
        });
        pnlInformacionPago.add(rbtnContrapedido);
        rbtnContrapedido.setBounds(118, 60, 60, 21);

        rbtnTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        rbtnTarjeta.setText("Tarjeta");
        rbtnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTarjetaActionPerformed(evt);
            }
        });
        pnlInformacionPago.add(rbtnTarjeta);
        rbtnTarjeta.setBounds(190, 60, 60, 21);

        txtCodExp.setBackground(new java.awt.Color(255, 255, 255));
        txtCodExp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodExp.setForeground(new java.awt.Color(0, 0, 0));
        pnlInformacionPago.add(txtCodExp);
        txtCodExp.setBounds(30, 220, 300, 30);

        lblCodExp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodExp.setForeground(new java.awt.Color(0, 0, 0));
        lblCodExp.setText("Código de Expiración");
        pnlInformacionPago.add(lblCodExp);
        lblCodExp.setBounds(30, 190, 250, 25);

        pnlBackgroundRP.add(pnlInformacionPago);
        pnlInformacionPago.setBounds(20, 20, 360, 320);

        getContentPane().add(pnlBackgroundRP);
        pnlBackgroundRP.setBounds(0, 0, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void contrapedido(){
        lblNom.setVisible(true);
        txtNombre.setVisible(true);
        lblDirecc.setVisible(true);
        txtDirecc.setVisible(true);
        lblNumTarjeta.setVisible(false);
        txtNumTarjeta.setVisible(false);
        lblFecExp.setVisible(false);
        txtFecExp.setVisible(false);
        lblCodExp.setVisible(false);
        txtCodExp.setVisible(false);
        rbtnTarjeta.setSelected(false);
        
        pnlInformacionPago.setSize(360,250);
        btnCancelarIP.setLocation(btnCancelarIP.getLocation().x, 197);
        btnSaveIP.setLocation(btnSaveIP.getLocation().x, 197);
        pnlBackgroundRP.setSize(400,290);
        this.setSize(416, 329);
    }
    
    private void tarjeta(){
        lblNom.setVisible(false);
        lblDirecc.setVisible(false);
        txtNombre.setVisible(false);
        txtDirecc.setVisible(false);
        lblNumTarjeta.setVisible(true);
        
        txtNumTarjeta.setVisible(true);
        
        lblFecExp.setVisible(true);
        txtFecExp.setVisible(true);
        lblCodExp.setVisible(true);
        txtCodExp.setVisible(true);
        rbtnContrapedido.setSelected(false);
        this.setSize(416, 400);
        pnlInformacionPago.setSize(360, 320);
        btnCancelarIP.setLocation(60, 260);
        btnSaveIP.setLocation(180, 260);
        pnlBackgroundRP.setSize(400, 360);
        
    }
    
    private void btnCancelarIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarIPActionPerformed
        this.dispose();
        Venta_Articulos venta = new Venta_Articulos();
        venta.setVisible(true);
    }//GEN-LAST:event_btnCancelarIPActionPerformed

    private void btnSaveIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveIPActionPerformed
        if (getTipo() == 10 &&   validarEntradasContrapedido()){
            int filas = Modelo.VentaAccess.agregarPedido(idUsuario,txtNombre.getText(), txtDirecc.getText());
            int lastPed = Modelo.VentaAccess.getUltimoPedido();
            int acum = 0;
            for (int i = 0; i < articulos.size(); i++) {
                ItemVenta art = articulos.get(i);
                acum += Modelo.VentaAccess.agregarDetallePedido(lastPed, art.getCodigo(),art.getCant());
            }
            Modelo.VentaAccess.actualizarEncabezado(lastPed);
            if (filas != 0 && acum == articulos.size()){
                JOptionPane.showMessageDialog(null,"Pedido solicitado con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                Venta_Articulos venta = new Venta_Articulos();
                venta.setVisible(true);
            }   
        }else if (getTipo() == 9 && validarEntradasTarjeta()){
            int filas = Modelo.VentaAccess.agregarPedido(idUsuario,txtNombre.getText(), txtDirecc.getText());
            int lastPed = Modelo.VentaAccess.getUltimoPedido();
            int acum = 0;
            for (int i = 0; i < articulos.size(); i++) {
                ItemVenta art = articulos.get(i);
                acum += Modelo.VentaAccess.agregarDetallePedido(lastPed, art.getCodigo(),art.getCant());
            }
            Modelo.VentaAccess.actualizarEncabezado(lastPed);
            
            filas = Modelo.VentaAccess.agregarFactura(idUsuario);
            int lastFac = Modelo.VentaAccess.getUltimaFactura();
            acum = 0;
            for (int i = 0; i < articulos.size(); i++) {
                ItemVenta art = articulos.get(i);
                acum += Modelo.VentaAccess.agregarDetalleFactura(lastFac, art.getCodigo(),art.getCant());
            }
            Modelo.VentaAccess.actualizarEncabezadoFactura(lastFac);
            if (filas != 0 && acum == articulos.size()){
                JOptionPane.showMessageDialog(null,"Pedido solicitado con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                Venta_Articulos venta = new Venta_Articulos();
                venta.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSaveIPActionPerformed

    private void rbtnContrapedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnContrapedidoActionPerformed
        contrapedido();
    }//GEN-LAST:event_rbtnContrapedidoActionPerformed

    private void rbtnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTarjetaActionPerformed
        tarjeta();
    }//GEN-LAST:event_rbtnTarjetaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Informacion_Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarIP;
    private javax.swing.JButton btnSaveIP;
    private javax.swing.JLabel lblCodExp;
    private javax.swing.JLabel lblDirecc;
    private javax.swing.JLabel lblFecExp;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblTittleIP;
    private javax.swing.JPanel pnlBackgroundRP;
    private javax.swing.JPanel pnlInformacionPago;
    private javax.swing.JRadioButton rbtnContrapedido;
    private javax.swing.JRadioButton rbtnTarjeta;
    private javax.swing.JTextField txtCodExp;
    private javax.swing.JTextField txtDirecc;
    private javax.swing.JTextField txtFecExp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
