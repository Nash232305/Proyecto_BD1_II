package Vista;

import Modelo.LoginAccess;
import java.awt.*;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setTitle("Inicio Sesión");
        this.setSize(565,430);
        this.setBackground(new Color(255,120,120));   
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundLogin = new javax.swing.JPanel();
        pnl_Login = new javax.swing.JPanel();
        lblTittleLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 120, 120));
        getContentPane().setLayout(null);

        pnlBackgroundLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroundLogin.setLayout(null);

        pnl_Login.setBackground(new java.awt.Color(204, 204, 204));
        pnl_Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_Login.setForeground(new java.awt.Color(219, 210, 210));
        pnl_Login.setLayout(null);

        lblTittleLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTittleLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblTittleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittleLogin.setText("Inicio de Sesión");
        pnl_Login.add(lblTittleLogin);
        lblTittleLogin.setBounds(0, 10, 300, 40);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnl_Login.add(btnLogin);
        btnLogin.setBounds(90, 230, 120, 40);

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo Electrónico");
        pnl_Login.add(lblCorreo);
        lblCorreo.setBounds(20, 72, 200, 25);

        lblContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContra.setForeground(new java.awt.Color(0, 0, 0));
        lblContra.setText("Contraseña");
        pnl_Login.add(lblContra);
        lblContra.setBounds(20, 132, 140, 25);
        pnl_Login.add(txtUser);
        txtUser.setBounds(20, 95, 260, 30);
        pnl_Login.add(txtPass);
        txtPass.setBounds(20, 160, 260, 30);

        pnlBackgroundLogin.add(pnl_Login);
        pnl_Login.setBounds(130, 40, 300, 320);

        getContentPane().add(pnlBackgroundLogin);
        pnlBackgroundLogin.setBounds(0, 0, 560, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        int tipo = LoginAccess.verificarUsuario(txtUser.getText(), txtPass.getText());
        GuiFactory(tipo);
    }//GEN-LAST:event_btnLoginActionPerformed
    
    private void GuiFactory(int tipoUsuario){
        switch(tipoUsuario){
            case 1:
                MenuVeterinario veterinario = new MenuVeterinario();
                veterinario.setVisible(true);
                this.dispose();
                break;
            case 2:
                MenuCliente cliente = new MenuCliente();
                cliente.setVisible(true);
                this.dispose();
                break;
            case 3:
                MenuGerente gerente = new MenuGerente();
                gerente.setVisible(true);
                this.dispose();
                break;
            case 4:
                MenuAdministracion admin = new MenuAdministracion();
                admin.setVisible(true);
                this.dispose();
                break;
            default:
                break;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblTittleLogin;
    private javax.swing.JPanel pnlBackgroundLogin;
    private javax.swing.JPanel pnl_Login;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
