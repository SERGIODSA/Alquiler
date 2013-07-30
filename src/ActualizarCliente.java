import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActualizarCliente extends javax.swing.JFrame {
    Conexion cxn;
    ResultSet busquedacliente;
    ResultSetMetaData metaDatos;
    int numeroColumnas;
    String cliente[][];
    String resultado[];
    Image cd;
    public ActualizarCliente() {
        cxn = new Conexion();
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        escoger = new javax.swing.ButtonGroup();
        error = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        error2 = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aceptar4 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        atras = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jEImagePanel2 = new JEImagePanel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        limpiar = new javax.swing.JButton();

        advertencia.setTitle("Mensaje");
        advertencia.setMinimumSize(new java.awt.Dimension(330, 160));
        advertencia.setModal(true);
        advertencia.getContentPane().setLayout(null);

        aceptar.setText("Aceptar");
        aceptar.setFocusPainted(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(aceptar);
        aceptar.setBounds(40, 70, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(cancelar);
        cancelar.setBounds(180, 70, 90, 30);

        jLabel3.setText("Esta operacion actualizara la informacion de");
        advertencia.getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 20, 260, 14);

        jLabel10.setText("este usuario ¿Desea continuar?");
        advertencia.getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 40, 200, 14);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-question.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 20, 32, 30);

        error.setMinimumSize(new java.awt.Dimension(280, 140));
        error.setModal(true);
        error.getContentPane().setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 10, 32, 40);

        jLabel15.setText("Existe uno o mas campos en blanco");
        error.getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 10, 230, 30);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar3);
        aceptar3.setBounds(90, 50, 90, 30);

        jLabel13.setText("jLabel13");

        error2.setMaximumSize(new java.awt.Dimension(290, 130));
        error2.setMinimumSize(new java.awt.Dimension(290, 130));
        error2.setModal(true);
        error2.setPreferredSize(new java.awt.Dimension(290, 130));
        error2.setResizable(false);
        error2.getContentPane().setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error2.getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 32, 40);

        jLabel17.setText("Esta cedula no se encuentra registrada");
        error2.getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 20, 270, 14);

        aceptar4.setText("Aceptar");
        aceptar4.setFocusPainted(false);
        aceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar4ActionPerformed(evt);
            }
        });
        error2.getContentPane().add(aceptar4);
        aceptar4.setBounds(90, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizacion de datos del usuario");

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        atras.setText("Atras");
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(atras);
        atras.setBounds(519, 480, 70, 30);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

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
        buscar.setBounds(370, 60, 110, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(30, 120, 61, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(30, 100, 490, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        nombre.setBounds(110, 120, 200, 30);
        jDesktopPane1.add(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        apellido.setBounds(110, 160, 200, 30);
        jDesktopPane1.add(apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jLabel5.setBounds(30, 200, 65, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setBounds(30, 160, 59, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        codigo.setEditable(false);
        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.setBounds(110, 200, 50, 30);
        jDesktopPane1.add(codigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setBounds(160, 200, 20, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setBounds(180, 200, 130, 30);
        jDesktopPane1.add(telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setBounds(110, 240, 200, 30);
        jDesktopPane1.add(email, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-mail:");
        jLabel6.setBounds(30, 240, 47, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Socio:");
        jLabel4.setBounds(30, 280, 50, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        direccion.setEditable(false);
        direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccion.setBounds(110, 320, 410, 30);
        jDesktopPane1.add(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel9.setText("actualizacion de datos del cliente");
        jLabel9.setBounds(80, 20, 430, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        actualizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        actualizar.setText("Actualizar usuario");
        actualizar.setEnabled(false);
        actualizar.setFocusPainted(false);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        actualizar.setBounds(180, 370, 220, 40);
        jDesktopPane1.add(actualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Dirección:");
        jLabel12.setBounds(30, 320, 67, 30);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jEImagePanel2.setBounds(340, 120, 180, 190);
        jDesktopPane1.add(jEImagePanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        si.setBackground(new java.awt.Color(175, 213, 240));
        si.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        si.setText("Si");
        si.setEnabled(false);
        si.setBounds(140, 280, 60, 30);
        jDesktopPane1.add(si, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(si);

        no.setBackground(new java.awt.Color(175, 213, 240));
        no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        no.setText("No");
        no.setEnabled(false);
        no.setBounds(230, 280, 60, 30);
        jDesktopPane1.add(no, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(no);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 560, 430);

        limpiar.setText("Limpiar");
        limpiar.setEnabled(false);
        limpiar.setFocusPainted(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jEImagePanel1.add(limpiar);
        limpiar.setBounds(30, 480, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void limpiar(){
    cedula.setText("");
    nombre.setText("");
    apellido.setText("");
    codigo.setText("");
    telefono.setText("");
    direccion.setText("");
    email.setText("");
}
public void desactivar(){
    nombre.setEditable(false);
    apellido.setEditable(false);
    codigo.setEditable(false);
    telefono.setEditable(false);
    email.setEditable(false);
    direccion.setEditable(false);
    buscar.setEnabled(false);
    limpiar.setEnabled(false);
    actualizar.setEnabled(false);
}
    
private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    this.setVisible(false);
    new GestionCliente().setVisible(true);
}//GEN-LAST:event_atrasActionPerformed

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

private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String ced = cedula.getText();
        int c=0;
        busquedacliente = cxn.Consulta("SELECT Nombre,Apellido,CodigoArea,Telefono,Direccion,Email,Socio FROM peliculas.clientes WHERE Cedula='"+ced+"'");       
        try{
            metaDatos = busquedacliente.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();  // Se obtiene el numero de columnas
            cliente = new String[7][numeroColumnas];
            while (busquedacliente.next()){
                for (int i=0;i<numeroColumnas;i++){
                    cliente[c][i]= busquedacliente.getString(i+1);
                }
                c++;
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(c!=0){
            si.setEnabled(true);
            no.setEnabled(true);
            buscar.setEnabled(false);
            cedula.setEditable(false);
            nombre.setText(cliente[0][0]);
            apellido.setText(cliente[0][1]);
            codigo.setText(cliente[0][2]);
            telefono.setText(cliente[0][3]);
            direccion.setText(cliente[0][4]);
            email.setText(cliente[0][5]);
            if(cliente[0][6].equals("Si"))
                si.setSelected(true);
            else if(cliente[0][6].equals("No"))
                no.setSelected(true);
            buscar.setEnabled(false);
            actualizar.setEnabled(true);
            limpiar.setEnabled(true);
            nombre.setEditable(true);
            apellido.setEditable(true);
            codigo.setEditable(true);
            telefono.setEditable(true);
            email.setEditable(true);
            direccion.setEditable(true);
        }
        else{
            cedula.setText("");
            error2.setLocationRelativeTo(null);
            error2.getContentPane().setBackground(new Color(222,222,222));
            error2.setVisible(true);
        }
}//GEN-LAST:event_buscarActionPerformed

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

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        buscar.setEnabled(true);
        cedula.setEditable(true);
        si.setEnabled(false);
        no.setEnabled(false);
        escoger.clearSelection();
        limpiar();
        desactivar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if((nombre.getText().equals(""))||(apellido.getText().equals(""))||(telefono.getText().equals(""))||
           (codigo.getText().equals(""))||(email.getText().equals(""))||(direccion.getText().equals(""))){
            error.setLocationRelativeTo(null);
            error.getContentPane().setBackground(new Color(222,222,222));
            error.setVisible(true);
        }
        else{
            advertencia.setLocationRelativeTo(null);
            advertencia.getContentPane().setBackground(new Color(222,222,222));
            advertencia.setVisible(true);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String Socio=null;
        if(si.isSelected()){
            Socio="Si";
        }
        else if(no.isSelected()){
            Socio="No";
        }
        String sql="UPDATE peliculas.clientes SET Nombre='"+nombre.getText()+"',Apellido='"+cedula.getText()+"',"
                  +"CodigoArea='"+codigo.getText()+"',Telefono='"+telefono.getText()+"',Direccion='"+direccion.getText()+"',"
                  +"Email='"+email.getText()+"',Socio='"+Socio+"' WHERE Cedula='"+cedula.getText()+"'";
        cxn.Ejecutar(sql);
        advertencia.setVisible(false);
        this.setVisible(false);
        new GestionCliente().setVisible(true);
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void aceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar4ActionPerformed
        error2.setVisible(false);
    }//GEN-LAST:event_aceptar4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActualizarCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton aceptar4;
    private javax.swing.JButton actualizar;
    private javax.swing.JDialog advertencia;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton atras;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JDialog error;
    private javax.swing.JDialog error2;
    private javax.swing.ButtonGroup escoger;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private JEImagePanel jEImagePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
