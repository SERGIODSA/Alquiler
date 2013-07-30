import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConsultaAlmacen extends javax.swing.JFrame {
    Image cd;
    Conexion cxn;
    Manejofechas formatofecha;
    DefaultTableModel modelotabla;
    ResultSet busqueda;
    ResultSet busqueda2;
    ResultSet busqueda3;
    ResultSetMetaData metaDatos;
    DefaultTableCellRenderer tcr;
    String Columna;
    String sql;
    String fecha1;
    String fecha2;
    String [] Fila;
    String celda;
    String [] columnas;
    int [] ancho;
    Boolean [] centrar;
    public ConsultaAlmacen() {
        initComponents();
        setLocationRelativeTo(null);
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advertencia = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aceptar1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        error = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        registro = new javax.swing.JDialog();
        registrar = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cantidad2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        diaa = new javax.swing.JComboBox();
        dia = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mess = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        anoo = new javax.swing.JComboBox();
        ano = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        Seleccion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        pedido = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        advertencia.setMinimumSize(new java.awt.Dimension(300, 140));
        advertencia.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia.setResizable(false);
        advertencia.getContentPane().setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-question.png"))); // NOI18N
        advertencia.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 40, 40);

        jLabel4.setText("¿Esta seguro que desea eliminar ");
        advertencia.getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 20, 210, 14);

        aceptar1.setText("Aceptar");
        aceptar1.setFocusPainted(false);
        aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar1ActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(aceptar1);
        aceptar1.setBounds(40, 60, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        advertencia.getContentPane().add(cancelar);
        cancelar.setBounds(170, 60, 90, 30);

        jLabel8.setText("todas las peliculas?");
        advertencia.getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 40, 180, 10);

        error.setMinimumSize(new java.awt.Dimension(290, 130));
        error.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 40, 40);

        jLabel6.setText("Debe ingresar la cantidad en el campo");
        error.getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 20, 220, 20);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar2);
        aceptar2.setBounds(100, 50, 80, 30);

        registro.setMinimumSize(new java.awt.Dimension(500, 300));
        registro.setModal(true);
        registro.setResizable(false);
        registro.getContentPane().setLayout(null);

        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setFocusPainted(false);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registro.getContentPane().add(registrar);
        registrar.setBounds(270, 200, 140, 40);

        cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        cancelar3.setText("Cancelar");
        cancelar3.setFocusPainted(false);
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });
        registro.getContentPane().add(cancelar3);
        cancelar3.setBounds(60, 200, 140, 40);

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pedido de peliculas");
        registro.getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 10, 270, 21);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad:");
        registro.getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 50, 80, 30);

        cantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidad2KeyTyped(evt);
            }
        });
        registro.getContentPane().add(cantidad2);
        cantidad2.setBounds(100, 50, 40, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Fecha de solicitud (dd/mm/aaaa):");
        registro.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 100, 234, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de entrega (dd/mm/aaaa):");
        registro.getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 150, 232, 30);

        diaa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        registro.getContentPane().add(diaa);
        diaa.setBounds(270, 150, 40, 30);

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        registro.getContentPane().add(dia);
        dia.setBounds(270, 100, 40, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-");
        registro.getContentPane().add(jLabel16);
        jLabel16.setBounds(310, 100, 30, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        registro.getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 150, 30, 30);

        mess.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        registro.getContentPane().add(mess);
        mess.setBounds(340, 150, 40, 30);

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        registro.getContentPane().add(mes);
        mes.setBounds(340, 100, 40, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("-");
        registro.getContentPane().add(jLabel17);
        jLabel17.setBounds(380, 100, 30, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-");
        registro.getContentPane().add(jLabel13);
        jLabel13.setBounds(380, 150, 30, 30);

        anoo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        registro.getContentPane().add(anoo);
        anoo.setBounds(410, 150, 60, 30);

        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        registro.getContentPane().add(ano);
        ano.setBounds(410, 100, 60, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio (A/V):");
        registro.getContentPane().add(jLabel14);
        jLabel14.setBounds(320, 50, 100, 30);

        cu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuKeyTyped(evt);
            }
        });
        registro.getContentPane().add(cu);
        cu.setBounds(260, 50, 50, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Costo Unitario:");
        registro.getContentPane().add(jLabel18);
        jLabel18.setBounds(150, 50, 120, 30);

        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        registro.getContentPane().add(precio);
        precio.setBounds(420, 50, 50, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de almacen");
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Consulta de almacen");
        jLabel7.setBounds(350, 20, 300, 25);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "En Pedido", "Peliculas Dañadas", "Venta", "Alquiler", "Por Cantidad (Alquiler)", "Por Cantidad (Venta)" }));
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });
        Seleccion.setBounds(190, 60, 240, 30);
        jDesktopPane1.add(Seleccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad: ");
        jLabel1.setBounds(660, 60, 90, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        eliminar.setText("Eliminar peliculas dañadas");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        eliminar.setBounds(220, 420, 220, 40);
        jDesktopPane1.add(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        consulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        consulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        consulta.getTableHeader().setReorderingAllowed(false);
        consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(consulta);

        jScrollPane2.setBounds(30, 100, 950, 310);
        jDesktopPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione: ");
        jLabel2.setBounds(80, 60, 100, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cantidad.setEnabled(false);
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        cantidad.setBounds(740, 60, 50, 30);
        jDesktopPane1.add(cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(820, 60, 80, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        pedido.setText("Realizar pedido");
        pedido.setEnabled(false);
        pedido.setFocusPainted(false);
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });
        pedido.setBounds(560, 420, 220, 40);
        jDesktopPane1.add(pedido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(20, 20, 1010, 470);

        jButton1.setText("Atras");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jEImagePanel1.add(jButton1);
        jButton1.setBounds(960, 500, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modelodemitabla(){
        modelotabla = new DefaultTableModel(){
            @Override
            public Class getColumnClass(int c) { 
                return getValueAt(0,c).getClass(); 
            } 
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };    
    }
    
    private void buscarcantidades(Boolean c){
        try{
            if(c==true){
                sql = "SELECT idPelicula,Titulo,Cantidad,Precio,Distribuidor,Estatus,Fecha_Solicitud,"
                    +"Fecha_Entrega,Precio_Pedido FROM peliculas.peliculas WHERE Cantidad<='"+cantidad.getText()+"' "
                    +"AND Condicion='Buena' AND Registro='Vigente' AND Uso='Alquiler'";
            }
            else{
                sql = "SELECT idPelicula,Titulo,Cantidad,Precio,Distribuidor,Estatus,Fecha_Solicitud,"
                    +"Fecha_Entrega,Precio_Pedido FROM peliculas.peliculas WHERE Cantidad<='"+cantidad.getText()+"' "
                    +"AND Estatus='Disponible' AND Condicion='Nueva' AND Registro='Vigente' AND Uso='Venta'";
            }
            int aux[] = {70,340,60,50,150,70,100,100,95};
            Boolean aux2[] = {true,false,true,true,false,true,true,true,true}; 
            ancho=aux;
            centrar=aux2;
            consulta(sql,ancho,centrar);
            } 
        catch (SQLException ex) {
            Logger.getLogger(ConsultaAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        String seleccion = Seleccion.getSelectedItem().toString();
        cantidad.setEnabled(false);
        buscar.setEnabled(false);
        eliminar.setEnabled(false);
        pedido.setEnabled(false);
        cantidad.setText("");
        try{
            if(seleccion.equalsIgnoreCase("...")){
                modelodemitabla();
                consulta.setModel(modelotabla);
            }
            if (seleccion.equalsIgnoreCase("En Pedido")){
                sql = "SELECT idPelicula,Titulo,Uso,Distribuidor,Cantidad,Precio_Pedido,Fecha_Solicitud,"
                     +"Fecha_Esperada,Fecha_Entrega FROM peliculas.peliculas WHERE Estatus='Pedido'";
                int aux[] = {70,340,60,150,60,95,100,105,100};
                Boolean aux2[] = {true,false,true,false,true,true,true,true,true}; 
                ancho=aux;
                centrar=aux2;
                consulta(sql,ancho,centrar);
            }
            if (seleccion.equalsIgnoreCase("Peliculas Dañadas")){
                String cont = "SELECT COUNT(idPelicula) FROM peliculas.peliculas WHERE Condicion='Dañada'";
                busqueda = cxn.Consulta(cont);
                while (busqueda.next()){
                    cont = busqueda.getString(1);  
                }
                if(Integer.parseInt(cont)>0)
                    eliminar.setEnabled(true);
                sql = "SELECT idPelicula,Titulo,Cantidad,Veces_Alquilada,Distribuidor,Fecha_Solicitud,"
                    +"Fecha_Entrega,Precio_Pedido FROM peliculas.peliculas WHERE Condicion='Dañada'";
                int aux[] = {70,340,60,100,150,100,100,95};
                Boolean aux2[] = {true,false,true,true,false,true,true,true}; 
                ancho=aux;
                centrar=aux2;
                consulta(sql,ancho,centrar);
            }
            if (seleccion.equalsIgnoreCase("Venta")){
                sql = "SELECT idPelicula,Titulo,Cantidad,Precio,Distribuidor,Estatus,Fecha_Solicitud,"
                     +"Fecha_Entrega,Precio_Pedido FROM peliculas.peliculas WHERE Uso='Venta' AND Cantidad>'0'";
                int aux[] = {70,340,60,50,150,70,100,100,95};
                Boolean aux2[] = {true,false,true,true,false,true,true,true,true}; 
                ancho=aux;
                centrar=aux2;
                consulta(sql,ancho,centrar);
            }
            if (seleccion.equalsIgnoreCase("Alquiler")){
                sql = "SELECT idPelicula,Titulo,Cantidad,Distribuidor,Estatus,Veces_Alquilada,Fecha_Solicitud,"
                     +"Fecha_Entrega,Precio_Pedido FROM peliculas.peliculas WHERE Uso='Alquiler' AND Cantidad>'0'";
                int aux[] = {70,340,60,150,70,100,100,100,95};
                Boolean aux2[] = {true,false,true,false,true,true,true,true,true}; 
                ancho=aux;
                centrar=aux2;
                consulta(sql,ancho,centrar);
            }
            if (seleccion.equalsIgnoreCase("Por Cantidad (Alquiler)")||(seleccion.equalsIgnoreCase("Por Cantidad (Venta)"))){
                cantidad.setEnabled(true);
                buscar.setEnabled(true);
                modelodemitabla();
                consulta.setModel(modelotabla); 
            }
        }
        catch (SQLException ex) {
                Logger.getLogger(ConsultaAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SeleccionActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        int limite = 3;
        char C=evt.getKeyChar();
        if (((cantidad.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(cantidad.getText().equalsIgnoreCase("")){        
            error.setLocationRelativeTo(null);
            error.getContentPane().setBackground(new Color(222,222,222));
            error.setVisible(true);
        }
        else{
            String seleccion = Seleccion.getSelectedItem().toString();
            if(seleccion.equalsIgnoreCase("Por Cantidad (Alquiler)"))
                buscarcantidades(true);
            if(seleccion.equalsIgnoreCase("Por Cantidad (Venta)"))
                buscarcantidades(false);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        advertencia.setLocationRelativeTo(null);
        advertencia.getContentPane().setBackground(new Color(222,222,222));
        advertencia.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar1ActionPerformed
        sql = "DELETE FROM peliculas.peliculas WHERE Condicion='Dañada'";
        cxn.Ejecutar(sql);
        advertencia.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_aceptar1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        advertencia.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        registro.setVisible(false);
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        cantidad2.setText("");
        cu.setText("");
        precio.setText("");
        fecha1 = formatofecha.fecha();
        String desgloce[]=fecha1.split("-");
        dia.setSelectedItem(desgloce[0]);
        mes.setSelectedItem(desgloce[1]);
        ano.setSelectedItem(desgloce[2]);
        diaa.setSelectedItem(desgloce[0]);
        mess.setSelectedItem(desgloce[1]);
        anoo.setSelectedItem(desgloce[2]);
        registro.setLocationRelativeTo(null);
        registro.getContentPane().setBackground(new Color(222,222,222));
        registro.setVisible(true);
    }//GEN-LAST:event_pedidoActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if((!(dia.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (!(diaa.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (!(mes.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (!(mess.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (!(ano.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (!(anoo.getSelectedItem().toString().equalsIgnoreCase("...")))&&
        (cantidad2.getText()!=null)&&(cu.getText()!=null)&&(precio.getText()!=null)){
            fecha1=ano.getSelectedItem()+"-"+mes.getSelectedItem()+"-"+dia.getSelectedItem();
            fecha2=anoo.getSelectedItem()+"-"+mess.getSelectedItem()+"-"+diaa.getSelectedItem();
            Boolean band1 = formatofecha.formato(fecha1);
            Boolean band2 = formatofecha.formato(fecha2);
            if((band1==false)&&(band2==false)){
                sql = "SELECT Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Distribuidor FROM peliculas.peliculas WHERE idPelicula='"+celda+"'";
                busqueda3 = cxn.Consulta(sql);
                try {
                    metaDatos = busqueda3.getMetaData();
                    int numeroColumnas = metaDatos.getColumnCount();
                    Fila = new String[numeroColumnas];
                    while (busqueda3.next()){
                        for (int j=0;j<numeroColumnas;j++){
                            Fila[j]= busqueda3.getString(j+1);  
                        }
                    }
                }
                catch (SQLException ex){
                    Logger.getLogger(ConsultaAlmacen.class.getName()).log(Level.SEVERE, null, ex);
                }
                sql = "UPDATE peliculas.peliculas SET Registro='Caducado' WHERE idPelicula='"+celda+"'";
                cxn.Ejecutar(sql);
                sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,Veces_Alquilada,"
                    +"Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Estatus,Registro) VALUES ('"+Fila[0]+"','"+Fila[1]+"',"
                    +"'"+Fila[2]+"','"+Fila[3]+"','"+Fila[4]+"','"+Fila[5]+"','"+Fila[6]+"','"+cantidad2.getText()+"',"
                    +"'"+precio.getText()+"','0','"+Fila[7]+"','"+cu.getText()+"','"+fecha1+"','"+fecha2+"','Pedido','Vigente')";
                cxn.Ejecutar(sql);
                registro.setVisible(false);
                pedido.setEnabled(false);
                modelodemitabla();
                String seleccion = Seleccion.getSelectedItem().toString();
                if(seleccion.equalsIgnoreCase("Por Cantidad (Alquiler)"))
                    buscarcantidades(true);
                if(seleccion.equalsIgnoreCase("Por Cantidad (Venta)"))
                    buscarcantidades(false);
            }
        }
        else{
            registro.setVisible(false);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuKeyTyped
        int limite = 7;
        char C = evt.getKeyChar();
        if (((cu.getText().length() == limite)) || ((C < '0') || (C > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_cuKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        int limite = 7;
        char C = evt.getKeyChar();
        if (((precio.getText().length() == limite)) || ((C < '0') || (C > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_precioKeyTyped

    private void consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMouseClicked
        int n = consulta.getSelectedRow();
        if ((evt.getClickCount()>0)&&((Seleccion.getSelectedItem().equals("Por Cantidad (Alquiler)"))||(Seleccion.getSelectedItem().equals("Por Cantidad (Venta)")))&&
        (consulta.getValueAt(n,5)).toString().equals("Disponible")){  
            celda=consulta.getValueAt(n,0).toString();
            pedido.setEnabled(true);
        }
        else
            pedido.setEnabled(false);
    }//GEN-LAST:event_consultaMouseClicked

    private void cantidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad2KeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
        if (((cantidad2.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_cantidad2KeyTyped

    public final void consulta(String sql,int ancho[],Boolean centrar[]) throws SQLException{
        modelodemitabla();
        busqueda = cxn.Consulta(sql);
        metaDatos = busqueda.getMetaData();
        int numeroColumnas = metaDatos.getColumnCount();
        Fila = new String[numeroColumnas];
        for (int c=0;c<numeroColumnas;c++){
            Columna=metaDatos.getColumnName(c+1);
            modelotabla.addColumn(Columna);
        }
        while (busqueda.next()){
            for (int j=0;j<numeroColumnas;j++){
                Fila[j]= busqueda.getString(j+1);  
            }
            modelotabla.addRow(Fila);
        }
        consulta.setModel(modelotabla);
        for (int k=0;k<ancho.length;k++){
            consulta.getColumnModel().getColumn(k).setMinWidth(ancho[k]);
            consulta.getColumnModel().getColumn(k).setMaxWidth(ancho[k]);
            if(centrar[k]==true)
                consulta.getColumnModel().getColumn(k).setCellRenderer(tcr);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaAlmacen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Seleccion;
    private javax.swing.JButton aceptar1;
    private javax.swing.JButton aceptar2;
    private javax.swing.JDialog advertencia;
    private javax.swing.JComboBox ano;
    private javax.swing.JComboBox anoo;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar3;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidad2;
    private javax.swing.JTable consulta;
    private javax.swing.JTextField cu;
    private javax.swing.JComboBox dia;
    private javax.swing.JComboBox diaa;
    private javax.swing.JButton eliminar;
    private javax.swing.JDialog error;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox mes;
    private javax.swing.JComboBox mess;
    private javax.swing.JButton pedido;
    private javax.swing.JTextField precio;
    private javax.swing.JButton registrar;
    private javax.swing.JDialog registro;
    // End of variables declaration//GEN-END:variables
}
