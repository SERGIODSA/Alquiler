import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarEliminarCliente extends javax.swing.JFrame {
    Conexion cxn;
    ResultSet busquedacliente;
    ResultSet busquedamulta;
    ResultSetMetaData metaDatos;
    Image cd;
    int numeroColumnas;
    String cliente[];
    String resultado[];
    public BuscarEliminarCliente() {
        initComponents();
        cxn=new Conexion();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advertencia = new javax.swing.JDialog();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        error = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        peliculas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        socio = new javax.swing.JTextField();
        jEImagePanel2 = new JEImagePanel();
        eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        advertencia.setTitle("Mensaje");
        advertencia.setMinimumSize(new java.awt.Dimension(290, 150));
        advertencia.setModal(true);
        advertencia.setResizable(false);
        advertencia.getContentPane().setLayout(null);

        aceptar.setText("Aceptar");
        aceptar.setFocusPainted(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(aceptar);
        aceptar.setBounds(30, 70, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(cancelar);
        cancelar.setBounds(160, 70, 90, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿Esta seguro que desea continuar?");
        advertencia.getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 30, 220, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Esta operacion eliminara este usuario");
        advertencia.getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 10, 220, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-warning.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 10, 40, 40);

        error.setMinimumSize(new java.awt.Dimension(290, 130));
        error.setModal(true);
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 10, 32, 40);

        jLabel16.setText("Esta cedula no se encuentra registrada");
        error.getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 20, 250, 14);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar2);
        aceptar2.setBounds(90, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda y eliminacion de usuario");
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        jDesktopPane1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(30, 120, 61, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setBounds(30, 160, 59, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");
        jLabel4.setBounds(30, 280, 67, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jLabel5.setBounds(30, 200, 65, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-mail:");
        jLabel6.setBounds(30, 240, 47, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cedula del cliente:");
        jLabel7.setBounds(30, 60, 130, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        cedula.setBounds(170, 60, 140, 30);
        jDesktopPane1.add(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(350, 60, 110, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(30, 100, 440, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        nombre.setBounds(120, 120, 190, 30);
        jDesktopPane1.add(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        apellido.setBounds(120, 160, 190, 30);
        jDesktopPane1.add(apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        peliculas.setEditable(false);
        peliculas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peliculas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peliculas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peliculasKeyTyped(evt);
            }
        });
        peliculas.setBounds(400, 320, 70, 30);
        jDesktopPane1.add(peliculas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setBounds(170, 200, 20, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nº Peliculas Alquiladas: ");
        jLabel10.setBounds(230, 320, 170, 30);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setBounds(190, 200, 120, 30);
        jDesktopPane1.add(telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);

        codigo.setEditable(false);
        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.setBounds(120, 200, 50, 30);
        jDesktopPane1.add(codigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel9.setText("Busqueda y eliminacion de clientes");
        jLabel9.setBounds(40, 20, 430, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        direccion.setEditable(false);
        direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccion.setBounds(120, 280, 350, 30);
        jDesktopPane1.add(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setBounds(120, 240, 190, 30);
        jDesktopPane1.add(email, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Socio:");
        jLabel14.setBounds(30, 320, 80, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        socio.setEditable(false);
        socio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        socio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        socio.setBounds(120, 320, 100, 30);
        jDesktopPane1.add(socio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jEImagePanel2.setBounds(330, 120, 140, 150);
        jDesktopPane1.add(jEImagePanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eliminar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        eliminar.setText("Eliminar usuario");
        eliminar.setEnabled(false);
        eliminar.setFocusPainted(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        eliminar.setBounds(150, 370, 200, 40);
        jDesktopPane1.add(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 500, 430);

        jButton2.setText("Atras");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton2);
        jButton2.setBounds(460, 470, 70, 30);

        limpiar.setText("Limpiar");
        limpiar.setEnabled(false);
        limpiar.setFocusPainted(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jEImagePanel1.add(limpiar);
        limpiar.setBounds(30, 470, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char C = evt.getKeyChar();
        if (((C < 'a') || (C > 'z')) && ((C < 'A') || (C > 'Z')) && (C != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        char C = evt.getKeyChar();
        if (((C < 'a') || (C > 'z')) && ((C < 'A') || (C > 'Z')) && (C != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void peliculasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peliculasKeyTyped
        int limite = 4;
        char C = evt.getKeyChar();
        if (((peliculas.getText().length() == limite)) || ((C < '0') || (C > '9'))) {
            evt.consume(); // TODO add your handling code here:
        }     }//GEN-LAST:event_peliculasKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new GestionCliente().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        int limite = 8;
        char C=evt.getKeyChar();
        if (((C<'0')||(C>'9'))||((cedula.getText().length()== limite)))
            evt.consume();
        if (cedula.getText().length()==7)
            buscar.setEnabled(true);
        if (cedula.getText().length()<7)
            buscar.setEnabled(false);
    }//GEN-LAST:event_cedulaKeyTyped

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        eliminar.setEnabled(false);
        buscar.setEnabled(false);
        limpiar.setEnabled(false);
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        codigo.setText("");
        telefono.setText("");
        direccion.setText("");
        email.setText("");
        peliculas.setText("");
        socio.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String ced = cedula.getText();
        int c=0;
        busquedacliente = cxn.Consulta("SELECT Nombre,Apellido,CodigoArea,Telefono,Direccion,Email,Socio,Num_Peliculas_Alq FROM peliculas.clientes WHERE Cedula='"+ced+"'");   
        try{
            metaDatos = busquedacliente.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();  // Se obtiene el numero de columnas
            cliente = new String[numeroColumnas];
            while (busquedacliente.next()){
                for (int i=0;i<numeroColumnas;i++){
                    cliente[i]= busquedacliente.getString(i+1);
                    c++;
                }
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(c!=0){
            nombre.setText(cliente[0]);
            apellido.setText(cliente[1]);
            codigo.setText(cliente[2]);
            telefono.setText(cliente[3]);
            direccion.setText(cliente[4]);
            email.setText(cliente[5]);
            socio.setText(cliente[6]);
            peliculas.setText(cliente[7]);
            limpiar.setEnabled(true);
            buscar.setEnabled(false);
            eliminar.setEnabled(true);
        }
        else{
            cedula.setText("");
            buscar.setEnabled(false);
            error.setLocationRelativeTo(null);
            error.getContentPane().setBackground(new Color(222,222,222));
            error.setVisible(true);   
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        advertencia.setLocationRelativeTo(null);
        advertencia.getContentPane().setBackground(new Color(222,222,222));
        advertencia.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        advertencia.setVisible(false);
        String sql = "DELETE FROM peliculas.clientes WHERE Cedula='"+cedula.getText()+"'";
        cxn.Ejecutar(sql);
        this.setVisible(false);
        new GestionCliente().setVisible(true);
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscarEliminarCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aceptar2;
    private javax.swing.JDialog advertencia;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JDialog error;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private JEImagePanel jEImagePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peliculas;
    private javax.swing.JTextField socio;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}