/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionalmacen.Vistas;

import gestionalmacen.CapaEntidades.Articulo;
import gestionalmacen.CapaNegocio.ArticuloCN;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEX
 */
public class BuscarArticulo extends javax.swing.JFrame {

    
    public BuscarArticulo() {
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
        LabelBuscarArticulo = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        LabelArticulo = new javax.swing.JLabel();
        LabelCodigoArticulo = new javax.swing.JLabel();
        CampoCodigoArticulo = new javax.swing.JTextField();
        Footer = new javax.swing.JPanel();
        LabelBuscarCoNo = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(18, 48, 87));

        Head.setBackground(new java.awt.Color(22, 108, 169));

        LabelBuscarArticulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelBuscarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelBuscarArticulo.setText("Buscar Articulo");

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBuscarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addComponent(LabelBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Body.setBackground(new java.awt.Color(226, 162, 43));

        LabelArticulo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        LabelArticulo.setText("Artículo");

        LabelCodigoArticulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCodigoArticulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCodigoArticulo.setText("Código de Artículo");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(LabelCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelArticulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LabelArticulo)
                .addGap(18, 18, 18)
                .addComponent(LabelCodigoArticulo)
                .addGap(20, 20, 20)
                .addComponent(CampoCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
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

        LabelBuscarCoNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelBuscarCoNo.setForeground(new java.awt.Color(255, 255, 255));
        LabelBuscarCoNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBuscarCoNo.setText("Buscar por codigo y nombre");

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Buscar.png"))); // NOI18N
        BotonBuscar.setBorderPainted(false);
        BotonBuscar.setContentAreaFilled(false);
        BotonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/BuscarPresionado.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionalmacen/Vistas/iconos/Atras.png"))); // NOI18N
        BotonAtras.setBorderPainted(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
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
                    .addComponent(LabelBuscarCoNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BotonAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LabelBuscarCoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(BotonAtras)
                .addGap(18, 18, 18)
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

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        boolean Encontrado=false;
        ArticuloCN objeto_AN= new ArticuloCN();
        Articulo articulo = new Articulo();
        int code=Integer.parseInt(CampoCodigoArticulo.getText());
        articulo.setCodigo(code);
        //si lo encuentra:
        Encontrado = objeto_AN.SolicitarBuscarCodigoArticulo(articulo);
        
        if(Encontrado){
             JOptionPane.showMessageDialog(null,"SE ENCONTRÓ ARTICULO");
            if (GestorArticulos.opcionArticulo == 1) {
                ModificarArticulo form = new ModificarArticulo(code);
                this.dispose();
            } else if (GestorArticulos.opcionArticulo == 2) {
                EliminarArticulo form = new EliminarArticulo(code);
                this.dispose();

            }
                
        }else{
                JOptionPane.showMessageDialog(null,"ARTICULO NO ENCONTRADO");
                
        }
        
        
        
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        GestorArticulos form = new GestorArticulos(); //Ingresamos al formulario del cliente
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BuscarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JTextField CampoCodigoArticulo;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel LabelArticulo;
    private javax.swing.JLabel LabelBuscarArticulo;
    private javax.swing.JLabel LabelBuscarCoNo;
    private javax.swing.JLabel LabelCodigoArticulo;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
