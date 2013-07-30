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

public class ConsultaVenta extends javax.swing.JFrame {
    Image cd;
    Conexion cxn;
    ResultSet busqueda;
    DefaultTableModel modelotabla;
    ResultSetMetaData metaDatos;
    DefaultTableCellRenderer tcr;
    String sql;
    String Columna;
    String [] Fila;
    int numeroColumnas;
    public ConsultaVenta() {
        initComponents();
        setLocationRelativeTo(null);
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        cxn = new Conexion();
        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccion = new javax.swing.ButtonGroup();
        jEImagePanel1 = new JEImagePanel();
        finalizar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btitulo = new javax.swing.JRadioButton();
        titulo = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        botro = new javax.swing.JRadioButton();
        bgenero = new javax.swing.JRadioButton();
        bcensura = new javax.swing.JRadioButton();
        baño = new javax.swing.JRadioButton();
        censura = new javax.swing.JComboBox();
        genero = new javax.swing.JComboBox();
        otros = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de venta");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        finalizar.setText("Atras");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        jEImagePanel1.add(finalizar);
        finalizar.setBounds(980, 410, 70, 30);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consulta peliculas de venta");
        jLabel9.setBounds(300, 10, 430, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Seleccione una opcion"));

        btitulo.setBackground(new java.awt.Color(175, 213, 240));
        btitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btitulo.setText("Titulo:");
        btitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btituloActionPerformed(evt);
            }
        });
        btitulo.setBounds(10, 20, 80, 30);
        jDesktopPane2.add(btitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(btitulo);

        titulo.setEnabled(false);
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        titulo.setBounds(100, 20, 190, 30);
        jDesktopPane2.add(titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ano.setEnabled(false);
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });
        ano.setBounds(100, 80, 50, 30);
        jDesktopPane2.add(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botro.setBackground(new java.awt.Color(175, 213, 240));
        botro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botro.setText("Otras:");
        botro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botroActionPerformed(evt);
            }
        });
        botro.setBounds(10, 260, 63, 30);
        jDesktopPane2.add(botro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(botro);

        bgenero.setBackground(new java.awt.Color(175, 213, 240));
        bgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bgenero.setText("Genero:");
        seleccion.add(bgenero);
        bgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgeneroActionPerformed(evt);
            }
        });
        bgenero.setBounds(10, 200, 73, 30);
        jDesktopPane2.add(bgenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bcensura.setBackground(new java.awt.Color(175, 213, 240));
        bcensura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bcensura.setText("Censura:");
        bcensura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcensuraActionPerformed(evt);
            }
        });
        bcensura.setBounds(10, 140, 79, 30);
        jDesktopPane2.add(bcensura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(bcensura);

        baño.setBackground(new java.awt.Color(175, 213, 240));
        baño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        baño.setText("Año:");
        baño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bañoActionPerformed(evt);
            }
        });
        baño.setBounds(10, 80, 70, 30);
        jDesktopPane2.add(baño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(baño);

        censura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B", "C", "D" }));
        censura.setEnabled(false);
        censura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                censuraActionPerformed(evt);
            }
        });
        censura.setBounds(100, 140, 50, 30);
        jDesktopPane2.add(censura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comedia", "Romance", "Accion", "Terror", "Ciencia Ficcion", "Drama" }));
        genero.setEnabled(false);
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        genero.setBounds(100, 200, 120, 30);
        jDesktopPane2.add(genero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        otros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Mostrar todas las peliculas", "Peliculas dañadas", "Pelicula mas vendida", "Genero mas vendido" }));
        otros.setEnabled(false);
        otros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosActionPerformed(evt);
            }
        });
        otros.setBounds(100, 260, 190, 30);
        jDesktopPane2.add(otros, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(20, 50, 300, 310);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        consulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        consulta.setAutoscrolls(false);
        jScrollPane1.setViewportView(consulta);

        jScrollPane1.setBounds(340, 50, 670, 310);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(20, 20, 1030, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public final void consulta(String sql,int ancho[],Boolean centrar[]) throws SQLException{
        modelodemitabla();
        busqueda = cxn.Consulta(sql);
        metaDatos = busqueda.getMetaData();
        numeroColumnas = metaDatos.getColumnCount();
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
    
private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
    this.setVisible(false);
    new menuVenta().setVisible(true);
}//GEN-LAST:event_finalizarActionPerformed

    private void otrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosActionPerformed
        String opcion = otros.getSelectedItem().toString();
        try{
            if (opcion.equals("Mostrar todas las peliculas")){
                int ancho[] = {70,340,40,100,60,730,60,150,100,70};
                Boolean centrar[] = {true,false,true,false,true,false,true,false,true,true};
                sql = "SELECT idPelicula,Titulo,Año,Genero,Censura,Reparto,Cantidad,Distribuidor,Veces_Alquilada,Estatus "
                    +"FROM peliculas.peliculas WHERE Uso='Venta' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Peliculas dañadas")){
                int ancho[] = {70,340,40,100,60,730,60,150,100};
                Boolean centrar[] = {true,false,true,false,true,false,true,false,true};
                sql = "SELECT idPelicula,Titulo,Año,Genero,Censura,Reparto,Cantidad,Distribuidor,Veces_Alquilada FROM "
                     +"peliculas.peliculas WHERE Uso='Venta' AND Registro='Caducado' AND Condicion='Dañada' ORDER BY Titulo AND Estatus";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Pelicula mas vendida")){
                int ancho[] = {340,40,100,60,730,70};
                Boolean centrar[] = {false,true,false,true,false,true};
                sql = "SELECT Titulo,Año,Genero,Censura,Reparto,MAX(Cantidad) AS Cantidad FROM "
                     +"(SELECT p.Titulo,p.Año,p.Genero,p.Censura,p.Reparto,p.Uso,COUNT(p.Titulo) AS Cantidad "
                     +"FROM peliculas.peliculas p,peliculas.ventas v WHERE v.idPelicula=p.idPelicula GROUP BY Titulo) AS Maximo";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Genero mas vendido")){
                int ancho[] = {120,70};
                Boolean centrar[] = {false,true};
                sql = "SELECT Genero,MAX(Cantidad) AS Cantidad FROM (SELECT p.Genero,COUNT(p.Genero) AS Cantidad FROM peliculas.peliculas p,"
                     +"peliculas.ventas v WHERE v.idPelicula=p.idPelicula GROUP BY Genero) AS Maximo";
                consulta(sql,ancho,centrar);
            }
        } 
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
   }//GEN-LAST:event_otrosActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
    String opcion = genero.getSelectedItem().toString();
    int ancho[] = {340,40,60,60,100,70};
    Boolean centrar[] = {false,true,true,true,true,true}; 
        try{
            if (opcion.equals("Terror"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Terror' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if (opcion.equals("Comedia"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Comedia' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if (opcion.equals("Ciencia Ficcion"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Ciencia Ficcion' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if (opcion.equals("Accion"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Accion' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if (opcion.equals("Romance"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Romance' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if (opcion.equals("Drama"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Genero='Drama' AND Condicion!='Dañada' ORDER BY Titulo AND Estatus";
            if(!opcion.equals("..."))
                consulta(sql,ancho,centrar);
        }
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generoActionPerformed

    private void btituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btituloActionPerformed
        titulo.setEnabled(true);
        ano.setEnabled(false);
        censura.setEnabled(false);
        genero.setEnabled(false);
        otros.setEnabled(false);
        titulo.setText("");
        ano.setText("");
        censura.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        otros.setSelectedIndex(0);
        modelodemitabla();
        consulta.setModel(modelotabla);
    }//GEN-LAST:event_btituloActionPerformed

    private void bañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bañoActionPerformed
        titulo.setEnabled(false);
        ano.setEnabled(true);
        censura.setEnabled(false);
        genero.setEnabled(false);
        otros.setEnabled(false);
        titulo.setText("");
        ano.setText("");
        censura.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        otros.setSelectedIndex(0);
        modelodemitabla();
        consulta.setModel(modelotabla);
    }//GEN-LAST:event_bañoActionPerformed

    private void bcensuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcensuraActionPerformed
        titulo.setEnabled(false);
        ano.setEnabled(false);
        censura.setEnabled(true);
        genero.setEnabled(false);
        otros.setEnabled(false);
        titulo.setText("");
        ano.setText("");
        censura.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        otros.setSelectedIndex(0);
        modelodemitabla();
        consulta.setModel(modelotabla);
    }//GEN-LAST:event_bcensuraActionPerformed

    private void bgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgeneroActionPerformed
        titulo.setEnabled(false);
        ano.setEnabled(false);
        censura.setEnabled(false);
        genero.setEnabled(true);
        otros.setEnabled(false);
        titulo.setText("");
        ano.setText("");
        censura.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        otros.setSelectedIndex(0);
        modelodemitabla();
        consulta.setModel(modelotabla);
    }//GEN-LAST:event_bgeneroActionPerformed

    private void botroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botroActionPerformed
        titulo.setEnabled(false);
        ano.setEnabled(false);
        censura.setEnabled(false);
        genero.setEnabled(false);
        otros.setEnabled(true);
        titulo.setText("");
        ano.setText("");
        censura.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        otros.setSelectedIndex(0);
        modelodemitabla();
        consulta.setModel(modelotabla);
    }//GEN-LAST:event_botroActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        String dato = titulo.getText();
        int ancho[] = {70,70,100,60,100,70};
        Boolean centrar[] = {true,true,false,true,true,true};
        sql = "SELECT idPelicula,Cantidad,Genero,Censura,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Titulo='"+dato+"' AND Estatus!='Dañada' AND Cantidad>0 ORDER BY Titulo";
        try{
            consulta(sql,ancho,centrar);
        } 
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tituloActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        String dato = ano.getText();
        int ancho[] = {340,100,60,60,100,70};
        Boolean centrar[] = {false,false,true,true,true,true};
        sql = "SELECT Titulo,Genero,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Año='"+dato+"' AND Estatus!='Dañada' ORDER BY Año";
        try{
            consulta(sql,ancho,centrar);
        } 
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anoActionPerformed

    private void censuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_censuraActionPerformed
        String opcion = censura.getSelectedItem().toString();
        int ancho[] = {340,40,100,60,100,70};
        Boolean centrar[] = {false,true,false,true,true,true};
        try{
            if (opcion.equals("A"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Censura='A' AND Estatus!='Dañada' ORDER BY Titulo";
            if (opcion.equals("B"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Censura='B' AND Estatus!='Dañada' ORDER BY Titulo";
            if (opcion.equals("C"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Censura='C' AND Estatus!='Dañada' ORDER BY Titulo";
            if (opcion.equals("D"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Venta' AND Censura='D' AND Estatus!='Dañada' ORDER BY Titulo";
            if(!opcion.equals("..."))
                consulta(sql,ancho,centrar);
        }
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_censuraActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaVenta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JRadioButton baño;
    private javax.swing.JRadioButton bcensura;
    private javax.swing.JRadioButton bgenero;
    private javax.swing.JRadioButton botro;
    private javax.swing.JRadioButton btitulo;
    private javax.swing.JComboBox censura;
    private javax.swing.JTable consulta;
    private javax.swing.JButton finalizar;
    private javax.swing.JComboBox genero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox otros;
    private javax.swing.ButtonGroup seleccion;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
