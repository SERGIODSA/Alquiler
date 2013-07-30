import java.awt.Image;
import java.awt.Toolkit;

public class menuAlquiler extends javax.swing.JFrame {
    Image cd;
    public menuAlquiler() {
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
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu alquiler");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jDesktopPane1.setForeground(new java.awt.Color(175, 213, 240));

        jButton2.setText("Consulta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(30, 60, 140, 40);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Registro Alquiler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(30, 130, 140, 40);
        jDesktopPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Entrega");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(30, 200, 140, 40);
        jDesktopPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ALQUILER");
        jLabel7.setBounds(30, 20, 140, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 38, 200, 270);

        jButton6.setText("Menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton6);
        jButton6.setBounds(159, 320, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new ConsultaAlquiler().setVisible(true);
this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
new Menu().setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new RegistroAlqui().setVisible(true);
this.setVisible(false);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new DevolucionAlquiler().setVisible(true);
this.setVisible(false);
}//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menuAlquiler().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
