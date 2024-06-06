package Vista;
import Modelo.Logins;
/**
 *
 * @author henge
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        InputUsuarioFocusGained(null);
        InputContraseñaFocusGained(null);
        setLocationRelativeTo(null);  // Esta línea centra la ventana en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloLABEL = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        ContraseñaLabel = new javax.swing.JLabel();
        InputUsuario = new javax.swing.JTextField();
        IngresarButton = new javax.swing.JButton();
        RadioCliente = new javax.swing.JRadioButton();
        RadioVeterinario = new javax.swing.JRadioButton();
        RadioGerente = new javax.swing.JRadioButton();
        RadioAdministrador = new javax.swing.JRadioButton();
        InputContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloLABEL.setBackground(new java.awt.Color(102, 255, 255));
        TituloLABEL.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        TituloLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLABEL.setText("Login");
        jPanel1.add(TituloLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        UsuarioLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 20));

        ContraseñaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ContraseñaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContraseñaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-con-llave.png"))); // NOI18N
        jPanel1.add(ContraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 20));

        InputUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InputUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputUsuarioFocusGained(evt);
            }
        });
        jPanel1.add(InputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 160, -1));

        IngresarButton.setBackground(new java.awt.Color(153, 255, 255));
        IngresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresar.png"))); // NOI18N
        IngresarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IngresarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, -1));

        RadioCliente.setBackground(new java.awt.Color(153, 255, 255));
        RadioCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        RadioCliente.setText("Cliente");
        RadioCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioClienteActionPerformed(evt);
            }
        });
        jPanel1.add(RadioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 110, -1));

        RadioVeterinario.setBackground(new java.awt.Color(153, 255, 255));
        RadioVeterinario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        RadioVeterinario.setText("Veterinario");
        RadioVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioVeterinarioActionPerformed(evt);
            }
        });
        jPanel1.add(RadioVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, -1));

        RadioGerente.setBackground(new java.awt.Color(153, 255, 255));
        RadioGerente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        RadioGerente.setText("Gerente");
        RadioGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioGerenteActionPerformed(evt);
            }
        });
        jPanel1.add(RadioGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        RadioAdministrador.setBackground(new java.awt.Color(153, 255, 255));
        RadioAdministrador.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        RadioAdministrador.setText("Administador");
        RadioAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RadioAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(RadioAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, -1));

        InputContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputContraseñaFocusGained(evt);
            }
        });
        InputContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(InputContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void RadioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioClienteActionPerformed
        // Obtener el tipo de usuario seleccionado y deshabilitar los demás RadioButtons 
        if (RadioCliente.isSelected()) {
            RadioVeterinario.setSelected(false);
            RadioGerente.setSelected(false);
            RadioAdministrador.setSelected(false);
        }

    }//GEN-LAST:event_RadioClienteActionPerformed

    private void RadioVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioVeterinarioActionPerformed
        // Obtener el tipo de usuario seleccionado y deshabilitar los demás RadioButtons
        if (RadioVeterinario.isSelected()) {
            RadioCliente.setSelected(false);
            RadioGerente.setSelected(false);
            RadioAdministrador.setSelected(false);
        }


    }//GEN-LAST:event_RadioVeterinarioActionPerformed

    private void RadioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioGerenteActionPerformed
        // Obtener el tipo de usuario seleccionado y deshabilitar los demás RadioButtons
        if (RadioGerente.isSelected()) {
            RadioCliente.setSelected(false);
            RadioVeterinario.setSelected(false);
            RadioAdministrador.setSelected(false);
        }


    }//GEN-LAST:event_RadioGerenteActionPerformed

    private void RadioAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAdministradorActionPerformed
        // Obtener el tipo de usuario seleccionado y deshabilitar los demás RadioButtons
        if (RadioAdministrador.isSelected()) {
            RadioCliente.setSelected(false);
            RadioVeterinario.setSelected(false);
            RadioGerente.setSelected(false);
        }


    }//GEN-LAST:event_RadioAdministradorActionPerformed

    private void InputContraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
    }
    

    private void IngresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarButtonActionPerformed
        // Obtener el usuario y contraseña ingresados y el tipo de usuario seleccionado
        
        
        String usuario = InputUsuario.getText();
        char[] password = InputContraseña.getPassword();
        String contraseña = new String(password);
        /*
         1	Veterinario
         2	Cliente
         3	Gerente
         4	Administrador

         SI ES VETERINARIO ES 1
            SI ES CLIENTE ES 2  
            SI ES GERENTE ES 3
            SI ES ADMINISTRADOR ES 4
         */
        int tipoUsuarioInt = 0;
        if (RadioVeterinario.isSelected()) {
            tipoUsuarioInt = 1;
        } else if (RadioCliente.isSelected()) {
            tipoUsuarioInt = 2;
        } else if (RadioGerente.isSelected()) {
            tipoUsuarioInt = 3;
        } else if (RadioAdministrador.isSelected()) {
            tipoUsuarioInt = 4;
        }

        // Verificar el usuario 
        if (Logins.verificarUsuario(usuario, contraseña, tipoUsuarioInt)) {
            // Cerrar la ventana de login
            this.dispose();
        } else {
            // Mostrar mensaje de error
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_IngresarButtonActionPerformed

    private void InputContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputContraseñaFocusGained
        // Crear un texto de ayuda para el campo de contraseña
         // Mostrar texto de sugerencia en el campo de contraseña
         String sugerencia = "Ingrese su contraseña";
         if (String.valueOf(InputContraseña.getPassword()).equals("")) {
             InputContraseña.setText(sugerencia);
             InputContraseña.setForeground(new java.awt.Color(204, 204, 204));
             InputContraseña.setEchoChar((char) 0); // Muestra el texto de sugerencia
         }
     
         // Añadir FocusListener para manejar el evento de enfoque
         InputContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
             @Override
             public void focusGained(java.awt.event.FocusEvent evt) {
                 if (String.valueOf(InputContraseña.getPassword()).equals(sugerencia)) {
                     InputContraseña.setText("");
                     InputContraseña.setEchoChar('\u2022'); // Cambia el carácter de eco a asterisco
                     InputContraseña.setForeground(new java.awt.Color(0, 0, 0)); // Cambia el color del texto a negro
                 }
             }
     
             @Override
             public void focusLost(java.awt.event.FocusEvent evt) {
                 if (String.valueOf(InputContraseña.getPassword()).isEmpty()) {
                     InputContraseña.setText(sugerencia);
                     InputContraseña.setEchoChar((char) 0); // Muestra el texto de sugerencia
                     InputContraseña.setForeground(new java.awt.Color(204, 204, 204)); // Cambia el color del texto a gris claro
                 }
             }
         });












    }//GEN-LAST:event_InputContraseñaFocusGained

    private void InputUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputUsuarioFocusGained
        String sugerencia = "Ingrese su usuario";

        if (InputUsuario.getText().equals("")) {
            InputUsuario.setText(sugerencia);
            InputUsuario.setForeground(new java.awt.Color(204, 204, 204));
        }
    
        // Añadir FocusListener para manejar el evento de enfoque
        InputUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(InputUsuario.getText()).equals(sugerencia)) {
                    InputUsuario.setText("");
                
                    InputUsuario.setForeground(new java.awt.Color(0, 0, 0)); // Cambia el color del texto a negro
                }
            }
    
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (String.valueOf(InputUsuario.getText()).isEmpty()) {
                    InputUsuario.setText(sugerencia);
                    InputUsuario.setForeground(new java.awt.Color(204, 204, 204)); // Cambia el color del texto a gris claro
                }
            }
        });



        








    }//GEN-LAST:event_InputUsuarioFocusGained

    /**
     * @param args the command line arguments
     */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraseñaLabel;
    private javax.swing.JButton IngresarButton;
    private javax.swing.JPasswordField InputContraseña;
    private javax.swing.JTextField InputUsuario;
    private javax.swing.JRadioButton RadioAdministrador;
    private javax.swing.JRadioButton RadioCliente;
    private javax.swing.JRadioButton RadioGerente;
    private javax.swing.JRadioButton RadioVeterinario;
    private javax.swing.JLabel TituloLABEL;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
