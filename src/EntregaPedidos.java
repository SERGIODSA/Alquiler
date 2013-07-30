import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntregaPedidos extends javax.swing.JFrame {
    Conexion cxn;
    Manejofechas formatofecha;
    Image cd;
    ResultSet consultapedidos;
    ResultSet conteo;
    ResultSetMetaData metaDatos;
    String sql;
    String sql2;
    String consulta[];
    int numeroColumnas;
    public EntregaPedidos() {
        initComponents();
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        setLocationRelativeTo(null);
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advertencia = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        exito = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        advertencia2 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        error = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        error2 = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        IDPelicula = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        Predido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        esperada = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buscar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        Ano = new javax.swing.JComboBox();
        Atras = new javax.swing.JButton();

        advertencia.setMinimumSize(new java.awt.Dimension(290, 140));
        advertencia.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia.setResizable(false);
        advertencia.getContentPane().setLayout(null);

        jButton1.setText("Aceptar");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(jButton1);
        jButton1.setBounds(100, 60, 80, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 40, 40);

        jLabel11.setText("El pedido no se encuentra registrado");
        advertencia.getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 20, 210, 20);

        exito.setMinimumSize(new java.awt.Dimension(310, 140));
        exito.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        exito.setResizable(false);
        exito.getContentPane().setLayout(null);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        exito.getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 11, 40, 40);

        jLabel13.setText("El pedido fue registrado correctamente");
        exito.getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 20, 250, 20);

        jButton2.setText("Aceptar");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        exito.getContentPane().add(jButton2);
        jButton2.setBounds(110, 60, 80, 30);

        advertencia2.setMinimumSize(new java.awt.Dimension(270, 130));
        advertencia2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia2.setResizable(false);
        advertencia2.getContentPane().setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia2.getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 40);

        jLabel15.setText("Esta pelicula ya esta disponible");
        advertencia2.getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 20, 200, 14);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        advertencia2.getContentPane().add(aceptar2);
        aceptar2.setBounds(90, 50, 80, 30);

        error.setMaximumSize(new java.awt.Dimension(270, 140));
        error.setMinimumSize(new java.awt.Dimension(270, 140));
        error.setModal(true);
        error.setPreferredSize(new java.awt.Dimension(270, 140));
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 32, 40);

        jLabel17.setText("Fecha erronea");
        error.getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 20, 130, 14);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar3);
        aceptar3.setBounds(80, 50, 90, 30);

        error2.setMaximumSize(new java.awt.Dimension(275, 130));
        error2.setMinimumSize(new java.awt.Dimension(275, 130));
        error2.setModal(true);
        error2.setPreferredSize(new java.awt.Dimension(275, 130));
        error2.setResizable(false);
        error2.getContentPane().setLayout(null);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error2.getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 10, 40, 40);

        jLabel19.setText("Existe uno o mas campos vacios");
        error2.getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 20, 210, 14);

        jButton3.setText("Aceptar");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        error2.getContentPane().add(jButton3);
        jButton3.setBounds(90, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrega de pedidos");

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de entrega");
        jLabel7.setBounds(70, 20, 310, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Pelicula:");
        jLabel2.setBounds(20, 60, 90, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.setEnabled(false);
        Dia.setBounds(260, 190, 40, 30);
        jDesktopPane1.add(Dia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.setBounds(360, 190, 20, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes.setEnabled(false);
        Mes.setBounds(320, 190, 40, 30);
        jDesktopPane1.add(Mes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setBounds(300, 190, 20, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        IDPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDPeliculaKeyTyped(evt);
            }
        });
        IDPelicula.setBounds(120, 60, 80, 30);
        jDesktopPane1.add(IDPelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cantidad.setEditable(false);
        Cantidad.setEnabled(false);
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        Cantidad.setBounds(400, 110, 40, 30);
        jDesktopPane1.add(Cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fecha esperada (dd/mm/aaaa):");
        jLabel5.setBounds(20, 230, 220, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        jLabel6.setBounds(310, 110, 90, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Registrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setEnabled(false);
        Registrar.setFocusPainted(false);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        Registrar.setBounds(140, 270, 160, 40);
        jDesktopPane1.add(Registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio (Alquiler/Venta):");
        jLabel14.setBounds(20, 150, 180, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio (Pedido):");
        jLabel8.setBounds(20, 110, 130, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Precio.setEditable(false);
        Precio.setEnabled(false);
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });
        Precio.setBounds(200, 150, 80, 30);
        jDesktopPane1.add(Precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Predido.setEditable(false);
        Predido.setEnabled(false);
        Predido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PredidoKeyTyped(evt);
            }
        });
        Predido.setBounds(160, 110, 80, 30);
        jDesktopPane1.add(Predido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de entrega (dd/mm/aaaa):");
        jLabel9.setBounds(20, 190, 232, 30);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        esperada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        esperada.setForeground(new java.awt.Color(0, 0, 102));
        esperada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperada.setText("dd/mm/aaaa");
        esperada.setBounds(270, 230, 160, 30);
        jDesktopPane1.add(esperada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(20, 100, 420, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setText("Buscar");
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(250, 60, 90, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        borrar.setText("Borrar");
        borrar.setEnabled(false);
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        borrar.setBounds(350, 60, 90, 30);
        jDesktopPane1.add(borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Ano.setEnabled(false);
        Ano.setBounds(380, 190, 60, 30);
        jDesktopPane1.add(Ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 460, 330);

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(Atras);
        Atras.setBounds(420, 370, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Activacion(Boolean activar){
        IDPelicula.setEditable(!activar);
        buscar.setEnabled(!activar);
        borrar.setEnabled(activar);
        Registrar.setEnabled(activar);
        Predido.setEnabled(activar);
        Cantidad.setEnabled(activar);
        Precio.setEnabled(activar);
        Ano.setEnabled(activar);
        Dia.setEnabled(activar);
        Mes.setEnabled(activar);
        Predido.setEditable(activar);
        Cantidad.setEditable(activar);
        Precio.setEditable(activar);
    }
    
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if((!(Mes.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(Dia.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(Ano.getSelectedItem().toString().equalsIgnoreCase("...")))){
            String fecha = Ano.getSelectedItem().toString()+"-"+Mes.getSelectedItem().toString()+"-"+Dia.getSelectedItem().toString();
            Boolean band = formatofecha.formato(fecha);
            if(band==false){
                sql = "UPDATE peliculas.peliculas SET Cantidad='"+Cantidad.getText()+"',Precio='"+Precio.getText()+"',"
                    +"Precio_Pedido='"+Predido.getText()+"',Fecha_Entrega='"+fecha+"',Estatus='Disponible' "
                    +"WHERE idPelicula='"+IDPelicula.getText()+"'";
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
            error2.setLocationRelativeTo(null);
            error2.getContentPane().setBackground(new Color(222,222,222));
            error2.setVisible(true);
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exito.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Boolean existe=false;
        Boolean falta=false;
        int Conteo = 0;
        int c=0;
        try{
            sql = "SELECT idPelicula,Precio,Precio_Pedido,Cantidad,Fecha_Esperada FROM peliculas.peliculas "
                 +"WHERE idPelicula='"+IDPelicula.getText()+"' AND Estatus='Pedido'";
            consultapedidos = cxn.Consulta(sql);
            metaDatos = consultapedidos.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();  
            consulta = new String[numeroColumnas];
            while (consultapedidos.next()){
                for (int i=0;i<numeroColumnas;i++)
                    consulta[i]= consultapedidos.getString(i+1);
                c++;
            }
            if(c>0)
                existe=true;
            else{
                sql2 = "SELECT COUNT(idPelicula) FROM peliculas.peliculas WHERE idPelicula='"+IDPelicula.getText()+"' AND Estatus='Disponible'";
                conteo = cxn.Consulta(sql2);
                while (conteo.next()){
                    Conteo=Integer.parseInt(conteo.getString(1));
                }
                if(Conteo>0)
                    falta=true;
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(existe==true){
            Activacion(existe);
            Precio.setText(consulta[1]);
            Cantidad.setText(consulta[3]);
            Predido.setText(consulta[2]);
            String[] Fecha = consulta[4].split("-");
            String fecha = Fecha[2]+"/"+Fecha[1]+"/"+Fecha[0];
            esperada.setText(fecha);
            String hoy = formatofecha.fecha();
            String[] desgloce = hoy.split("-");
            Dia.setSelectedItem(desgloce[0]);
            Mes.setSelectedItem(desgloce[1]);
            Ano.setSelectedItem(desgloce[2]);
        }
        else if(falta==true){
            IDPelicula.setText("");
            advertencia2.setLocationRelativeTo(null);
            advertencia2.getContentPane().setBackground(new Color(222,222,222));
            advertencia2.setVisible(true);
        }
        else{
            IDPelicula.setText("");
            advertencia.setLocationRelativeTo(null);
            advertencia.getContentPane().setBackground(new Color(222,222,222));
            advertencia.setVisible(true);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Activacion(false);
        IDPelicula.setText("");
        Precio.setText("");
        Cantidad.setText("");
        Predido.setText("");
        esperada.setText("dd/mm/aaaa");
        Ano.setSelectedIndex(0);
        Dia.setSelectedIndex(0);
        Mes.setSelectedIndex(0);
    }//GEN-LAST:event_borrarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        advertencia2.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void IDPeliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDPeliculaKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((IDPelicula.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_IDPeliculaKeyTyped

    private void PredidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PredidoKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Predido.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_PredidoKeyTyped

    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Precio.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_PrecioKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Cantidad.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_CantidadKeyTyped

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        error2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntregaPedidos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Ano;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JComboBox Dia;
    private javax.swing.JTextField IDPelicula;
    private javax.swing.JComboBox Mes;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Predido;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JDialog advertencia;
    private javax.swing.JDialog advertencia2;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JDialog error;
    private javax.swing.JDialog error2;
    private javax.swing.JLabel esperada;
    private javax.swing.JDialog exito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
