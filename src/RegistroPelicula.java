import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class RegistroPelicula extends javax.swing.JFrame {
    Conexion cxn;
    Manejofechas formatofecha;
    Image cd;
    String genero, censura, pelicula, reparto, uso, estatus, fecha;
    int cantidad, precio, ano;
    public RegistroPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        fechadehoy();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exito = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aceptar1 = new javax.swing.JButton();
        advertencia = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        error = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Pelicula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Reparto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Genero = new javax.swing.JComboBox();
        Censura = new javax.swing.JComboBox();
        registrar = new javax.swing.JButton();
        Uso = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        aano = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        exito.setMinimumSize(new java.awt.Dimension(305, 145));
        exito.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        exito.getContentPane().setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        exito.getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 10, 40, 40);

        jLabel12.setText("La pelicula ha sido registrada con exito.");
        exito.getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 20, 240, 20);

        aceptar1.setText("Aceptar");
        aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar1ActionPerformed(evt);
            }
        });
        exito.getContentPane().add(aceptar1);
        aceptar1.setBounds(110, 60, 80, 30);

        advertencia.setMaximumSize(new java.awt.Dimension(280, 140));
        advertencia.setMinimumSize(new java.awt.Dimension(280, 140));
        advertencia.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia.setPreferredSize(new java.awt.Dimension(280, 140));
        advertencia.getContentPane().setLayout(null);

        jLabel13.setText("Existe uno o mas campos en blanco");
        advertencia.getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 10, 250, 30);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(aceptar2);
        aceptar2.setBounds(90, 50, 90, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 32, 40);

        error.setMaximumSize(new java.awt.Dimension(270, 140));
        error.setMinimumSize(new java.awt.Dimension(270, 140));
        error.setModal(true);
        error.setPreferredSize(new java.awt.Dimension(270, 140));
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 10, 32, 40);

        jLabel20.setText("Fecha erronea");
        error.getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 20, 110, 14);

        aceptar3.setText("Aceptar");
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar3);
        aceptar3.setBounds(80, 50, 90, 30);

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de peliculas");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        Pelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PeliculaKeyTyped(evt);
            }
        });
        Pelicula.setBounds(180, 60, 260, 30);
        jDesktopPane1.add(Pelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre de pelicula:");
        jLabel1.setBounds(30, 60, 140, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Uso:");
        jLabel2.setBounds(320, 180, 40, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        Cantidad.setBounds(250, 180, 60, 30);
        jDesktopPane1.add(Cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jLabel4.setBounds(200, 220, 20, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Censura:");
        jLabel5.setBounds(320, 220, 62, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Reparto:");
        jLabel6.setBounds(30, 100, 70, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Reparto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RepartoKeyTyped(evt);
            }
        });
        Reparto.setBounds(100, 100, 340, 30);
        jDesktopPane1.add(Reparto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad:");
        jLabel7.setBounds(170, 180, 80, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AnoKeyTyped(evt);
            }
        });
        Ano.setBounds(100, 180, 60, 30);
        jDesktopPane1.add(Ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio:");
        jLabel8.setBounds(250, 140, 60, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });
        Precio.setBounds(320, 140, 120, 30);
        jDesktopPane1.add(Precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registro de Peliculas");
        jLabel9.setBounds(70, 20, 330, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comedia", "Romance", "Accion", "Terror", "Ciencia Ficcion", "Drama" }));
        Genero.setBounds(100, 140, 120, 30);
        jDesktopPane1.add(Genero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Censura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B", "C", "D" }));
        Censura.setBounds(400, 220, 40, 30);
        jDesktopPane1.add(Censura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        registrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.setBounds(160, 270, 160, 40);
        jDesktopPane1.add(registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Uso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Alquiler", "Venta" }));
        Uso.setBounds(360, 180, 80, 30);
        jDesktopPane1.add(Uso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        jLabel3.setBounds(30, 220, 60, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Año:");
        jLabel15.setBounds(30, 180, 40, 30);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setBounds(100, 220, 40, 30);
        jDesktopPane1.add(dia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mes.setBounds(160, 220, 40, 30);
        jDesktopPane1.add(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aano.setBounds(220, 220, 60, 30);
        jDesktopPane1.add(aano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Genero:");
        jLabel16.setBounds(30, 140, 70, 30);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("-");
        jLabel17.setBounds(140, 220, 20, 30);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 470, 330);

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(atras);
        atras.setBounds(430, 370, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    this.setVisible(false);
    new GestionInventario().setVisible(true);
}//GEN-LAST:event_atrasActionPerformed

public void limpiar(){
    Genero.setSelectedIndex(0);
    Censura.setSelectedIndex(0);
    Uso.setSelectedIndex(0);
    Pelicula.setText("");
    Reparto.setText("");
    Ano.setText("");
    Precio.setText("");
    Cantidad.setText("");
}

private void fechadehoy(){
    String hoy = formatofecha.fecha();
    String desgloce[] = hoy.split("-");
    dia.setSelectedItem(desgloce[0]);
    mes.setSelectedItem(desgloce[1]);
    aano.setSelectedItem(desgloce[2]);
}

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if(!(Genero.getSelectedItem().toString().equalsIgnoreCase("..."))&&!(Censura.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        !(Uso.getSelectedItem().toString().equalsIgnoreCase("..."))&&(Pelicula.getText()!=null)&&(Reparto.getText()!=null)&&
         (Ano.getText()!=null)&&(Precio.getText()!=null)&&(Cantidad.getText()!=null)&&!(dia.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        !(aano.getSelectedItem().toString().equalsIgnoreCase("..."))&&!(mes.getSelectedItem().toString().equalsIgnoreCase("..."))){
            fecha = aano.getSelectedItem().toString()+"-"+mes.getSelectedItem().toString()+"-"+dia.getSelectedItem().toString();
            Boolean band = formatofecha.formato(fecha);
            if(band==false){
                estatus = "Disponible";
                genero = Genero.getSelectedItem().toString();
                censura = Censura.getSelectedItem().toString();
                uso = Uso.getSelectedItem().toString();
                pelicula = Pelicula.getText();
                reparto = Reparto.getText();
                ano = Integer.parseInt(Ano.getText());
                precio = Integer.parseInt(Precio.getText());
                cantidad = Integer.parseInt(Cantidad.getText());
                String cond = null;
                if(uso.equals("Alquiler"))
                    cond="Buena";
                else
                    cond="Nueva";
                String sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,"
                            +"Veces_Alquilada,Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus,Registro) "
                            +"VALUES ('"+pelicula+"','"+ano+"','"+genero+"','"+censura+"','"+reparto+"','"+uso+"','"+cond+"',"
                            +"'"+cantidad+"','"+precio+"','0','','0','"+fecha+"','"+fecha+"','"+fecha+"','"+estatus+"','Vigente')";
                cxn.Ejecutar(sql);
                exito.setLocationRelativeTo(null);
                exito.getContentPane().setBackground(new Color(222,222,222));
                exito.setVisible(true);
            }
            else{
                error.setLocationRelativeTo(null);
                error.getContentPane().setBackground(new Color(222,222,222));
                error.setVisible(true);
            }
        }
        else{
            advertencia.setLocationRelativeTo(null);
            advertencia.getContentPane().setBackground(new Color(222,222,222));
            advertencia.setVisible(true);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar1ActionPerformed
        exito.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_aceptar1ActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void RepartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepartoKeyTyped
        int limite = 160;
        char C=evt.getKeyChar();
        char D=39;
        if ((Reparto.getText().length()== limite)||(C==D))
            evt.consume();
    }//GEN-LAST:event_RepartoKeyTyped

    private void PeliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PeliculaKeyTyped
        int limite = 60;
        char C=evt.getKeyChar();
        char D=39;
        if ((Pelicula.getText().length()== limite)||(C==D))
            evt.consume();
    }//GEN-LAST:event_PeliculaKeyTyped

    private void AnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnoKeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
        if (((Ano.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_AnoKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
        if (((Cantidad.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_CantidadKeyTyped

    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Precio.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_PrecioKeyTyped

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroPelicula().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JComboBox Censura;
    private javax.swing.JComboBox Genero;
    private javax.swing.JTextField Pelicula;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Reparto;
    private javax.swing.JComboBox Uso;
    private javax.swing.JComboBox aano;
    private javax.swing.JButton aceptar1;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JDialog advertencia;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox dia;
    private javax.swing.JDialog error;
    private javax.swing.JDialog exito;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox mes;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
