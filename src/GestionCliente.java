
import java.awt.Image;
import java.awt.Toolkit;

public class GestionCliente extends javax.swing.JFrame {
    Image cd;
    public GestionCliente() {
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
        agregar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de usuarios");

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GESTION DE clientes");
        jLabel7.setBounds(20, 20, 280, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        agregar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir usuario.png"))); // NOI18N
        agregar.setText("Agregar clientes");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        agregar.setBounds(50, 60, 220, 50);
        jDesktopPane1.add(agregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        consultar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar usuario.png"))); // NOI18N
        consultar.setText("Consultar clientes");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        consultar.setBounds(50, 200, 220, 50);
        jDesktopPane1.add(consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eliminar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar usuario.png"))); // NOI18N
        eliminar.setText("Eliminar clientes");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        eliminar.setBounds(50, 130, 220, 50);
        jDesktopPane1.add(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        actualizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar usuario.png"))); // NOI18N
        actualizar.setText("Actualizar clientes");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        actualizar.setBounds(50, 270, 220, 50);
        jDesktopPane1.add(actualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menu.setText("Menu");
        menu.setFocusPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
    new RegistroCliente().setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_agregarActionPerformed

private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
    new BuscarEliminarCliente().setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_consultarActionPerformed

private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    this.setVisible(false);
    new BuscarEliminarCliente().setVisible(true);
}//GEN-LAST:event_eliminarActionPerformed

private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
    this.setVisible(false);
    new ActualizarCliente().setVisible(true);
}//GEN-LAST:event_actualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GestionCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
