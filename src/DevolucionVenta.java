import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DevolucionVenta extends javax.swing.JFrame {
    Conexion cxn;
    Image cd;
    int numeroColumnas;
    int dias;
    String sql;
    String venta[];
    ResultSet busquedaventa;
    ResultSetMetaData metaDatos;
    Manejofechas formatofecha;
    public DevolucionVenta() {
        initComponents();
        setLocationRelativeTo(null);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        pregunta = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        error2 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        informacion = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aceptar4 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        idventa = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        fechaventa = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        idpelicula = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Dia1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        Mes1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        aano1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        error.setMaximumSize(new java.awt.Dimension(310, 140));
        error.setMinimumSize(new java.awt.Dimension(310, 140));
        error.setModal(true);
        error.setPreferredSize(new java.awt.Dimension(310, 140));
        error.getContentPane().setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 10, 50, 40);

        jLabel5.setText("ID incorrecto, no existente o no disponible");
        error.getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 20, 250, 14);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar2);
        aceptar2.setBounds(110, 50, 80, 30);

        pregunta.setMaximumSize(new java.awt.Dimension(280, 140));
        pregunta.setMinimumSize(new java.awt.Dimension(280, 140));
        pregunta.setModal(true);
        pregunta.setPreferredSize(new java.awt.Dimension(280, 140));
        pregunta.setResizable(false);
        pregunta.getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-question.png"))); // NOI18N
        pregunta.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 32, 30);

        jLabel2.setText("¿Esta seguro que desea realizar");
        pregunta.getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 200, 14);

        jLabel3.setText("esta operacion?");
        pregunta.getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 30, 130, 14);

        aceptar.setText("Aceptar");
        aceptar.setFocusPainted(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(aceptar);
        aceptar.setBounds(30, 60, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(cancelar);
        cancelar.setBounds(150, 60, 90, 30);

        error2.setMaximumSize(new java.awt.Dimension(265, 140));
        error2.setMinimumSize(new java.awt.Dimension(265, 140));
        error2.setModal(true);
        error2.setPreferredSize(new java.awt.Dimension(265, 140));
        error2.getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error2.getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 10, 40, 40);

        jLabel8.setText("Existe uno o mas campos vacios");
        error2.getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 20, 210, 14);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error2.getContentPane().add(aceptar3);
        aceptar3.setBounds(80, 50, 90, 30);

        informacion.setMaximumSize(new java.awt.Dimension(280, 130));
        informacion.setMinimumSize(new java.awt.Dimension(280, 130));
        informacion.setModal(true);
        informacion.setPreferredSize(new java.awt.Dimension(280, 130));
        informacion.setResizable(false);
        informacion.getContentPane().setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        informacion.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 10, 32, 40);

        jLabel10.setText("Plazo vencido para realizar devolucion");
        informacion.getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 20, 240, 14);

        aceptar4.setText("Aceptar");
        aceptar4.setFocusPainted(false);
        aceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar4ActionPerformed(evt);
            }
        });
        informacion.getContentPane().add(aceptar4);
        aceptar4.setBounds(90, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("devolucion de peliculas");
        jLabel7.setBounds(50, 20, 360, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        descuento.setBounds(190, 160, 40, 30);
        jDesktopPane1.add(descuento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idventa.setBounds(100, 70, 80, 30);
        jDesktopPane1.add(idventa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buscar.setText("Buscar");
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(230, 70, 90, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        borrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        borrar.setText("Borrar");
        borrar.setEnabled(false);
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        borrar.setBounds(350, 70, 90, 30);
        jDesktopPane1.add(borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("idVenta:");
        jLabel16.setBounds(30, 70, 60, 30);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("idPelicula:");
        jLabel18.setBounds(260, 130, 80, 30);
        jDesktopPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Descuento:");
        jLabel20.setBounds(30, 160, 80, 30);
        jDesktopPane1.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(30, 110, 410, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Cedula:");
        jLabel21.setBounds(30, 130, 80, 30);
        jDesktopPane1.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fechaventa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fechaventa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaventa.setBounds(140, 190, 120, 30);
        jDesktopPane1.add(fechaventa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cedula.setBounds(140, 130, 90, 30);
        jDesktopPane1.add(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        idpelicula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idpelicula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idpelicula.setBounds(350, 130, 90, 30);
        jDesktopPane1.add(idpelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio.setBounds(350, 160, 90, 30);
        jDesktopPane1.add(precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        registrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setEnabled(false);
        registrar.setFocusPainted(false);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.setBounds(150, 270, 160, 40);
        jDesktopPane1.add(registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Precio:");
        jLabel22.setBounds(260, 160, 80, 30);
        jDesktopPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Fecha Venta:");
        jLabel19.setBounds(30, 190, 100, 30);
        jDesktopPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Fecha Devolucion:");
        jLabel23.setBounds(30, 220, 150, 30);
        jDesktopPane1.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia1.setEnabled(false);
        Dia1.setFocusable(false);
        Dia1.setBounds(190, 220, 40, 30);
        jDesktopPane1.add(Dia1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("-");
        jLabel25.setBounds(230, 220, 20, 30);
        jDesktopPane1.add(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes1.setEnabled(false);
        Mes1.setFocusable(false);
        Mes1.setBounds(250, 220, 40, 30);
        jDesktopPane1.add(Mes1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("-");
        jLabel26.setBounds(290, 220, 20, 30);
        jDesktopPane1.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aano1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aano1.setEnabled(false);
        aano1.setFocusable(false);
        aano1.setBounds(310, 220, 60, 30);
        jDesktopPane1.add(aano1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 30, 470, 330);

        jButton1.setText("Atras");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton1);
        jButton1.setBounds(430, 370, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new menuVenta().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        sql = "SELECT * FROM peliculas.ventas v, peliculas.peliculas p WHERE v.idVenta='"+idventa.getText()+"' "
             +"AND v.idPelicula=p.idAuxiliar AND p.Estatus='Vendida'";
        busquedaventa = cxn.Consulta(sql);
        try{
            metaDatos = busquedaventa.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();  
            venta = new String[numeroColumnas];
            while (busquedaventa.next()){
                for (int i=0;i<numeroColumnas;i++)
                    venta[i]= busquedaventa.getString(i+1);
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(venta[0]==null){
            error.setLocationRelativeTo(null);
            error.getContentPane().setBackground(new Color(222,222,222));
            error.setVisible(true);
        }
        else{
            long diastotales = 0;
            String fecha = venta[4];
            String desgloce[] = fecha.split("-");
            fecha = desgloce[2]+"/"+desgloce[1]+"/"+desgloce[0];
            String aux = desgloce[2]+"-"+desgloce[1]+"-"+desgloce[0];
            cedula.setText(venta[2]);
            idpelicula.setText(venta[6]);
            descuento.setText(venta[3]);
            precio.setText(venta[5]);
            fechaventa.setText(fecha);
            fecha = formatofecha.fecha();
            String desgloce2[] = fecha.split("-");
            fecha = desgloce2[0]+"-"+desgloce2[1]+"-"+desgloce2[2];
            Dia1.setSelectedItem(desgloce2[0]);
            Mes1.setSelectedItem(desgloce2[1]);
            aano1.setSelectedItem(desgloce2[2]);
            try{
                diastotales = formatofecha.dias(aux,fecha);
            } 
            catch (ParseException ex) {
                Logger.getLogger(DevolucionVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            dias = Integer.parseInt(Long.toString(diastotales));
            registrar.setEnabled(true);
            idventa.setEditable(false);
            buscar.setEnabled(false);
            borrar.setEnabled(true);
            Dia1.setEnabled(true);
            Mes1.setEnabled(true);
            aano1.setEnabled(true);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Dia1.setSelectedIndex(0);
        Mes1.setSelectedIndex(0);
        aano1.setSelectedIndex(0);
        Dia1.setEnabled(false);
        Mes1.setEnabled(false);
        aano1.setEnabled(false);
        idventa.setEditable(true);
        buscar.setEnabled(true);
        registrar.setEnabled(false);
        borrar.setEnabled(false);
        idventa.setText("");
        cedula.setText("");
        idpelicula.setText("");
        descuento.setText("");
        precio.setText("");
        fechaventa.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if((!Dia1.getSelectedItem().toString().equals("..."))&&(!Mes1.getSelectedItem().toString().equals("..."))&&
        (!aano1.getSelectedItem().toString().equals("..."))){
            long diastotales=0;
            String fecha1 = fechaventa.getText();
            String desg[] = fecha1.split("/");
            fecha1 = desg[2]+"-"+desg[1]+"-"+desg[0];
            String fecha2 = aano1.getSelectedItem()+"-"+Mes1.getSelectedItem()+"-"+Dia1.getSelectedItem();
            try{
                diastotales = formatofecha.dias(fecha1,fecha2);
            } 
            catch (ParseException ex) {
                Logger.getLogger(DevolucionVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            dias = Integer.parseInt(Long.toString(diastotales));
            if(dias>7){
                informacion.setLocationRelativeTo(null);
                informacion.getContentPane().setBackground(new Color(222,222,222));
                informacion.setVisible(true);
            }
            else{
                pregunta.setLocationRelativeTo(null);
                pregunta.getContentPane().setBackground(new Color(222,222,222));
                pregunta.setVisible(true);
            }
        }
        else{
            error2.setLocationRelativeTo(null);
            error2.getContentPane().setBackground(new Color(222,222,222));
            error2.setVisible(true);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        pregunta.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String cantidad=null;
        String idpeli=null;
        ResultSet busquedacantidad;
        // busco si esta pelicula ya esta registrada como dañada
        sql = "SELECT p.Cantidad,p.idPelicula FROM peliculas.peliculas p,peliculas.ventas v WHERE v.idVenta='"+idventa.getText()+"' "
             +"AND v.idPelicula=p.idAuxiliar AND p.Estatus='Vendida'";
        busquedacantidad = cxn.Consulta(sql);
        try{
            while (busquedacantidad.next()){
                cantidad = busquedacantidad.getString(1);
                idpeli = busquedacantidad.getString(2);
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(cantidad==null){
            // si no hay creo el registro
            sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,"
                +"Veces_Alquilada,Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus,idAuxiliar,Registro) "
                +"VALUES ('"+venta[7]+"','"+venta[8]+"','"+venta[9]+"','"+venta[10]+"','"+venta[11]+"','"+venta[12]+"',"
                +"'Dañada','1','"+venta[5]+"','0','"+venta[17]+"','"+venta[18]+"','"+venta[19]+"','"+venta[20]+"','"+venta[21]+"',"
                +"'Disponible','"+venta[23]+"','Caducado')";
            cxn.Ejecutar(sql);
        }
        else{
            // si hay sumo 1
            cantidad=Integer.toString(Integer.parseInt(cantidad)+1);
            sql = "UPDATE peliculas.peliculas SET Cantidad='"+cantidad+"' WHERE idPelicula='"+idpeli+"'";
            cxn.Ejecutar(sql);
        }
        sql = "DELETE FROM Peliculas.ventas WHERE idVenta='"+idventa.getText()+"'";
        cxn.Ejecutar(sql);
        pregunta.setVisible(false);
        this.setVisible(false);
        new menuVenta().setVisible(true);
    }//GEN-LAST:event_aceptarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error2.setVisible(false);
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void aceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar4ActionPerformed
        informacion.setVisible(false);
    }//GEN-LAST:event_aceptar4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DevolucionVenta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Dia1;
    private javax.swing.JComboBox Mes1;
    private javax.swing.JComboBox aano1;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton aceptar4;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel descuento;
    private javax.swing.JDialog error;
    private javax.swing.JDialog error2;
    private javax.swing.JLabel fechaventa;
    private javax.swing.JLabel idpelicula;
    private javax.swing.JTextField idventa;
    private javax.swing.JDialog informacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel precio;
    private javax.swing.JDialog pregunta;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
