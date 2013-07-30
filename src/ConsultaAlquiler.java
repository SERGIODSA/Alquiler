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

public class ConsultaAlquiler extends javax.swing.JFrame {
    ResultSet busqueda;
    DefaultTableModel modelotabla;
    ResultSetMetaData metaDatos;
    DefaultTableCellRenderer tcr;
    Image cd;
    Conexion cxn;
    String sql;
    String Columna;
    String [] Fila;
    int numeroColumnas;
    public ConsultaAlquiler(){
        initComponents();
        setLocationRelativeTo(null);
        cxn = new Conexion();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccion = new javax.swing.ButtonGroup();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        botras = new javax.swing.JRadioButton();
        otros = new javax.swing.JComboBox();
        genero = new javax.swing.JComboBox();
        bgenero = new javax.swing.JRadioButton();
        bcensura = new javax.swing.JRadioButton();
        censura = new javax.swing.JComboBox();
        ano = new javax.swing.JTextField();
        baño = new javax.swing.JRadioButton();
        btitulo = new javax.swing.JRadioButton();
        titulo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de alquiler");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consulta peliculas de alquiler");
        jLabel9.setBounds(280, 10, 470, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Seleccione una opcion"));

        botras.setBackground(new java.awt.Color(175, 213, 240));
        botras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botras.setText("Otras:");
        botras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botrasActionPerformed(evt);
            }
        });
        botras.setBounds(10, 260, 80, 30);
        jDesktopPane2.add(botras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(botras);

        otros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Mostrar todas las peliculas", "Pelicula mas alquilada", "Genero mas alquilado", "Peliculas dañadas", "Cliente con mas multas" }));
        otros.setEnabled(false);
        otros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosActionPerformed(evt);
            }
        });
        otros.setBounds(100, 260, 190, 30);
        jDesktopPane2.add(otros, javax.swing.JLayeredPane.DEFAULT_LAYER);

        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comedia", "Romance", "Accion", "Terror", "Ciencia Ficcion", "Drama" }));
        genero.setEnabled(false);
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        genero.setBounds(100, 200, 120, 30);
        jDesktopPane2.add(genero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgenero.setBackground(new java.awt.Color(175, 213, 240));
        bgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bgenero.setText("Genero:");
        bgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgeneroActionPerformed(evt);
            }
        });
        bgenero.setBounds(10, 200, 90, 30);
        jDesktopPane2.add(bgenero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(bgenero);

        bcensura.setBackground(new java.awt.Color(175, 213, 240));
        bcensura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bcensura.setText("Censura:");
        bcensura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcensuraActionPerformed(evt);
            }
        });
        bcensura.setBounds(10, 140, 90, 30);
        jDesktopPane2.add(bcensura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        seleccion.add(bcensura);

        censura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B", "C", "D" }));
        censura.setEnabled(false);
        censura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                censuraActionPerformed(evt);
            }
        });
        censura.setBounds(100, 140, 50, 30);
        jDesktopPane2.add(censura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ano.setEnabled(false);
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });
        ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anoKeyTyped(evt);
            }
        });
        ano.setBounds(100, 80, 50, 30);
        jDesktopPane2.add(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        consulta.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(consulta);

        jScrollPane3.setBounds(340, 60, 670, 300);
        jDesktopPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(20, 20, 1030, 380);

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(atras);
        atras.setBounds(980, 410, 70, 30);

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

private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    this.setVisible(false);
    new menuAlquiler().setVisible(true);
}//GEN-LAST:event_atrasActionPerformed

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

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
    String opcion = genero.getSelectedItem().toString();
    int ancho[] = {340,40,60,60,100,70};
    Boolean centrar[] = {false,true,true,true,true,true}; 
        try{
            if (opcion.equals("Terror"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Terror' AND Registro='Vigente'";
            if (opcion.equals("Comedia"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Comedia' AND Registro='Vigente'";
            if (opcion.equals("Ciencia Ficcion"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Ciencia Ficcion' AND Registro='Vigente'";
            if (opcion.equals("Accion"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Accion' AND Registro='Vigente'";
            if (opcion.equals("Romance"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Romance' AND Registro='Vigente'";
            if (opcion.equals("Drama"))
                sql = "SELECT Titulo,Año,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Genero='Drama' AND Registro='Vigente'";
            if(!opcion.equals("..."))
                consulta(sql,ancho,centrar);
        }
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generoActionPerformed

    private void censuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_censuraActionPerformed
        String opcion = censura.getSelectedItem().toString();
        int ancho[] = {340,40,100,60,100,70};
        Boolean centrar[] = {false,true,false,true,true,true};
        try{
            if (opcion.equals("A"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Censura='A' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
            if (opcion.equals("B"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Censura='B' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
            if (opcion.equals("C"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Censura='C' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
            if (opcion.equals("D"))
                sql = "SELECT Titulo,Año,Genero,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Censura='D' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
            if(!opcion.equals("..."))
                consulta(sql,ancho,centrar);
        }
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_censuraActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        String dato = ano.getText();
        int ancho[] = {340,100,60,60,100,70};
        Boolean centrar[] = {false,false,true,true,true,true};
        sql = "SELECT Titulo,Genero,Censura,Cantidad,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Año='"+dato+"' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
        try{
            consulta(sql,ancho,centrar);
        } 
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anoActionPerformed

    private void anoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoKeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
            if (((ano.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();        
    }//GEN-LAST:event_anoKeyTyped

    private void otrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosActionPerformed
        String opcion = otros.getSelectedItem().toString();
        try{
            if (opcion.equals("Mostrar todas las peliculas")){
                int ancho[] = {70,340,40,100,60,730,60,150,100,70};
                Boolean centrar[] = {true,false,true,false,true,false,true,false,true,true};
                sql = "SELECT idPelicula,Titulo,Año,Genero,Censura,Reparto,Cantidad,Distribuidor,Veces_Alquilada,Estatus "
                    +"FROM peliculas.peliculas WHERE Uso='Alquiler' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Peliculas dañadas")){
                int ancho[] = {70,340,40,100,60,730,60,150,100};
                Boolean centrar[] = {true,false,true,false,true,false,true,false,true};
                sql = "SELECT idPelicula,Titulo,Año,Genero,Censura,Reparto,Cantidad,Distribuidor,Veces_Alquilada FROM "
                     +"peliculas.peliculas WHERE Uso='Alquiler' AND Registro='Caducado' AND Condicion='Dañada' ORDER BY Titulo";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Pelicula mas alquilada")){
                int ancho[] = {340,40,100,60,730,150,60};
                Boolean centrar[] = {false,true,false,true,false,true,false};
                sql = "SELECT Titulo,Año,Genero,Censura,Reparto,MAX(Suma) AS Veces_Alquilada,Uso FROM (SELECT Titulo,Año,Genero,Censura,Reparto,SUM(Veces_Alquilada) "
                     +"AS Suma,Uso FROM peliculas.peliculas WHERE Veces_Alquilada>0 GROUP BY Titulo) AS Maximo";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Genero mas alquilado")){
                int ancho[] = {70,100};
                Boolean centrar[] = {false,true};
                sql = "SELECT Genero,MAX(Veces_Alquilada) AS Veces_Alquilada FROM (SELECT Genero,COUNT(Genero),SUM(Veces_Alquilada) AS Veces_Alquilada "
                     +"FROM peliculas.peliculas WHERE Veces_Alquilada>0 GROUP BY Genero) AS Maximo";
                consulta(sql,ancho,centrar);
            }
            if(opcion.equals("Cliente con mas multas")){
                int ancho[] = {70,150,150,75,65,300,200,50,90,110};
                Boolean centrar[] = {true,false,false,false,false,false,false,true,true,true};
                sql = "SELECT * FROM peliculas.clientes WHERE Num_Peliculas_Alq IN (select MAX(Num_Peliculas_Alq) from peliculas.clientes)";
                consulta(sql,ancho,centrar);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_otrosActionPerformed

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

    private void botrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botrasActionPerformed
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
    }//GEN-LAST:event_botrasActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        String dato = titulo.getText();
        int ancho[] = {70,70,100,60,100,70};
        Boolean centrar[] = {true,true,false,true,true,true};
        sql = "SELECT idPelicula,Cantidad,Genero,Censura,Veces_Alquilada,Estatus FROM peliculas.peliculas WHERE Uso='Alquiler' AND Titulo='"+dato+"' AND Registro='Vigente' ORDER BY Titulo AND Estatus";
        try{
            consulta(sql,ancho,centrar);
        } 
        catch(SQLException ex){
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tituloActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaAlquiler().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JButton atras;
    private javax.swing.JRadioButton baño;
    private javax.swing.JRadioButton bcensura;
    private javax.swing.JRadioButton bgenero;
    private javax.swing.JRadioButton botras;
    private javax.swing.JRadioButton btitulo;
    private javax.swing.JComboBox censura;
    private javax.swing.JTable consulta;
    private javax.swing.JComboBox genero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox otros;
    private javax.swing.ButtonGroup seleccion;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
