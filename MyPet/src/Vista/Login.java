package Vista;

import Controlador.Notificaciones;
import Controlador.SesionActiva;
import Modelo.LoginAccess;
import java.awt.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    int unsuccesfulAttempts = 0;

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
        jLabel1 = new javax.swing.JLabel();

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
        btnLogin.setBounds(90, 210, 120, 40);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Continuar sin sesión");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnl_Login.add(jLabel1);
        jLabel1.setBounds(10, 260, 280, 25);

        pnlBackgroundLogin.add(pnl_Login);
        pnl_Login.setBounds(130, 40, 300, 320);

        getContentPane().add(pnlBackgroundLogin);
        pnlBackgroundLogin.setBounds(0, 0, 560, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (!"".equals(txtUser.getText()) && !"".equals(txtPass.getText())) {
            ArrayList<String> info = LoginAccess.verificarUsuario(txtUser.getText(), txtPass.getText());
            if (info != null && info.size() > 0) {
                int tipo = Integer.parseInt(info.get(1));
                int id = Integer.parseInt(info.get(0));
                if (tipo == 6)
                    GuiFactory(tipo, false, id);
                else
                    GuiFactory(tipo, true, id);
            } else {
                JOptionPane.showMessageDialog(null, "Inicio de sesión incorrecto, inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                unsuccesfulAttempts++;
            }
            if (unsuccesfulAttempts == 3) {
                JOptionPane.showMessageDialog(null, "Ha excedido el número de intentos permitidos, intente denuevo en 10 segundos.", "Error", JOptionPane.ERROR_MESSAGE);
                setComponentsEnabled(this, false);
                getIpAndSendEmails();
                Timer timer = new Timer(10 * 1000, e -> setComponentsEnabled(this, true));
                timer.setRepeats(false);
                timer.start();
            }
        }
    }

    private void setComponentsEnabled(Container container, boolean enabled) {
        for (Component component : container.getComponents()) {
            if (component instanceof Container) {
                setComponentsEnabled((Container) component, enabled);
            }
            if (component instanceof javax.swing.JTextField) {
                ((javax.swing.JTextField) component).setText("");
            }
            if (component instanceof javax.swing.JPasswordField) {
                ((javax.swing.JPasswordField) component).setText("");
            }
            component.setEnabled(enabled);
        }
    }

    private void getIpAndSendEmails(){
        InetAddress ip = null;
        try{
            ip = InetAddress.getLocalHost();
            System.out.println("Tu IP es: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
             e.printStackTrace();
        }
        Notificaciones.sendEmail("Han ocurrido 3 intentos fallidos de inicio de sesión en la aplicación MyPet desde la ip " + ip.getHostAddress() +
                ", por favor verifique que no haya un intento de acceso no autorizado.");
    }


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        GuiFactory(2,false,9);
        System.out.println("Continuar sin sesión");
    }//GEN-LAST:event_jLabel1MouseClicked
    
    private void GuiFactory(int tipoUsuario,boolean flag,int idUsuario){
        switch(tipoUsuario){
            case 1:
                MenuVeterinario veterinario = new MenuVeterinario();
                veterinario.setVisible(true);
                veterinario.setIdUsuario(idUsuario);
                this.dispose();
                break;
            case 2:
                MenuCliente cliente = new MenuCliente();
                cliente.setVisible(true);
                if ( !flag ){
                    cliente.setSesion(6);
                    cliente.setIdUsuario(idUsuario);
                }else{
                    cliente.setSesion(2);
                    cliente.setIdUsuario(idUsuario);
                }
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
                admin.setIdUsuario(idUsuario);
                this.dispose();
                break;
            default:
                break;
        }
    }
    
    public static void main(String args[]) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblTittleLogin;
    private javax.swing.JPanel pnlBackgroundLogin;
    private javax.swing.JPanel pnl_Login;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
