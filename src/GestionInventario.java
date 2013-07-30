import java.awt.Image;
import java.awt.Toolkit;

public class GestionInventario extends javax.swing.JFrame {
    Image cd;
    public GestionInventario() {
        initComponents();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de inventario");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INVENTARIO");
        jLabel7.setBounds(50, 20, 170, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Registrar solicitud de pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(40, 60, 200, 40);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Consultar almacen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(40, 240, 200, 40);
        jDesktopPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Registrar entrega de pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(40, 120, 200, 40);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Registrar peliculas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(40, 180, 200, 40);
        jDesktopPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("Modificar/Eliminar registro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(40, 300, 200, 40);
        jDesktopPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 280, 370);

        jButton4.setText("Menu");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton4);
        jButton4.setBounds(240, 410, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.setVisible(false);
    new ConsultaAlmacen().setVisible(true);    
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setVisible(false);
    new RegistroPedidos().setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new EntregaPedidos().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new RegistroPelicula().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new ModificarPelicula().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionInventario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
