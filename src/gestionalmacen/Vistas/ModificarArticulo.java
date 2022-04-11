/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionalmacen.Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEX
 */
public class ModificarArticulo extends javax.swing.JFrame {
    int codigo=0;
    
    public ModificarArticulo(int code) {
        initComponents();
        setVisible(true);
        this.codigo=code;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        LabelModificarArticulo = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        LabelArticulo = new javax.swing.JLabel();
        LabelNombreArticulo = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        ComboBoxCantidad = new javax.swing.JComboBox<>();
        LabelFechaRegistro = new javax.swing.JLabel();
        CampoNombreArticulo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Footer = new javax.swing.JPanel();
        LabelFormularioRegistro = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(18, 48, 87));

        Head.setBackground(new java.awt.Color(22, 108, 169));

        LabelModificarArticulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelModificarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelModificarArticulo.setText("Modificar Artículo");

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelModificarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addComponent(LabelModificarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Body.setBackground(new java.awt.Color(226, 162, 43));

        LabelArticulo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        LabelArticulo.setText("Artículo");

        LabelNombreArticulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelNombreArticulo.setText("Nombre de Artículo");

        LabelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCantidad.setText("Cantidad");

        ComboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        LabelFechaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelFechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFechaRegistro.setText("Fecha de Registro");

        CampoNombreArticulo.setText("*****************************************************");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelFechaRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNombreArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabelArticulo))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LabelArticulo)
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombreArticulo)
                    .addComponent(CampoNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCantidad)
                    .addComponent(ComboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFechaRegistro)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        Footer.setBackground(new java.awt.Color(5, 9, 25));

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        LabelFormularioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelFormularioRegistro.setForeground(new java.awt.Color(255, 255, 255));
        LabelFormularioRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFormularioRegistro.setText("FORMULARIO DE REGISTRO");

        BotonVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Atras.png"))); // NOI18N
        BotonVolver.setText("Atras");
        BotonVolver.setBorderPainted(false);
        BotonVolver.setContentAreaFilled(false);
        BotonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/AtrasPresionado.png"))); // NOI18N
        BotonVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Guardar.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorderPainted(false);
        BotonGuardar.setContentAreaFilled(false);
        BotonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/GuardarPresionado.png"))); // NOI18N
        BotonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelFormularioRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(BotonVolver)
                .addGap(103, 103, 103)
                .addComponent(BotonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LabelFormularioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void LLenarVentana(){
    
    
    
    }
    
    
    
    
    
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        GestorArticulos form = new GestorArticulos(); //Ingresamos al formulario del cliente
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CampoNombreArticulo;
    private javax.swing.JComboBox<String> ComboBoxCantidad;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel LabelArticulo;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelFechaRegistro;
    private javax.swing.JLabel LabelFormularioRegistro;
    private javax.swing.JLabel LabelModificarArticulo;
    private javax.swing.JLabel LabelNombreArticulo;
    private javax.swing.JPanel Panel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
