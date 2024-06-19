package Vista;


import Controlador.SesionActiva;
import Modelo.ItemVenta;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Venta_Articulos extends javax.swing.JFrame {
    
    int sesion,idUsuario;
    ArrayList<ItemVenta> articulos = new ArrayList<>();
    public Venta_Articulos() {
        initComponents();
        this.setTitle("Venta de Articulos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        txfTotal.setEditable(false);
        lstCarrito.setModel(new DefaultListModel<>());
        refrescarLista();
        SesionActiva.getInstance(null).actualizarActividad(this);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }
    
    public void refrescarLista(){
        Modelo.VentaAccess.getInventario(lstArticulos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackProve = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        lblGestionProve = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCarrito = new javax.swing.JList<>();
        txfTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList<>();
        btnComprar = new javax.swing.JButton();
        txfBuscarArt = new javax.swing.JTextField();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackProve.setBackground(new java.awt.Color(219, 210, 210));
        pnlBackProve.setLayout(null);

        pnlSuperior.setBackground(new java.awt.Color(255, 255, 255));
        pnlSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 33, 33)));
        pnlSuperior.setLayout(null);

        lblGestionProve.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblGestionProve.setForeground(new java.awt.Color(0, 0, 0));
        lblGestionProve.setText("Venta de Artículos");
        pnlSuperior.add(lblGestionProve);
        lblGestionProve.setBounds(330, 30, 300, 50);

        btnCerrarSesion.setBackground(new java.awt.Color(176, 33, 33));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Atrás");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlSuperior.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(10, 30, 80, 40);

        pnlBackProve.add(pnlSuperior);
        pnlSuperior.setBounds(0, 0, 1020, 100);

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        lstCarrito.setBackground(new java.awt.Color(255, 255, 255));
        lstCarrito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.orange, null, null));
        lstCarrito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstCarrito.setForeground(new java.awt.Color(0, 0, 0));
        lstCarrito.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCarrito.setSelectionBackground(new java.awt.Color(204, 204, 204));
        lstCarrito.setSelectionForeground(new java.awt.Color(176, 33, 33));
        lstCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCarrito);

        pnlBackProve.add(jScrollPane1);
        jScrollPane1.setBounds(710, 140, 280, 390);

        txfTotal.setBackground(new java.awt.Color(255, 255, 255));
        txfTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfTotal.setForeground(new java.awt.Color(0, 0, 0));
        txfTotal.setText("Total: 0");
        txfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTotalActionPerformed(evt);
            }
        });
        pnlBackProve.add(txfTotal);
        txfTotal.setBounds(710, 545, 270, 40);

        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

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
        jScrollPane2.setViewportView(lstArticulos);

        pnlBackProve.add(jScrollPane2);
        jScrollPane2.setBounds(20, 200, 670, 440);

        btnComprar.setBackground(new java.awt.Color(176, 33, 33));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        pnlBackProve.add(btnComprar);
        btnComprar.setBounds(860, 600, 110, 40);

        txfBuscarArt.setBackground(new java.awt.Color(255, 255, 255));
        txfBuscarArt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfBuscarArt.setForeground(new java.awt.Color(0, 0, 0));
        txfBuscarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarArtActionPerformed(evt);
            }
        });
        txfBuscarArt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarArtKeyReleased(evt);
            }
        });
        pnlBackProve.add(txfBuscarArt);
        txfBuscarArt.setBounds(20, 136, 670, 40);

        btnVaciar.setBackground(new java.awt.Color(176, 33, 33));
        btnVaciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });
        pnlBackProve.add(btnVaciar);
        btnVaciar.setBounds(730, 600, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackProve, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackProve, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTotalActionPerformed
        
    }//GEN-LAST:event_txfTotalActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        MenuCliente cliente = new MenuCliente();
        cliente.setVisible(true);
        cliente.setSesion(this.sesion);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (articulos.size() > 0){
            Informacion_Pago pago = new Informacion_Pago();
            pago.setVisible(true);
            pago.setArticulos(articulos);
            pago.setIdUsuario(idUsuario);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(null,"Tu carrito está vacío.","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void txfBuscarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarArtActionPerformed
        
    }//GEN-LAST:event_txfBuscarArtActionPerformed

    private void lstArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstArticulosMouseClicked
        if (evt.getClickCount() == 2) {
            int index = lstArticulos.locationToIndex(evt.getPoint());
            if (index != -1) {
                String selectedCod = lstArticulos.getModel().getElementAt(index).substring(5, lstArticulos.getModel().getElementAt(index).length());
                selectedCod = selectedCod.substring(0,selectedCod.indexOf(" "));
                int cod = Integer.parseInt(selectedCod);
                String precio = Modelo.VentaAccess.getPrecioPorCod(cod);
                String desc = Modelo.VentaAccess.getDescripcionPorCod(cod);
                agregarArticulo(cod, desc, precio);
                actualizarCarrito();
            }
        }
    }//GEN-LAST:event_lstArticulosMouseClicked

    public void actualizarCarrito(){
        String aux = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lstCarrito.setModel(model);
        for (int i = 0; i < articulos.size(); i++) {
            ItemVenta art = articulos.get(i);
            aux = art.getCodigo() + "- " + art.getDescripcion() + " (" + art.getCant() + ")";
            model.addElement(aux);
            actualizarMonto();
        }
    }
    
    public void actualizarMonto(){
        int sum = 0;
        for (int i = 0; i < articulos.size(); i++) {
            ItemVenta art = articulos.get(i);
            sum += art.getCant() * art.getPrecio();
        }
        txfTotal.setText("Total: " + sum);
    } 
    
    private void agregarArticulo(int cod ,String desc,String precio){
        boolean flag = false;
        for (int i = 0; i < articulos.size(); i++) {
            ItemVenta art = articulos.get(i);
            if ( art.getCodigo() == cod){
                art.agregar();
                flag = true;
            }
        }
        if (!flag)
            articulos.add(new ItemVenta(cod,Float.parseFloat(precio), desc));
        
    }
    
    
    private void lstCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCarritoMouseClicked
        
    }//GEN-LAST:event_lstCarritoMouseClicked
    
    
    
    private void txfBuscarArtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarArtKeyReleased
        Modelo.ReseñasAccess.buscarArticulo(txfBuscarArt.getText(), lstArticulos);
    }//GEN-LAST:event_txfBuscarArtKeyReleased

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        articulos.clear();
        actualizarCarrito();
        actualizarMonto();
    }//GEN-LAST:event_btnVaciarActionPerformed
    
    public void cambiarImagen(JLabel lbl, String imagePath, int width, int height) {
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
            java.util.logging.Logger.getLogger(Venta_Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta_Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta_Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta_Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta_Articulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGestionProve;
    private javax.swing.JList<String> lstArticulos;
    private javax.swing.JList<String> lstCarrito;
    private javax.swing.JPanel pnlBackProve;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txfBuscarArt;
    private javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
