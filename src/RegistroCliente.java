import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroCliente extends javax.swing.JFrame {
Conexion cxn;
ResultSet busquedacedula;
ResultSetMetaData metaDatos;
Image cd;
String Ced[][];
int numeroColumnas;
    public RegistroCliente() {
        cxn = new Conexion();
        initComponents();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escoger = new javax.swing.ButtonGroup();
        informacion = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        informacion2 = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        informacion3 = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jEImagePanel2 = new JEImagePanel();
        jButton2 = new javax.swing.JButton();
        telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();

        escoger.add(si);
        escoger.add(no);

        informacion.setMinimumSize(new java.awt.Dimension(290, 130));
        informacion.setModal(true);
        informacion.setResizable(false);
        informacion.getContentPane().setLayout(null);

        jButton3.setText("Aceptar");
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        informacion.getContentPane().add(jButton3);
        jButton3.setBounds(90, 50, 90, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        informacion.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 40, 40);

        jLabel11.setText("El usuario ha sido registrado con exito");
        informacion.getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 20, 230, 20);

        informacion2.setMinimumSize(new java.awt.Dimension(280, 140));
        informacion2.setModal(true);
        informacion2.setResizable(false);
        informacion2.getContentPane().setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        informacion2.getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 10, 40, 40);

        jLabel13.setText("Existe uno o mas campos en blanco");
        informacion2.getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 10, 210, 30);

        jLabel14.setText("Verifique  la informacion ingresada");
        informacion2.getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 30, 210, 20);

        aceptar.setText("Aceptar");
        aceptar.setFocusPainted(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        informacion2.getContentPane().add(aceptar);
        aceptar.setBounds(90, 60, 90, 30);

        informacion3.setMinimumSize(new java.awt.Dimension(295, 140));
        informacion3.setModal(true);
        informacion3.setResizable(false);
        informacion3.getContentPane().setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        informacion3.getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 10, 40, 40);

        jLabel16.setText("El usuario ya se encuenta registrado");
        informacion3.getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 20, 220, 20);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        informacion3.getContentPane().add(aceptar2);
        aceptar2.setBounds(100, 60, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setForeground(new java.awt.Color(51, 153, 255));
        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jButton1.setText("Atras");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton1);
        jButton1.setBounds(559, 470, 70, 30);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de nuevos clientes");
        jLabel7.setBounds(120, 30, 360, 21);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(40, 90, 61, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        nombre.setBounds(120, 90, 190, 30);
        jDesktopPane1.add(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setBounds(40, 130, 59, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        apellido.setBounds(120, 130, 190, 30);
        jDesktopPane1.add(apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cedula:");
        jLabel3.setBounds(40, 170, 52, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        cedula.setBounds(120, 170, 190, 30);
        jDesktopPane1.add(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");
        jLabel4.setBounds(40, 330, 67, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        direccion.setBounds(120, 330, 440, 30);
        jDesktopPane1.add(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jEImagePanel2.setBounds(340, 90, 220, 230);
        jDesktopPane1.add(jEImagePanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(220, 380, 160, 40);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        telefono.setBounds(190, 210, 120, 30);
        jDesktopPane1.add(telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jLabel5.setBounds(40, 210, 65, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Socio:");
        jLabel6.setBounds(40, 290, 42, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        email.setBounds(120, 250, 190, 30);
        jDesktopPane1.add(email, javax.swing.JLayeredPane.DEFAULT_LAYER);

        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        codigo.setBounds(120, 210, 50, 30);
        jDesktopPane1.add(codigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setBounds(170, 254, 20, 20);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("E-mail:");
        jLabel9.setBounds(40, 250, 47, 30);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(40, 70, 520, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        si.setBackground(new java.awt.Color(175, 213, 240));
        si.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        si.setText("Si");
        si.setBounds(150, 290, 50, 30);
        jDesktopPane1.add(si, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(si);

        no.setBackground(new java.awt.Color(175, 213, 240));
        no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        no.setText("No");
        no.setBounds(230, 290, 60, 30);
        jDesktopPane1.add(no, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(no);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 600, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Nombre, Apellido, Direccion, Email, Telefono, Codigo, temp, sql;
        String Socio = null;
        int Cedula;
        int aux=0;
        Nombre=nombre.getText();
        Apellido=apellido.getText();
        if(cedula.getText().isEmpty())
            Cedula=0;
        else
            Cedula=Integer.parseInt(cedula.getText());
        Direccion=direccion.getText();
        Codigo=codigo.getText();
        Telefono=telefono.getText();
        Email=email.getText();
        if(si.isSelected()){
            Socio="Si";
        }
        else if(no.isSelected()){
            Socio="No";
        }
        busquedacedula = cxn.Consulta("SELECT Cedula FROM peliculas.clientes");
        try{
            metaDatos = busquedacedula.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();  // Se obtiene el numero de columnas
            Ced = new String[1][numeroColumnas];
            while (busquedacedula.next()){
                for (int i=0;i<numeroColumnas;i++){
                    Ced[0][i]= busquedacedula.getString(i+1);
                    if(Integer.parseInt(Ced[0][i])==Cedula)
                        aux = Cedula;
                }
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if((Socio == null)||(nombre.getText()==null)||(apellido.getText()==null)||
          (Cedula==0)||(direccion.getText()==null)||(codigo.getText()==null)||
          (telefono.getText()==null)||(email.getText()==null)){
            informacion2.setLocationRelativeTo(null);
            informacion2.getContentPane().setBackground(new Color(222,222,222));
            informacion2.setVisible(true);
        }
        else if(Cedula==aux){
            informacion3.setLocationRelativeTo(null);
            informacion3.getContentPane().setBackground(new Color(222,222,222));
            informacion3.setVisible(true);
        }
        else{
            sql="INSERT INTO peliculas.clientes (Cedula,Nombre,Apellido,CodigoArea,Telefono,Direccion,Email,Socio,Num_Multas,Num_Peliculas_Alq) VALUES"
                +"('"+Cedula+"','"+Nombre+"','"+Apellido+"','"+Codigo+"','"+Telefono+"','"+Direccion+"','"+Email+"','"+Socio+"','0','0')";
            cxn.Ejecutar(sql);
            nombre.setText(null);
            apellido.setText(null);
            cedula.setText(null);
            direccion.setText(null);
            codigo.setText(null);
            telefono.setText(null);
            email.setText(null);
            no.setSelected(false);
            si.setSelected(false);
            informacion.setLocationRelativeTo(null);
            informacion.getContentPane().setBackground(new Color(222,222,222));
            informacion.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
    char C=evt.getKeyChar();
    if(((C<'a')||(C>'z'))&&((C<'A')||(C>'Z'))&&(C!=' '))
        evt.consume();
}//GEN-LAST:event_nombreKeyTyped

private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
    char C=evt.getKeyChar();
    if(((C<'a')||(C>'z'))&&((C<'A')||(C>'Z'))&&(C!=' '))
        evt.consume();
}//GEN-LAST:event_apellidoKeyTyped

private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
    int limite = 8;
    char C=evt.getKeyChar();
    if (((cedula.getText().length()== limite))||((C<'0')||(C>'9')))
        evt.consume();
}//GEN-LAST:event_cedulaKeyTyped

private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
    int limite = 4;
    char C=evt.getKeyChar();
    if (((codigo.getText().length()== limite))||((C<'0')||(C>'9')))
        evt.consume();
}//GEN-LAST:event_codigoKeyTyped

private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
    int limite = 7;
    char C=evt.getKeyChar();
    if (((telefono.getText().length()== limite))||((C<'0')||(C>'9')))
        evt.consume();
}//GEN-LAST:event_telefonoKeyTyped

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.setVisible(false);
    informacion.setVisible(false);
    new GestionCliente().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    new GestionCliente().setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        informacion2.setVisible(false);
    }//GEN-LAST:event_aceptarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        informacion3.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aceptar2;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.ButtonGroup escoger;
    private javax.swing.JDialog informacion;
    private javax.swing.JDialog informacion2;
    private javax.swing.JDialog informacion3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
