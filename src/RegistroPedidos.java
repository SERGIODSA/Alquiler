import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class RegistroPedidos extends javax.swing.JFrame {
    Image cd;
    Conexion cxn;
    Manejofechas formatofecha;
    String fecha;
    public RegistroPedidos() {
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

        escoger = new javax.swing.ButtonGroup();
        advertencia = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        exito = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        error = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        alquiler = new javax.swing.JRadioButton();
        venta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        distribuidor = new javax.swing.JTextField();
        Dia = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reparto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        censura = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        predido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Dia1 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        Mes1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        aano = new javax.swing.JComboBox();
        aano1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        escoger.add(alquiler);
        escoger.add(venta);

        advertencia.setMaximumSize(new java.awt.Dimension(275, 130));
        advertencia.setMinimumSize(new java.awt.Dimension(275, 130));
        advertencia.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia.setPreferredSize(new java.awt.Dimension(275, 130));
        advertencia.setResizable(false);
        advertencia.getContentPane().setLayout(null);

        jButton2.setText("Aceptar");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(jButton2);
        jButton2.setBounds(90, 50, 90, 30);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 10, 40, 40);

        jLabel21.setText("Existe uno o mas campos vacios");
        advertencia.getContentPane().add(jLabel21);
        jLabel21.setBounds(60, 20, 210, 14);

        exito.setMinimumSize(new java.awt.Dimension(275, 130));
        exito.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        exito.setResizable(false);
        exito.getContentPane().setLayout(null);

        jButton3.setText("Aceptar");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        exito.getContentPane().add(jButton3);
        jButton3.setBounds(90, 50, 83, 32);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        exito.getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 10, 40, 40);

        jLabel19.setText("El registro se realizo con exito");
        exito.getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 20, 190, 14);

        error.setMinimumSize(new java.awt.Dimension(270, 140));
        error.setModal(true);
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 10, 32, 40);

        jLabel23.setText("Fecha erronea");
        error.getContentPane().add(jLabel23);
        jLabel23.setBounds(50, 20, 110, 14);

        aceptar3.setText("Aceptar");
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar3);
        aceptar3.setBounds(80, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de pedidos");

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de Pedidos");
        jLabel7.setBounds(70, 20, 320, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        alquiler.setBackground(new java.awt.Color(175, 213, 240));
        alquiler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alquiler.setText("Alquiler");
        alquiler.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        alquiler.setBounds(110, 180, 80, 30);
        jDesktopPane1.add(alquiler, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(alquiler);

        venta.setBackground(new java.awt.Color(175, 213, 240));
        venta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        venta.setText("Venta");
        venta.setBounds(200, 180, 70, 30);
        jDesktopPane1.add(venta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escoger.add(venta);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Censura:");
        jLabel1.setBounds(310, 140, 70, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peliculaKeyTyped(evt);
            }
        });
        pelicula.setBounds(180, 60, 270, 30);
        jDesktopPane1.add(pelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad:");
        jLabel8.setBounds(30, 260, 80, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        cantidad.setBounds(100, 260, 60, 30);
        jDesktopPane1.add(cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Registrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setFocusPainted(false);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        Registrar.setBounds(170, 380, 160, 40);
        jDesktopPane1.add(Registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de entrega (dd/mm/aaaa):");
        jLabel2.setBounds(30, 340, 240, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Distribuidor:");
        jLabel3.setBounds(170, 260, 100, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        distribuidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                distribuidorKeyTyped(evt);
            }
        });
        distribuidor.setBounds(270, 260, 180, 30);
        jDesktopPane1.add(distribuidor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.setBounds(270, 340, 40, 30);
        jDesktopPane1.add(Dia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jLabel4.setBounds(370, 340, 20, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes.setBounds(330, 340, 40, 30);
        jDesktopPane1.add(Mes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.setBounds(310, 340, 20, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio (Pedido):");
        jLabel6.setBounds(270, 220, 130, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reparto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repartoKeyTyped(evt);
            }
        });
        reparto.setBounds(110, 100, 340, 30);
        jDesktopPane1.add(reparto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Reparto:");
        jLabel9.setBounds(30, 100, 80, 30);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comedia", "Romance", "Accion", "Terror", "Ciencia Ficcion", "Drama" }));
        genero.setBounds(110, 140, 140, 30);
        jDesktopPane1.add(genero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Año:");
        jLabel10.setBounds(340, 180, 50, 30);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        censura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B", "C", "D" }));
        censura.setBounds(400, 140, 50, 30);
        jDesktopPane1.add(censura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Genero:");
        jLabel11.setBounds(30, 140, 70, 30);
        jDesktopPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anoKeyTyped(evt);
            }
        });
        ano.setBounds(390, 180, 60, 30);
        jDesktopPane1.add(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre de pelicula:");
        jLabel12.setBounds(30, 60, 140, 30);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Uso:");
        jLabel13.setBounds(30, 180, 50, 30);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio (Alquiler/Venta):");
        jLabel14.setBounds(30, 220, 180, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        precio.setBounds(200, 220, 60, 30);
        jDesktopPane1.add(precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        predido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                predidoKeyTyped(evt);
            }
        });
        predido.setBounds(390, 220, 60, 30);
        jDesktopPane1.add(predido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Fecha de solicitud (dd/mm/aaaa):");
        jLabel15.setBounds(30, 300, 240, 30);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia1.setBounds(270, 300, 40, 30);
        jDesktopPane1.add(Dia1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-");
        jLabel16.setBounds(310, 300, 20, 30);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes1.setBounds(330, 300, 40, 30);
        jDesktopPane1.add(Mes1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("-");
        jLabel17.setBounds(370, 300, 20, 30);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aano.setBounds(390, 340, 60, 30);
        jDesktopPane1.add(aano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aano1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aano1.setBounds(390, 300, 60, 30);
        jDesktopPane1.add(aano1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 480, 440);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton1);
        jButton1.setBounds(440, 480, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechadehoy(){
        fecha = formatofecha.fecha();
        String desgloce[] = fecha.split("-");
        Dia.setSelectedItem(desgloce[0]);
        Dia1.setSelectedItem(desgloce[0]);
        Mes.setSelectedItem(desgloce[1]);
        Mes1.setSelectedItem(desgloce[1]);
        aano.setSelectedItem(desgloce[2]);
        aano1.setSelectedItem(desgloce[2]);
    }
    
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        String Uso = null;
        String Condicion = null;
        String Titulo = pelicula.getText();
        String Reparto = reparto.getText();
        String Genero = genero.getSelectedItem().toString();
        String Censura = censura.getSelectedItem().toString();
        String Ano = ano.getText();
        String Entrega = aano.getSelectedItem().toString()+"-"+Mes.getSelectedItem().toString()+"-"+Dia.getSelectedItem().toString();
        String Precio = precio.getText();
        String Predido = predido.getText();
        String Cantidad = cantidad.getText();
        String Distribuidor = distribuidor.getText();
        String Fecha = aano1.getSelectedItem().toString()+"-"+Mes1.getSelectedItem().toString()+"-"+Dia1.getSelectedItem().toString();
        if(alquiler.isSelected()){
            Uso="Alquiler";
            Condicion="Nueva";
        }
        else if(venta.isSelected()){
            Uso="Venta";
            Condicion="Buena";
        }
        if((!(genero.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(censura.getSelectedItem().toString().equalsIgnoreCase("...")))
            &&(!(Mes.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(Mes1.getSelectedItem().toString().equalsIgnoreCase("...")))
            &&(!(Dia.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(Dia1.getSelectedItem().toString().equalsIgnoreCase("...")))
            &&(!(aano.getSelectedItem().toString().equalsIgnoreCase("...")))&&(!(aano1.getSelectedItem().toString().equalsIgnoreCase("...")))
            &&(pelicula.getText()!=null)&&(reparto.getText()!=null)&&(ano.getText()!=null)&&(distribuidor.getText()!=null)&&(Uso!=null)
            &&(precio.getText()!=null)&&(predido.getText()!=null)&&(cantidad.getText()!=null)){
            Boolean band1 = formatofecha.formato(Entrega);
            Boolean band2 = formatofecha.formato(Fecha);
            if((band1==false)&&(band2==false)){
                String sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,"
                            +"Veces_Alquilada,Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Estatus,Registro) VALUES "
                            +"('"+Titulo+"','"+Ano+"','"+Genero+"','"+Censura+"','"+Reparto+"','"+Uso+"','"+Condicion+"','"+Cantidad+"',"
                            +"'"+Precio+"','0','"+Distribuidor+"','"+Predido+"','"+Fecha+"','"+Entrega+"','Pedido','Vigente')";
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
    }//GEN-LAST:event_RegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exito.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void peliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peliculaKeyTyped
        int limite = 60;
        char C = evt.getKeyChar();
        char D = 39;
        if ((pelicula.getText().length() == limite) || (C == D)) {
            evt.consume();
        }
    }//GEN-LAST:event_peliculaKeyTyped

    private void repartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repartoKeyTyped
        int limite = 160;
        char C = evt.getKeyChar();
        char D = 39;
        if ((reparto.getText().length() == limite) || (C == D)) {
            evt.consume();
        }
    }//GEN-LAST:event_repartoKeyTyped

    private void anoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((ano.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_anoKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((precio.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_precioKeyTyped

    private void predidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_predidoKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((predido.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_predidoKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((cantidad.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

    private void distribuidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distribuidorKeyTyped
        int limite = 50;
        char C=evt.getKeyChar();
        char D = 39;
        if ((distribuidor.getText().length()== limite)||(C == D))
            evt.consume();
    }//GEN-LAST:event_distribuidorKeyTyped

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroPedidos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Dia;
    private javax.swing.JComboBox Dia1;
    private javax.swing.JComboBox Mes;
    private javax.swing.JComboBox Mes1;
    private javax.swing.JButton Registrar;
    private javax.swing.JComboBox aano;
    private javax.swing.JComboBox aano1;
    private javax.swing.JButton aceptar3;
    private javax.swing.JDialog advertencia;
    private javax.swing.JRadioButton alquiler;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox censura;
    private javax.swing.JTextField distribuidor;
    private javax.swing.JDialog error;
    private javax.swing.ButtonGroup escoger;
    private javax.swing.JDialog exito;
    private javax.swing.JComboBox genero;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pelicula;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField predido;
    private javax.swing.JTextField reparto;
    private javax.swing.JRadioButton venta;
    // End of variables declaration//GEN-END:variables
}
