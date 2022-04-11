/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionalmacen.Vistas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEX
 */
public class GestorArticulos extends javax.swing.JFrame {

    public static int opcionArticulo = -1;
    public GestorArticulos() {
        initComponents();
        setVisible(true);
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
        LabelRegistrarArticulo = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        Body = new javax.swing.JPanel();
        BotonRegistrar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        LabelModificar = new javax.swing.JLabel();
        LabelRegistrar = new javax.swing.JLabel();
        LabelEliminar = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        LabelFormularioRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(18, 48, 87));

        Head.setBackground(new java.awt.Color(22, 108, 169));

        LabelRegistrarArticulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelRegistrarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelRegistrarArticulo.setText("Gestor de Articulos");

        BotonCerrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Salir.png"))); // NOI18N
        BotonCerrar.setText("Salir");
        BotonCerrar.setBorderPainted(false);
        BotonCerrar.setContentAreaFilled(false);
        BotonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/SalirPresionado.png"))); // NOI18N
        BotonCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegistrarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelRegistrarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Body.setBackground(new java.awt.Color(226, 162, 43));

        BotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Registrar.png"))); // NOI18N
        BotonRegistrar.setBorderPainted(false);
        BotonRegistrar.setContentAreaFilled(false);
        BotonRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/RegistrarPresionado.png"))); // NOI18N
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Modificar.png"))); // NOI18N
        BotonModificar.setBorderPainted(false);
        BotonModificar.setContentAreaFilled(false);
        BotonModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/ModificarPresionado.png"))); // NOI18N
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Eliminar.png"))); // NOI18N
        BotonEliminar.setBorderPainted(false);
        BotonEliminar.setContentAreaFilled(false);
        BotonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/EliminarPresionado.png"))); // NOI18N
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        LabelModificar.setBackground(new java.awt.Color(240, 218, 113));
        LabelModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LabelModificar.setText("Modificar Artículo");

        LabelRegistrar.setBackground(new java.awt.Color(240, 218, 113));
        LabelRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LabelRegistrar.setText("Registrar Artículo");

        LabelEliminar.setBackground(new java.awt.Color(240, 218, 113));
        LabelEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LabelEliminar.setText("Eliminar Artículo");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(BotonModificar)
                        .addGap(71, 71, 71)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addComponent(LabelRegistrar)
                        .addGap(53, 53, 53)
                        .addComponent(LabelModificar)
                        .addGap(53, 53, 53)
                        .addComponent(LabelEliminar)
                        .addGap(40, 40, 40))))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonModificar)
                    .addComponent(BotonRegistrar)
                    .addComponent(BotonEliminar))
                .addGap(42, 42, 42)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRegistrar)
                    .addComponent(LabelModificar)
                    .addComponent(LabelEliminar))
                .addContainerGap(54, Short.MAX_VALUE))
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
        LabelFormularioRegistro.setText("USUARIO-ALMACENISTA");

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

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
       IniciarSesion form = new IniciarSesion();
       this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        RegistrarArticulo form = new RegistrarArticulo(); //Ingresamos al formulario del cliente
        this.dispose();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        BuscarArticulo form = new BuscarArticulo();
        opcionArticulo = 1;
        this.dispose();
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        BuscarArticulo form = new BuscarArticulo();
        opcionArticulo = 2;
        this.dispose();
    }//GEN-LAST:event_BotonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GestorArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestorArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel LabelEliminar;
    private javax.swing.JLabel LabelFormularioRegistro;
    private javax.swing.JLabel LabelModificar;
    private javax.swing.JLabel LabelRegistrar;
    private javax.swing.JLabel LabelRegistrarArticulo;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
