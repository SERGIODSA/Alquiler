
import java.awt.Image;
import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {
    Image cd;
    public Menu() {
        initComponents();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new JEImagePanel();
        venta = new javax.swing.JButton();
        alquiler = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jEImagePanel4 = new JEImagePanel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu ");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        venta.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        venta.setText("Venta de Peliculas");
        venta.setFocusPainted(false);
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });
        jEImagePanel1.add(venta);
        venta.setBounds(580, 260, 240, 60);

        alquiler.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        alquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alquiler.png"))); // NOI18N
        alquiler.setText("Alquiler de Peliculas");
        alquiler.setFocusPainted(false);
        alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerActionPerformed(evt);
            }
        });
        jEImagePanel1.add(alquiler);
        alquiler.setBounds(480, 180, 240, 60);

        finalizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        finalizar.setText("Salir");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        jEImagePanel1.add(finalizar);
        finalizar.setBounds(730, 390, 70, 30);

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/porta.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jEImagePanel1.add(jEImagePanel4);
        jEImagePanel4.setBounds(10, 230, 216, 192);

        usuario.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        usuario.setText("Gestion de Usuarios");
        usuario.setFocusPainted(false);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jEImagePanel1.add(usuario);
        usuario.setBounds(280, 20, 240, 60);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 75)); // NOI18N
        jLabel1.setText("Zona DVD");
        jEImagePanel1.add(jLabel1);
        jLabel1.setBounds(360, 360, 279, 63);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        jButton1.setText("Gestion de Inventario");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton1);
        jButton1.setBounds(380, 100, 240, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
 new GestionCliente().setVisible(true);
 this.setVisible(false);
}//GEN-LAST:event_usuarioActionPerformed

private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
    this.setVisible(false);
    System.exit(0); 
}//GEN-LAST:event_finalizarActionPerformed

private void alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerActionPerformed
new menuAlquiler().setVisible(true);
this.setVisible(false);
}//GEN-LAST:event_alquilerActionPerformed

private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
new menuVenta().setVisible(true);  
this.setVisible(false);
}//GEN-LAST:event_ventaActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new GestionInventario().setVisible(true);  
this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquiler;
    private javax.swing.JButton finalizar;
    private javax.swing.JButton jButton1;
    private JEImagePanel jEImagePanel1;
    private JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton usuario;
    private javax.swing.JButton venta;
    // End of variables declaration//GEN-END:variables
}
