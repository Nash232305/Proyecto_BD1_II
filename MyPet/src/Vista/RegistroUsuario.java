package Vista;
import Modelo.*;
/**
 *
 * @author henge
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario1
     */
    public RegistroUsuario() {
        initComponents();
        agregarItemsAlComboBox();
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
        TituloRegistrodeUsuario = new javax.swing.JLabel();
        LabelTipoUsuario = new javax.swing.JLabel();
        LabelingreseNombre = new javax.swing.JLabel();
        LabelCorreoElectronico = new javax.swing.JLabel();
        InputCorreo = new javax.swing.JTextField();
        InputNombre = new javax.swing.JTextField();
        TipoUsuario = new javax.swing.JComboBox<>();
        BotonRegistrar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InputContraseña1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloRegistrodeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloRegistrodeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloRegistrodeUsuario.setText("Registros de usuario");
        jPanel1.add(TituloRegistrodeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 580, 50));

        LabelTipoUsuario.setText("Tipo de usuario");
        jPanel1.add(LabelTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));

        LabelingreseNombre.setText("Ingrese nombre");
        jPanel1.add(LabelingreseNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        LabelCorreoElectronico.setText("Ingrese correo electrónico");
        jPanel1.add(LabelCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 30));

        InputCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(InputCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 30));

        InputNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });
        jPanel1.add(InputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, 30));

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, 30));

        BotonRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        BotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrado.png"))); // NOI18N
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 260, 30));

        BotonVolver.setBackground(new java.awt.Color(153, 255, 255));
        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        BotonVolver.setBorder(null);
        BotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVolverMouseClicked(evt);
            }
        });
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 50));

        LabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo (1).png"))); // NOI18N
        jPanel1.add(LabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 250, 270));

        jLabel5.setText("Ingrese contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        InputContraseña1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputContraseña1ActionPerformed(evt);
            }
        });
        jPanel1.add(InputContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //agregar los tipos de usuario al combobox una sola vez
        agregarItemsAlComboBox();
        


    } 

    private void agregarItemsAlComboBox() {

        //agregar los tipos de usuario al combobox una sola vez
        if (TipoUsuario.getItemCount() == 1) {
            TipoUsuario.addItem("Veterinario");
            TipoUsuario.addItem("Cliente");
            TipoUsuario.addItem("Gerente");
            TipoUsuario.addItem("Administrador");
        }
    }
    

    private void InputContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputContraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputContraseña1ActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // Obtener los datos ingresados por el usuario y registrarlos en la base de datos 
        String nombre = InputNombre.getText();
        String correo = InputCorreo.getText();
        String contraseña = InputContraseña1.getText();
        String tipoUsuario = (String) TipoUsuario.getSelectedItem();

        /*
         * Los tipos de usuario son:
         *  1	Veterinario
            2	Cliente
            3	Gerente
            4	Administrador

            por lo cual dependiendo del tipo de usuario se debe guardar con el numero correspondiente es int
         */

        int tipo = 0;

        switch (tipoUsuario) {
            case "Veterinario" -> tipo = 1;
            case "Cliente" -> tipo = 2;
            case "Gerente" -> tipo = 3;
            case "Administrador" -> tipo = 4;
            default -> {
            }
        }


    }

    private void InputCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCorreoActionPerformed

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_BotonVolverMouseClicked

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    

    }

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField InputContraseña1;
    private javax.swing.JTextField InputCorreo;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JLabel LabelCorreoElectronico;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel LabelTipoUsuario;
    private javax.swing.JLabel LabelingreseNombre;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JLabel TituloRegistrodeUsuario;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
